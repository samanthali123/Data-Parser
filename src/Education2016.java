public class Education2016 {
    private double noHighSchool;        // percentage of adults without HS diploma (0 to 100)
    private double employedLaborForce;   // percentage of adults with only a HS diploma
    private double someCollege;         // percentage of adults with some college
    private double bachelorsOrMore;     // percentage of adults with a bachelors or higher

    public Education2016(double noHighSchool, double employedLaborForce, double someCollege, double bachelorsOrMore) {
        this.noHighSchool = noHighSchool;
        this.employedLaborForce = employedLaborForce;
        this.someCollege = someCollege;
        this.bachelorsOrMore = bachelorsOrMore;
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

    @Override
    public String toString() {
        return "Education2016{" +
                "noHighSchool=" + noHighSchool +
                ", employedLaborForce=" + employedLaborForce +
                ", someCollege=" + someCollege +
                ", bachelorsOrMore=" + bachelorsOrMore +
                '}';
    }
}
