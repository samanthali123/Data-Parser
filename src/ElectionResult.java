public class ElectionResult {
    double votes_dem,votes_gop,total_votes,per_dem,per_gop, per_point_diff;
    int diff;
    String state_abbr,county_name;
    int combined_fips;
    //votes_dem,votes_gop,total_votes,per_dem,per_gop,diff,per_point_diff,state_abbr,county_name,combined_fips
    public ElectionResult(double votes_dem, double votes_gop, double total_votes, double per_dem, double per_gop, int diff, double per_point_diff, String state_abbr, String county_name, int combined_fips) {
        this.votes_dem = votes_dem;
        this.votes_gop = votes_gop;
        this.total_votes = total_votes;
        this.per_dem = per_dem;
        this.per_gop = per_gop;
        this.diff = diff;
        this.per_point_diff = per_point_diff;
        this.state_abbr = state_abbr;
        this.county_name = county_name;
        this.combined_fips = combined_fips;
    }

    public double getVotes_dem() {
        return votes_dem;
    }

    public void setVotes_dem(double votes_dem) {
        this.votes_dem = votes_dem;
    }

    public double getVotes_gop() {
        return votes_gop;
    }

    public void setVotes_gop(double votes_gop) {
        this.votes_gop = votes_gop;
    }

    public double getTotal_votes() {
        return total_votes;
    }

    public void setTotal_votes(double total_votes) {
        this.total_votes = total_votes;
    }

    public double getPer_dem() {
        return per_dem;
    }

    public void setPer_dem(double per_dem) {
        this.per_dem = per_dem;
    }

    public double getPer_gop() {
        return per_gop;
    }

    public void setPer_gop(double per_gop) {
        this.per_gop = per_gop;
    }

    public double getPer_point_diff() {
        return per_point_diff;
    }

    public void setPer_point_diff(double per_point_diff) {
        this.per_point_diff = per_point_diff;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public String getState_abbr() {
        return state_abbr;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String county_name) {
        this.county_name = county_name;
    }

    public int getCombined_fips() {
        return combined_fips;
    }

    public void setCombined_fips(int combined_fips) {
        this.combined_fips = combined_fips;
    }

    @Override
    public String toString() {
        return "ElectionResult{" +
                "votes_dem=" + votes_dem +
                ", votes_gop=" + votes_gop +
                ", total_votes=" + total_votes +
                ", per_dem=" + per_dem +
                ", per_gop=" + per_gop +
                ", per_point_diff=" + per_point_diff +
                ", diff=" + diff +
                ", state_abbr='" + state_abbr + '\'' +
                ", county_name='" + county_name + '\'' +
                ", combined_fips=" + combined_fips +
                '}';
    }
}

