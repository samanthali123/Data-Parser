public class Election2016 {
    private double demVotes;        // number of Democratic votes
    private double gopVotes;        // number of GOP votes
    private double totalVotes;      // number of total votes
    private int fips;
    private String county;
    private String state;

    public Election2016(double demVotes, double gopVotes, double totalVotes, int fips, String county, String state) {
        this.demVotes = demVotes;
        this.gopVotes = gopVotes;
        this.totalVotes = totalVotes;
        this.fips = fips;
        this.county = county;
        this.state = state;
    }

    public int getFips() {
        return fips;
    }

    public void setFips(int fips) {
        this.fips = fips;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Election2016{" +
                "demVotes=" + demVotes +
                ", gopVotes=" + gopVotes +
                ", totalVotes=" + totalVotes +
                ", fips=" + fips +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public double getDemVotes() {
        return demVotes;
    }

    public void setDemVotes(double demVotes) {
        this.demVotes = demVotes;
    }

    public double getGopVotes() {
        return gopVotes;
    }

    public void setGopVotes(double gopVotes) {
        this.gopVotes = gopVotes;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double totalVotes) {
        this.totalVotes = totalVotes;
    }

}
