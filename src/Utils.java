import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016PresidentialResults(String data) {
        ArrayList<ElectionResult> out = new ArrayList<>();
        String[] rows = data.split("\n");
        for (int i = 1; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {
                if (rows[i].contains("\"")) {
                    int index1 = rows[i].indexOf("\"");
                    int index2 = rows[i].indexOf("\"", index1);
                    String s = rows[i].substring(index1, index2);
                    s.replace(",", "");
                }
                String[] splitted = rows[i].split(",");

                out.add(new ElectionResult(splitted[1], splitted[2], splitted[3], splitted[4], splitted[5], splitted[6], splitted[7], splitted[8], splitted[9], splitted[10]));
            }
        }

        return out;
    }

}
