import java.lang.String;
import java.util.UUID;
import com.datastax.driver.core.*;

public class Tweet {
    private UUID id;
    private String username;
    private String text;
    private LocalDate date;

    public Tweet (String username, String text, LocalDate date){
        this.username = username;
        this.text = text;
        this.date = date;
    }

    public String getuser(){
        return username;
    }

    public String gettext(){
        return text;
    }

    public LocalDate getdate(){
        return date;
    }
}
