import java.util.ArrayList;

public class County {
    private static ArrayList<County> counties = new ArrayList<County>();

    private String state;
    private String name;                // name of county
    private int fips;                   // US FIPS number (unique to county)
    private Election2016 vote2016;      // holds all of the 2016 election values
    private Education2016 educ206;      // holds all of the 2016 education data
    private Employment2016 employ2016;   // holds all of the 2016 education data


    public County(String state, String name, int fips, Election2016 vote2016, Education2016 educ206, Employment2016 employ2016) {
        this.state = state;
        this.name = name;
        this.fips = fips;
        this.vote2016 = vote2016;
        this.educ206 = educ206;
        this.employ2016 = employ2016;

        counties.add(this);
    }

    public static ArrayList<County> getCounties (State s) {
        ArrayList<County> matches = new ArrayList<>();
        for (County c : counties) {
            if (c.getState().equals(s)) matches.add(c);
        }
        return matches;
    }

    public static County getCounty(String toFind) {
        for (County c : counties) {
            if (c.getName().equals(toFind)) {
                return c;
            }
        }
        return null;
    }

    public static ArrayList<County> getCounties() {
        return counties;
    }

    public static void setCounties(ArrayList<County> counties) {
        County.counties = counties;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addCounty (County c) {
        counties.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public Election2016 getVote2016() {
        return vote2016;
    }

    public void setVote2016(Election2016 vote2016) {
        this.vote2016 = vote2016;
    }

    public Education2016 getEduc206() {
        return educ206;
    }

    public void setEduc206(Education2016 educ206) {
        this.educ206 = educ206;
    }

    public Employment2016 getEmploy2016() {
        return employ2016;
    }

    public void setEmploy2016(Employment2016 employ2016) {
        this.employ2016 = employ2016;
    }

    @Override
    public String toString() {
        return "County{" +
                "counties=" + counties +
                '}';
    }
}

