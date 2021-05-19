package patterns.structural.Facade.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Tokenizer {

    public static List<String> tokenize(String source) {

        ArrayList<String> tokens = new ArrayList<String>();

        StringTokenizer stringTokenizer = new StringTokenizer(source);
        while (stringTokenizer.hasMoreElements()) {
            tokens.add((String) stringTokenizer.nextElement());
        }
        return tokens;
    }
}
