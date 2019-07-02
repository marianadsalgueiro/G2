# INF1802-g2
/usr/java/jdk-9/bin/java -javaagent:/opt/idea-IC-182.4129.33/lib/idea_rt.jar=40029:/opt/idea-IC-182.4129.33/bin -Dfile.encoding=UTF-8 -classpath /home/treinamento/Downloads/G2/out/production/G2:/home/treinamento/.m2/repository/com/datastax/cassandra/cassandra-driver-core/3.7.1/cassandra-driver-core-3.7.1.jar:/home/treinamento/.m2/repository/io/netty/netty-handler/4.0.56.Final/netty-handler-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-buffer/4.0.56.Final/netty-buffer-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-common/4.0.56.Final/netty-common-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-transport/4.0.56.Final/netty-transport-4.0.56.Final.jar:/home/treinamento/.m2/repository/io/netty/netty-codec/4.0.56.Final/netty-codec-4.0.56.Final.jar:/home/treinamento/.m2/repository/com/google/guava/guava/19.0/guava-19.0.jar:/home/treinamento/.m2/repository/io/dropwizard/metrics/metrics-core/3.2.2/metrics-core-3.2.2.jar:/home/treinamento/.m2/repository/org/slf4j/slf4j-api/1.7.25/slf4j-api-1.7.25.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-ffi/2.1.7/jnr-ffi-2.1.7.jar:/home/treinamento/.m2/repository/com/github/jnr/jffi/1.2.16/jffi-1.2.16.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm/5.0.3/asm-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-commons/5.0.3/asm-commons-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-analysis/5.0.3/asm-analysis-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-tree/5.0.3/asm-tree-5.0.3.jar:/home/treinamento/.m2/repository/org/ow2/asm/asm-util/5.0.3/asm-util-5.0.3.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-x86asm/1.0.2/jnr-x86asm-1.0.2.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-posix/3.0.44/jnr-posix-3.0.44.jar:/home/treinamento/.m2/repository/com/github/jnr/jnr-constants/0.9.9/jnr-constants-0.9.9.jar:/home/treinamento/.m2/repository/org/twitter4j/twitter4j-core/4.0.7/twitter4j-core-4.0.7.jar:/home/treinamento/.m2/repository/org/twitter4j/twitter4j-stream/4.0.7/twitter4j-stream-4.0.7.jar HelloWorldCassandra
Hello, Cassandra!
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
3.11.4
createKeyspace() - init
createKeyspace() - end
Create repository
Using repository library
createTable() - init
CREATE TABLE IF NOT EXISTS id uuid, username text, text text, createdDate date, source text, isTruncated boolean, latitude float, longitude float, isFavorited boolean, categoria text, primary key (categoria, id);
createTable() - end
insertTweet() - init
INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, categoria) VALUES ();
insertTweet() - end
insertTweet() - init
INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, categoria) VALUES ();
insertTweet() - end
insertTweet() - init
INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, categoria) VALUES ();
insertTweet() - end
insertTweet() - init
INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, categoria) VALUES ();
insertTweet() - end
insertTweet() - init
INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, categoria) VALUES ();
insertTweet() - end
selectAll() - init
SELECT * FROM tweetsbycategoria;
Tweet = 06964327-561e-4d30-8faf-db4e848d8075, teste, odeio a reforma da previdencia, 2019-07-02, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 4f42878b-c22d-45d1-8581-3c16171cce7d, melissa, abaixo a reforma da previdencia, 2019-07-01, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 6d89a858-8fbd-4b74-9573-c8353f33bb51, andrea, reforma da previdencia eh horrivel, 2019-06-28, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 845c87b4-53f5-42e0-80df-7409c4f2f51e, mariana, reforma da previdencia, 2019-06-27, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = d4e40cb0-bcac-4ea5-b1a1-2512811c94ee, julia, concordo com a reforma da previdencia, 2019-06-29, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
selectAll() - end
insertTweet() - init
INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, categoria) VALUES ();
insertTweet() - end
selectByCategoria() - init
Tweet = d0aa3b72-39fa-47a1-8363-a310875153d0, teste2, vou investir em bitcoin, 2019-07-02, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, economia
selectByCategoria() - end
insertTweet() - init
INSERT INTO tweetsbycategoria(id, username, text, createdDate, source, isTruncated, latitude, longitude, isFavorited, categoria) VALUES ();
insertTweet() - end
selectAll() - init
SELECT * FROM tweetsbycategoria;
Tweet = 06964327-561e-4d30-8faf-db4e848d8075, teste, odeio a reforma da previdencia, 2019-07-02, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 4f42878b-c22d-45d1-8581-3c16171cce7d, melissa, abaixo a reforma da previdencia, 2019-07-01, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 6d89a858-8fbd-4b74-9573-c8353f33bb51, andrea, reforma da previdencia eh horrivel, 2019-06-28, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 845c87b4-53f5-42e0-80df-7409c4f2f51e, mariana, reforma da previdencia, 2019-06-27, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = d4e40cb0-bcac-4ea5-b1a1-2512811c94ee, julia, concordo com a reforma da previdencia, 2019-06-29, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 231ccf36-7e01-4743-890b-88900b8f14fe, teste3, bitcoin sucks, 2019-07-01, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, false, economia
Tweet = d0aa3b72-39fa-47a1-8363-a310875153d0, teste2, vou investir em bitcoin, 2019-07-02, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, economia
selectAll() - end
deleteTweetByCategoria() - init
deleteTweetByCategoria() - end
selectAll() - init
SELECT * FROM tweetsbycategoria;
Tweet = 06964327-561e-4d30-8faf-db4e848d8075, teste, odeio a reforma da previdencia, 2019-07-02, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 4f42878b-c22d-45d1-8581-3c16171cce7d, melissa, abaixo a reforma da previdencia, 2019-07-01, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 6d89a858-8fbd-4b74-9573-c8353f33bb51, andrea, reforma da previdencia eh horrivel, 2019-06-28, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = 845c87b4-53f5-42e0-80df-7409c4f2f51e, mariana, reforma da previdencia, 2019-06-27, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
Tweet = d4e40cb0-bcac-4ea5-b1a1-2512811c94ee, julia, concordo com a reforma da previdencia, 2019-06-29, ., false, GeoLocation{latitude=20.59368324279785, longitude=78.96288299560547}, true, politica
selectAll() - end

Process finished with exit code 0
