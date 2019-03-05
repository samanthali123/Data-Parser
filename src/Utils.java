import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

    public static String removeCharAt(String str, Integer n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }

    public static ArrayList<ElectionResult> parse2016PresidentialResults(String data) {
        ArrayList<ElectionResult> out = new ArrayList<>();
        String[] rows = data.split("\n");
        for (int i = 1; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {

                String[] splitted = rows[i].split(",");
                //System.out.println("length = " + splitted.length);

                double votes_dem = Double.parseDouble(splitted[1]), votes_gop = Double.parseDouble(splitted[2]), total_votes = Double.parseDouble(splitted[3]), per_dem = Double.parseDouble(splitted[4]), per_gop = Double.parseDouble(splitted[5]);

                String s1 = "";
                if (splitted.length == 12) {
                    s1 = splitted[6] + splitted[7];

                    while (s1.contains("\"")) {
                        s1 = s1.replace("\"", "");
                    }
                    int diff = Integer.parseInt(s1);

                    String s2 = splitted[8].replace("%", "");
                    double per_point_diff = Double.parseDouble(s2);

                    String state_abbr = splitted[9], county_name = splitted[10];

                    int combined_fips = Integer.parseInt(splitted[11]);

                    out.add(new ElectionResult(votes_dem, votes_gop, total_votes, per_dem, per_gop, diff, per_point_diff, state_abbr, county_name, combined_fips));

                } else if (splitted.length == 10){
                    s1 = splitted[6];

                    while (s1.contains("\"")) {
                        s1 = s1.replace("\"", "");
                    }
                    int diff = Integer.parseInt(s1);

                    String s2 = splitted[7].replace("%", "");
                    double per_point_diff = Double.parseDouble(s2);

                    String state_abbr = splitted[8], county_name = splitted[9];

                    int combined_fips = Integer.parseInt(splitted[10]);

                    out.add(new ElectionResult(votes_dem, votes_gop, total_votes, per_dem, per_gop, diff, per_point_diff, state_abbr, county_name, combined_fips));

                } else if (splitted.length == 13) {
                    s1 = splitted[6] + splitted[7] + splitted[8];
                    while (s1.contains("\"")) {
                        s1 = s1.replace("\"", "");
                    }
                    int diff = Integer.parseInt(s1);

                    String s2 = splitted[9].replace("%", "");
                    double per_point_diff = Double.parseDouble(s2);

                    String state_abbr = splitted[10], county_name = splitted[11];

                    int combined_fips = Integer.parseInt(splitted[12]);

                    out.add(new ElectionResult(votes_dem, votes_gop, total_votes, per_dem, per_gop, diff, per_point_diff, state_abbr, county_name, combined_fips));


                }



                }
            }

            return out;

        }
}
