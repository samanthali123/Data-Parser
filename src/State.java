import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;                // state initials or name
    private List<County> counties = new ArrayList<>();      // list of counties

    public State(String name) {
        this.name = name;
    }

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

    public County getCountyByName (String name) {
        for (int i = 0; i < counties.size(); i++) {
            if (counties.get(i).getName().equals(name)) return counties.get(i);
        }
        return null;
    }

    public void addCounty (County c) {
        counties.add(c);
    }

    public boolean hasCounty (String name) {
        for (int i = 0; i < counties.size(); i++) {
            if (counties.get(i).getName().equals(name)) return true;
        }
        return false;
    }
}
