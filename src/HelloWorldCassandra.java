import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

public class HelloWorldCassandra {
    public static void main(String[] args){
        System.out.println("Hello, Cassandra!");

        Cluster cluster = null;
        try{
            cluster = Cluster.builder()
                    .addContactPoint("localhost")
                    .build();

            Session session = cluster.connect();

            ResultSet rs = session.execute("select release_version from system.local");
            Row row = rs.one();
            System.out.println(row.getString("release_version"));

            KeyspaceRepository sr = new KeyspaceRepository(session);
            sr.createKeyspace("library", "SimpleStrategy", 1);
            System.out.println("Create repository");

            sr.useKeyspace("library");
            System.out.println("Using repository library");

            TweetRepository tw = new TweetRepository(session);

            /*
            tw.createTable();
            System.out.println("Created table tweets");
            */

            Tweet t1 = new Tweet("mariana", "teste", "20-06-2019");
            Tweet t2 = new Tweet("andrea", "oi", "21-06-2019");
            Tweet t3 = new Tweet("melissa", "tudo", "22-06-2019");
            Tweet t4 = new Tweet("julia", "bom", "23-06-2019");
            Tweet t5 = new Tweet("teste", "?", "24-06-2019");
            tw.insertTweet(t1);
          //  tw.insertTweet(t2);
          //  tw.insertTweet(t3);
          //  tw.insertTweet(t4);
          //  tw.insertTweet(t5);
          //  System.out.println("Inserted tweets");

            /*
            sr.deleteKeyspace("library");
            System.out.println("Delete keyspace library");
            */

        }
        finally {
            if(cluster != null) cluster.close();
        }
    }
}
