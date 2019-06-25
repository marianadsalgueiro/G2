import java.util.ArrayList;
import java.util.List;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.LocalDate;
import java.lang.String;

public class TweetRepository {
    private static final String TABLE_NAME = "tweets";
    private Session session;

    public TweetRepository(Session session){
        this.session = session;
    }

    //creates the tweets table
    public void createTable(){
        System.out.println("createTable() - init");

        StringBuilder sb = new StringBuilder("CREATE TABLE IF NOT EXISTS ")
                .append(TABLE_NAME).append("(")
                .append("username text PRIMARY KEY, ")
                .append("text text, ")
                .append("date date);");

        final String query = sb.toString();
        session.execute(query);

        System.out.println("createTable() - end");
    }

    //insert a tweet in the table tweets
    public void insertTweet(Tweet tw){
        System.out.println("insertTweet() - init");

        System.out.println(tw.getuser());
        System.out.println(tw.gettext());
        System.out.println(tw.getdate());

        StringBuilder sb = new StringBuilder("INSERT INTO ")
                .append(TABLE_NAME).append("(username, text, date) ")
                .append(" VALUES ('").append(tw.getuser()).append("', '")
                .append(tw.gettext()).append("', '")
                .append(tw.getdate()).append("');");

        final String query = sb.toString();
        session.execute(query);

        System.out.println("insertTweet() - end");
    }

    //select all books from books
    public List<Tweet> selectAll(){
        System.out.println("selectAll() - init");

        StringBuilder sb = new StringBuilder("SELECT * FROM ").append(TABLE_NAME);

        final String query = sb.toString();
        ResultSet rs = session.execute(query);

        List<Tweet> tweets = new ArrayList<>();

        for(Row r:rs) {
            Tweet tw = new Tweet(r.getString("username"), r.getString("text"), r.getLocalDate("date"));
            System.out.println("Tweet = " + r.getString("username") + ", "
                    + r.getString("text") + ", "
                    + r.getString("date"));

            tweets.add(tw);
        }

        System.out.println("selectAll() - end");

        return tweets;
    }

    //delete a book by title
    public void deleteTweet(String text){
        System.out.println("deleteTweet() - init");

        StringBuilder sb = new StringBuilder("DELETE FROM ")
                .append(TABLE_NAME)
                .append(" WHERE text = '")
                .append(text).append("';");

        final String query = sb.toString();
        session.execute(query);

        System.out.println("deleteTweet() - end");
    }

    //delete table
    public void deleteTable(String tableName){
        System.out.println("deleteTable() - init");

        StringBuilder sb = new StringBuilder("DROP TABLE IF EXISTS ").append(tableName);

        final String query = sb.toString();
        session.execute(query);

        System.out.println("deleteTable() - end");
    }

}
