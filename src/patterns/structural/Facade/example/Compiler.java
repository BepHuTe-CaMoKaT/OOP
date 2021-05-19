package patterns.structural.Facade.example;

import java.util.List;

public class Compiler {

    public static int compile(String input) throws Exception {

        Parser parser = new Parser();
        List<String> tokens = Tokenizer.tokenize(input);
        Node expression = parser.parse(tokens);

        return Generator.generate(expression);
    }
}
