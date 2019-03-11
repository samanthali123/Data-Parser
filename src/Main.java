import com.sun.imageio.plugins.common.I18N;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/***
 * Main class for data parsers
 * @author: Samantha Li
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> rows = Utils.splitCVSFile("data/2016_Presidential_Results.csv");

        ArrayList<County> counties = new ArrayList<>();
        List<State> states =  new ArrayList<>();

        for (int i = 2; i < rows.size(); i++) {
            String name = getCountyName(i);
            System.out.println(name);
            int fips = getCountyFips(i);
            System.out.println(fips);
            Election2016 vote2016 = getElection2016Data(i);
            Education2016 educ206 = getEducation2016Data(i);
            Employment2016 employ2016 = getEmployment2016Data(i);
            County c = new County(name, fips, vote2016, educ206, employ2016);
            counties.add(c);

        }

        System.out.println(counties);

        State state = new State();
        state.setCounties(counties);
        //state.setName(getStateName());

        DataManager dm = new DataManager();
        dm.setStates(states);


        String line = "0,93003.0,130413.0,246588.0,0.37715947248,0.528870018006,\"37,410\",15.17%,AK,Alaska,2013\n";
        ArrayList<String> row = Utils.parseCSVLine(line);
        //System.out.println();

    }


    private static String getStateName(int i) {
        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        ArrayList<String> states = Utils.splitCVSFile(data);

        for (int j = 2; j < states.size(); j++) {
            if (!states.contains(states.get(j))) states.add(states.get(10));
        }
        return states.get(i);
    }

    private static String getCountyName(int i) {
        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        ArrayList<String> counties = Utils.splitCVSFile(data);

        for (int j = 2; j < counties.size(); j++) {
            if (!counties.contains(counties.get(j))) counties.add(counties.get(11));
        }
        return counties.get(i);
    }

    private static int getCountyFips(int i) {
        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        ArrayList<String> fips = Utils.splitCVSFile(data);

        for (int j = 2; j < fips.size(); j++) {
            if (!fips.contains(fips.get(j))) fips.add(fips.get(1));
        }
        return Integer.parseInt(fips.get(i));
    }

    private static Election2016 getElection2016Data(int i) {
        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        ArrayList<Election2016> out = Utils.parse2016PresidentialResults(data);
        Election2016 election2016 = Utils.loadElectionData(out.get(i).getDemVotes(), out.get(i).getDemVotes(), out.get(i).getGopVotes());
        return election2016;
    }

    private static Education2016 getEducation2016Data(int i) {
        String data1 = Utils.readFileAsString("data/Education.csv");
        ArrayList<Education2016> out1 = Utils.parse2016EducationResults(data1);
        Education2016 education2016 = Utils.loadEducationData(out1.get(i).getNoHighSchool(), out1.get(i).getEmployedLaborForce(), out1.get(i).getSomeCollege(), out1.get(i).getBachelorsOrMore());
        return education2016;
    }

    private static Employment2016 getEmployment2016Data(int i) {
        String data2 = Utils.readFileAsString("data/Unemployment.csv");
        ArrayList<Employment2016> out2 = Utils.parse2016EmploymentData(data2);
        Employment2016 employment2016 = Utils.loadEmploymentData(out2.get(i).getTotalLaborForce(), out2.get(i).getEmployedLaborForce(), out2.get(i).getUnemployedLaborForce(), out2.get(i).getUnemployedPercent());
        return employment2016;
    }


}
