import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author: Samantha Li
 */
public class Main {
    public static void main(String[] args) {
        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        ArrayList<ElectionResult> out = Utils.parse2016PresidentialResults(data);
        for (int i = 0; i < out.size(); i++) {
            System.out.println(out.get(i));
        }
    }

}
