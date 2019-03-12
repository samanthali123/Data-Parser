import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author: Samantha Li
 */
public class Main {
    public static void main(String[] args) {
//        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
//        ArrayList<ElectionResult> out = Utils.parse2016PresidentialResults(data);
//        for (int i = 0; i < out.size(); i++) {
//            Election2016 election2016 = Utils.loadElectionData(out.get(i).getVotes_dem(), out.get(i).getVotes_gop(), out.get(i).getTotal_votes());
//            System.out.println(election2016.toString());
//        }

//        String data1 = Utils.readFileAsString("data/Education.csv");
//        ArrayList<Education2016> out1 = Utils.parse2016EducationResults(data1);
//        for (int i = 0; i < out1.size(); i++) {
//            Education2016 education2016 = Utils.loadEducationData(out1.get(i).getNoHighSchool(), out1.get(i).getEmployedLaborForce(), out1.get(i).getSomeCollege(), out1.get(i).getBachelorsOrMore());
//            System.out.println(education2016.toString());
//        }

//        String data2 = Utils.readFileAsString("data/Unemployment.csv");
//        ArrayList<Employment2016> out2 = Utils.parse2016EmploymentData(data2);
//        for (int i = 0; i < out2.size(); i++) {
//            Employment2016 employment2016 = Utils.loadEmploymentData(out2.get(i).getTotalLaborForce(), out2.get(i).getEmployedLaborForce(), out2.get(i).getUnemployedLaborForce(), out2.get(i).getUnemployedPercent());
//            System.out.println(employment2016.toString());
//        }

        String line = "FIPStxt,State,Area_name,Rural_urban_continuum_code_2013,Urban_influence_code_2013,Metro_2013,Civilian_labor_force_2007,Employed_2007,Unemployed_2007,Unemployment_rate_2007,Civilian_labor_force_2008,Employed_2008,Unemployed_2008,Unemployment_rate_2008,Civilian_labor_force_2009,Employed_2009,Unemployed_2009,Unemployment_rate_2009,Civilian_labor_force_2010,Employed_2010,Unemployed_2010,Unemployment_rate_2010,Civilian_labor_force_2011,Employed_2011,Unemployed_2011,Unemployment_rate_2011,Civilian_labor_force_2012,Employed_2012,Unemployed_2012,Unemployment_rate_2012,Civilian_labor_force_2013,Employed_2013,Unemployed_2013,Unemployment_rate_2013,Civilian_labor_force_2014,Employed_2014,Unemployed_2014,Unemployment_rate_2014,Civilian_labor_force_2015,Employed_2015,Unemployed_2015,Unemployment_rate_2015,Civilian_labor_force_2016,Employed_2016,Unemployed_2016,Unemployment_rate_2016,Civilian_labor_force_2017,Employed_2017,Unemployed_2017,Unemployment_rate_2017,Median_Household_Income_2016,Med_HH_Income_Percent_of_State_Total_2016\n";
        ArrayList<String> row = Utils.parseCSVLine(line);
        System.out.println();

    }



}
