public class Employment2016 {
    private int totalLaborForce;        // the total labor force for a county
    private int employedLaborForce;     // the employed labor force for a county
    private int unemployedLaborForce;   // the unemployed labor force for a county
    private double unemployedPercent;   // the percentage of unemployed (0-100)
    private int fips;
    private String county;
    private String state;

    @Override
    public String toString() {
        return "Employment2016{" +
                "totalLaborForce=" + totalLaborForce +
                ", employedLaborForce=" + employedLaborForce +
                ", unemployedLaborForce=" + unemployedLaborForce +
                ", unemployedPercent=" + unemployedPercent +
                ", fips=" + fips +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Employment2016(int totalLaborForce, int employedLaborForce, int unemployedLaborForce, double unemployedPercent, int fips, String county, String state) {
        this.totalLaborForce = totalLaborForce;
        this.employedLaborForce = employedLaborForce;
        this.unemployedLaborForce = unemployedLaborForce;
        this.unemployedPercent = unemployedPercent;
        this.fips = fips;
        this.county = county;
        this.state = state;
    }

    public int getTotalLaborForce() {
        return totalLaborForce;
    }

    public void setTotalLaborForce(int totalLaborForce) {
        this.totalLaborForce = totalLaborForce;
    }

    public int getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(int employedLaborForce) {
        this.employedLaborForce = employedLaborForce;
    }

    public int getUnemployedLaborForce() {
        return unemployedLaborForce;
    }

    public void setUnemployedLaborForce(int unemployedLaborForce) {
        this.unemployedLaborForce = unemployedLaborForce;
    }

    public double getUnemployedPercent() {
        return unemployedPercent;
    }

    public void setUnemployedPercent(double unemployedPercent) {
        this.unemployedPercent = unemployedPercent;
    }

}
