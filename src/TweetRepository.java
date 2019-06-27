import java.util.ArrayList;
import java.util.List;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.utils.UUIDs;
import java.lang.String;

public class TweetRepository {
    private static final String TABLE_NAME = "tweets";
    private static final String TABLE_NAME_BY_CATEGORIA = TABLE_NAME + "bycategoria";
    private Session session;

    public TweetRepository(Session session){
        this.session = session;
    }

    //creates the tweets table
    public void createTable(){
        System.out.println("createTable() - init");

        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
                .append(TABLE_NAME).append("(")
                .append("id uuid PRIMARY KEY, ")
                .append("username text, ")
                .append("text text, ")
                .append("createdDate date);");

        System.out.println("CREATE TABLE IF NOT EXISTS id uuid PRIMARY KEY, username text, text text, createdDate date);");
        final String query = sb.toString();
        session.execute(query);

        System.out.println("createTable() - end");
    }

    //creates the tweetsbycategoria table
    public void createTableTweetsByCategoria(){
        //tabela criada para pegar tweets que contenham palavras pertencentes a uma categoria, por exemplo, se um tweet contiver as palavras 'Reforma da Previdencia' a categoria é politica
        //podemos avaliar oq as pessoas estao falando em cada categoria
        System.out.println("createTable() - init");

        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
                .append(TABLE_NAME_BY_CATEGORIA).append("(")
                .append("id uuid, ")
                .append("username text, ")
                .append("text text, ")
                .append("createdDate date, ")
                .append("source text, ")
                .append("isTruncated boolean, ")
                .append("latitude float, ")
                .append("longitude float, ")
                .append("isFavorited boolean, ")
                .append("contributors list<text>, ")
                .append("categoria text, ")
                .append("primary key (categoria));");

        System.out.println("CREATE TABLE IF NOT EXISTS id uuid, username text, text text, createdDate date, source text, isTruncated boolean, latitude float, longitude float, isFavorited boolean, contributors list<text>, categoria text, primary key (categoria));");
        final String query = sb.toString();
        session.execute(query);

        System.out.println("createTable() - end");
    }

    //insert a row in the table tweets
    public void insertTweet(Tweet tw){
        System.out.println("insertTweet() - init");

        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append(TABLE_NAME).append("(id, username, text, createdDate) ")
                .append(" VALUES (").append(tw.getId()).append(", '")
                .append(tw.getuser()).append("', '")
                .append(tw.gettext()).append("', '")
                .append(tw.getcreatedDate()).append("');");

        System.out.println("INSERT INTO tweets(id, username, text, date) VALUES ();");
        final String query = sb.toString();
        session.execute(query);

        System.out.println("insertTweet() - end");
    }

    //insert a row in the table tweetsbycategoria
    public void insertTweetbycategoria(Tweet tw){
        System.out.println("insertTweet() - init");

        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append(TABLE_NAME_BY_CATEGORIA).append("(id, username, text, createddate, source, istruncated, latitude, longitude, isfavorited, contributors, categoria) ")
                .append(" VALUES (").append(tw.getId()).append(", '")
                .append(tw.getuser()).append("', '")
                .append(tw.gettext()).append("', '")
                .append(tw.getcreatedDate()).append("', '")
                .append(tw.getsource()).append("', ")
                .append(tw.isTruncated()).append(", ")
                .append(tw.getGeoLocation().getLatitude()).append(", ")
                .append(tw.getGeoLocation().getLongitude()).append(", ")
                .append(tw.isFavorited()).append(", ")
                .append(tw.getContributors()).append(", '")
                .append(tw.getCategoria())
                .append("');");

        System.out.println("INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, contributors, categoria) VALUES ();");
        final String query = sb.toString();
        session.execute(query);

        System.out.println("insertTweet() - end");
    }

    public List<Tweet> selectAll(){
        System.out.println("selectAll() - init");

        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME);

        System.out.println("SELECT * FROM tweets;");
        final String query = sb.toString();
        ResultSet rs = session.execute(query);

        List<Tweet> tweets = new ArrayList<>();

        for(Row r:rs) {
            //Tweet tw = new Tweet(r.getUUID("id"), r.getString("username"), r.getString("text"), r.getDate("date"));
            System.out.println("Tweet = " + r.getUUID("id") + ", "
                    + r.getString("username") + ", "
                    + r.getString("text") + ", "
                    + r.getDate("date"));

            //tweets.add(tw);
        }

        System.out.println("selectAll() - end");

        return tweets;
    }

    public void deleteTweet(Tweet tw){
        System.out.println("deleteTweet() - init");

        StringBuilder sb = new StringBuilder("DELETE FROM ")
                .append(TABLE_NAME)
                .append(" WHERE id = ")
                .append(tw.getId()).append(";");

        System.out.println("DELETE FROM tweets WHERE id = ;");
        final String query = sb.toString();
        session.execute(query);

        System.out.println("deleteTweet() - end");
    }

    public void deleteTable(String tableName){
        System.out.println("deleteTable() - init");

        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ").append(tableName);

        System.out.println("DROP TABLE IF EXISTS tweets;");
        final String query = sb.toString();
        session.execute(query);

        System.out.println("deleteTable() - end");
    }

}
