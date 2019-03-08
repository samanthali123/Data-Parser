public class Election2016 {
    private double demVotes;        // number of Democratic votes
    private double gopVotes;        // number of GOP votes
    private double totalVotes;      // number of total votes

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

    @Override
    public String toString() {
        return "Election2016{" +
                "demVotes=" + demVotes +
                ", gopVotes=" + gopVotes +
                ", totalVotes=" + totalVotes +
                '}';
    }
}
