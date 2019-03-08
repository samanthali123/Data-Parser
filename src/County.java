public class County {
    private String name;                // name of county
    private int fips;                   // US FIPS number (unique to county)
    private Election2016 vote2016;      // holds all of the 2016 election values
    private Education2016 educ206;      // holds all of the 2016 education data

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

    public Employment2016 getEmply2016() {
        return emply2016;
    }

    public void setEmply2016(Employment2016 emply2016) {
        this.emply2016 = emply2016;
    }

    private Employment2016 emply2016;   // holds all of the 2016 education data
}
