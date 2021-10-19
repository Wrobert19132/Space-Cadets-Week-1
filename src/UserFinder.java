import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;

import java.io.IOException;

public class UserFinder {
    final static String BASE_URL = "https://www.ecs.soton.ac.uk/people/";

    public User loadUser(String username) throws IOException{
        Document doc = Jsoup.connect(BASE_URL + username).get();
        return new User(doc.select("\t[property=name]").text(),
                doc.select("\t[property=description]").text(),
                doc.select("\t[property=telephone]").text(),
                doc.select("\t[property=email]").text()
        );
    }
    public boolean nameInvalid(String username) {
        return !username.matches("\\w\\w\\w");
    }
}
