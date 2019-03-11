import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private List<State> states = new ArrayList<>();     //list of states

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public boolean hasState (String name) {
        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).getName().equals(name)) return true;
        }
        return false;
    }

    public void addState (State s) {
        states.add(s);
    }

    public State getStateByName (String name) {
        for (int i = 0; i < states.size(); i++) {
            if (states.get(i).getName().equals(name)) return states.get(i);
        }
        return null;
    }

    public void parseElectionResults (String data) {
        String line = ",votes_dem,votes_gop,total_votes,per_dem,per_gop,diff,per_point_diff,state_abbr,county_name,combined_fips\n";

        String demVotes = "votes_dem", gopVotes = "votes_gop", totalVotes = "total_votes", countyName = "county_name", stateAbbr = "state_abbr";

        String[] lines = data.split("\n");
        ArrayList<String> header = Utils.parseCSVLine(lines[0]);

        int demVotesIndex = header.indexOf(demVotes);
        int gopVotesIndex = header.indexOf(gopVotes);
        int totalVotesIndex = header.indexOf(totalVotes);
        int countyNameIndex = header.indexOf(countyName);
        int stateAbbrIndex = header.indexOf(stateAbbr);

        for (int i = 1; i < lines.length; i++) {
            ArrayList<String> parsed = Utils.parseCSVLine(lines[i]);
            Election2016 election2016 = new Election2016(
                    Double.parseDouble(parsed.get(demVotesIndex)),
                    Double.parseDouble(parsed.get(gopVotesIndex)),
                    Double.parseDouble(parsed.get(totalVotesIndex))

            );
            parsed.get(countyNameIndex);
            parsed.get(stateAbbrIndex);

        }
    }
}
