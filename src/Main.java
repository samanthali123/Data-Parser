import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author: Samantha Li
 */
public class Main {
    public static void main(String[] args) {

    }

    public void loadAllData (String electionFile, String educationFile, String unemploymentFile) {
        ArrayList<String> electionRawLines = Utils.parseCSVLine(electionFile);
        ArrayList<String> educationRawLines = Utils.parseCSVLine(educationFile);
        ArrayList<String> unemploymentRawLines = Utils.parseCSVLine(unemploymentFile);


    }
}