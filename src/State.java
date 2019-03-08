import java.util.List;

public class State {
    private String name;                // state initials or name
    private List<County> counties;      // list of counties

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<County> getCounties() {
        return counties;
    }

    public void setCounties(List<County> counties) {
        this.counties = counties;
    }
}
