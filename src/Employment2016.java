public class Employment2016 {
    private int totalLaborForce;        // the total labor force for a county
    private int employedLaborForce;     // the employed labor force for a county
    private int unemployedLaborForce;   // the unemployed labor force for a county
    private double unemployedPercent;   // the percentage of unemployed (0-100)

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
