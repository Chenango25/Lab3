import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class Main {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        String article = urlToString("http://erdani.com/tdpl/hamlet.txt");
        char[] special = {'!', '@', '#', '$', '%', '^', '&', '*'};
        //replaceall[]  (everything inside the square brackets will be removed, no comma needed
        String[] words = article.trim().split("\\s+");
        int wordcounter = words.length;
        System.out.println(wordcounter);
    }
}
