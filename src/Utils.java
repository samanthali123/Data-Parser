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

    public static ArrayList<Election2016> parse2016PresidentialResults(String data) {
        ArrayList<Election2016> out = new ArrayList<>();
        String[] rows = data.split("\n");
        for (int i = 1; i < rows.length; i++) {
            for (int j = 0; j < rows[i].length(); j++) {

                String[] splitted = rows[i].split(",");
                //System.out.println("length = " + splitted.length);

                double votes_dem = Double.parseDouble(splitted[1]), votes_gop = Double.parseDouble(splitted[2]), total_votes = Double.parseDouble(splitted[3]), per_dem = Double.parseDouble(splitted[4]), per_gop = Double.parseDouble(splitted[5]);

                loadElectionData(votes_dem, votes_gop, total_votes);
                Election2016 election2016 = new Election2016(votes_dem, votes_gop, total_votes);
                out.add(election2016);

            }
        }
        return out;
    }

    public static Election2016 loadElectionData(double votes_dem, double votes_gop, double total_votes) {
        Election2016 election2016 = new Election2016(votes_dem, votes_gop, total_votes);
        return election2016;
    }

    public static ArrayList<Education2016> parse2016EducationResults(String data) {
        ArrayList<Education2016> out = new ArrayList<>();
        String[] rows = data.split("\n");
        for (int i = 13; i < rows.length; i++) {
            String[] split = rows[i].split(",");
            double noHighSchool = 0, employedLaborForce = 0, someCollege = 0, bachelorsOrMore = 0;

            if (!split[split.length - 4].equals("") && !split[split.length - 3].equals("") && !split[split.length - 2].equals("") && !split[split.length - 1].equals("")) {
                noHighSchool = Double.parseDouble(split[split.length - 4]);
                employedLaborForce = Double.parseDouble(split[split.length - 3]);
                someCollege = Double.parseDouble(split[split.length - 2]);
                bachelorsOrMore = Double.parseDouble(split[split.length - 1]);
            }

            loadEducationData(noHighSchool, employedLaborForce, someCollege, bachelorsOrMore);
            Education2016 education2016 = new Education2016(noHighSchool, employedLaborForce, someCollege, bachelorsOrMore);
            out.add(education2016);

        }
        return out;
    }


    public static Education2016 loadEducationData(double noHighSchool, double employedLaborForce, double someCollege, double bachelorsOrMore) {
        Education2016 education2016 = new Education2016(noHighSchool, employedLaborForce, someCollege, bachelorsOrMore);
        return education2016;
    }

    public static ArrayList<Employment2016> parse2016EmploymentData(String data) {
        ArrayList<Employment2016> out = new ArrayList<>();
        ArrayList<String> parsedLine = new ArrayList<>();
        String[] rows = data.split("\n");
        for (int i = 8; i < rows.length; i++) {
            parsedLine = parseCSVLine(rows[i]);
            int totalLaborForce = 0, employedLaborForce = 0, unemployedLaborForce = 0;
            double unemployedPercent = 0;
            if (!parsedLine.get(42).equals("")) totalLaborForce = Integer.parseInt(parsedLine.get(42).trim().replaceAll(",", ""));
            if (!parsedLine.get(43).equals("")) employedLaborForce = Integer.parseInt(parsedLine.get(43).trim().replaceAll(",", ""));
            if (!parsedLine.get(44).equals("")) unemployedLaborForce = Integer.parseInt(parsedLine.get(44).trim().replaceAll(",", ""));
            if (!parsedLine.get(45).equals("")) unemployedPercent = Double.parseDouble(parsedLine.get(45).trim());

            loadEmploymentData(totalLaborForce, employedLaborForce, unemployedLaborForce, unemployedPercent);
            out.add(new Employment2016(totalLaborForce, employedLaborForce, unemployedLaborForce, unemployedPercent));
        }
        return out;
    }

    public static ArrayList<String> parseCSVLine(String line) {
        ArrayList<String> out = new ArrayList<>();
        boolean inQuote = false;
        boolean isQuotation = false;
        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (c == '"') {
                if (inQuote) {
                    inQuote = false;
                    isQuotation = true;
                    out.add(sb.toString());
                    sb = new StringBuilder();
                } else {
                    inQuote = true;
                    isQuotation = false;
                }
            } else if (c == ',') {
                if (!inQuote && !isQuotation) {
                    out.add(sb.toString());
                    sb = new StringBuilder();
                } else if (!isQuotation) {
                    sb.append(c);
                }
                isQuotation = false;
            } else {
                isQuotation = false;
                sb.append(c);
            }
        }

        if (sb.length() != 0) {
            out.add(sb.toString());
        }
        return out;
    }

    public static Employment2016 loadEmploymentData(int totalLaborForce, int employedLaborForce, int unemployedLaborForce, double unemployedPercent) {
        Employment2016 employment2016 = new Employment2016(totalLaborForce, employedLaborForce, unemployedLaborForce, unemployedPercent);
        return employment2016;
    }
}
