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

        String data2 = Utils.readFileAsString("data/Unemployment.csv");
        ArrayList<Employment2016> out2 = Utils.parse2016EmploymentData(data2);
        for (int i = 0; i < out2.size(); i++) {
            Employment2016 employment2016 = Utils.loadEmploymentData(out2.get(i).getTotalLaborForce(), out2.get(i).getEmployedLaborForce(), out2.get(i).getUnemployedLaborForce(), out2.get(i).getUnemployedPercent());
            System.out.println(employment2016.toString());
        }

        String line = "00000,US,United States,,,,\"152,191,093\",\"145,156,134\",\"7,034,959\",4.6,153761095,144860350,8900745,5.8,\"153,825,455\",\"139,594,698\",\"14,230,757\",9.3,\"154,270,492\",\"139,408,092\",\"14,862,400\",9.6,\"154,606,066\",\"140,765,697\",\"13,840,369\",9.0,\"155,118,904\",\"142,600,247\",\"12,518,657\",8.1,\"155,485,443\",\"144,018,031\",\"11,467,412\",7.4,\"156,098,972\",\"146,470,452\",\"9,628,520\",6.2,\"157,044,310\",\"148,746,591\",\"8,297,719\",5.3,\"158,921,892\",\"151,183,680\",\"7,738,212\",4.9,\"160,588,515\",\"153,594,100\",\"6,994,415\",4.4,\"$57,617\",";
        ArrayList<String> row = Utils.parseCSVLine(line);
        //System.out.println();

    }



}
