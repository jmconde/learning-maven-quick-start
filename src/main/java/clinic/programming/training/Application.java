package clinic.programming.training;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class Application {
    public int countWords(String words) {
        String[] separateWords = StringUtils.split(words, " ");
        return (separateWords == null) ? 0 : separateWords.length;
    }
    public  void greet() {
        List<String> greets = new ArrayList<>();
        greets.add("Hello!");
        for (String greet : greets) {
            System.out.println("Greeting: " + greet);
        }
    }
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
        Application app = new Application();
        app.greet();
        int count = app.countWords("I have four words");
        System.out.println("Word count: " + count);
    }
}
