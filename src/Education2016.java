public class Education2016 {
    private double noHighSchool;        // percentage of adults without HS diploma (0 to 100)
    private double employedLaborForce;   // percentage of adults with only a HS diploma
    private double someCollege;         // percentage of adults with some college
    private double bachelorsOrMore;     // percentage of adults with a bachelors or higher
    private int fips;
    private String county;
    private String state;

    public Education2016(double noHighSchool, double employedLaborForce, double someCollege, double bachelorsOrMore, int fips, String county, String state) {
        this.noHighSchool = noHighSchool;
        this.employedLaborForce = employedLaborForce;
        this.someCollege = someCollege;
        this.bachelorsOrMore = bachelorsOrMore;
        this.fips = fips;
        this.county = county;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Education2016{" +
                "noHighSchool=" + noHighSchool +
                ", employedLaborForce=" + employedLaborForce +
                ", someCollege=" + someCollege +
                ", bachelorsOrMore=" + bachelorsOrMore +
                ", fips=" + fips +
                ", county='" + county + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public double getNoHighSchool() {
        return noHighSchool;
    }

    public void setNoHighSchool(double noHighSchool) {
        this.noHighSchool = noHighSchool;
    }

    public double getEmployedLaborForce() {
        return employedLaborForce;
    }

    public void setEmployedLaborForce(double emplyedLaborForce) {
        this.employedLaborForce = emplyedLaborForce;
    }

    public double getSomeCollege() {
        return someCollege;
    }

    public void setSomeCollege(double someCollege) {
        this.someCollege = someCollege;
    }

    public double getBachelorsOrMore() {
        return bachelorsOrMore;
    }

    public void setBachelorsOrMore(double bachelorsOrMore) {
        this.bachelorsOrMore = bachelorsOrMore;
    }

}
