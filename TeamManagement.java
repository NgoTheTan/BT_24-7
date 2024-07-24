import java.util.ArrayList;
import java.util.List;

public class TeamManagement {
    private List<Team> list = new ArrayList<>();

    public TeamManagement() {

    }

    public TeamManagement(List<Team> newlist) {
        list = newlist;
    }

    public void add(Team p) {
        list.add(p);
    }

    public void removeMember(String teamName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTeamName().equalsIgnoreCase(teamName)) {
                list.remove(i);
            }
        }
    }

    public List<Team> getList() {
        return list;
    }

    public void setList(List<Team> list) {
        this.list = list;
    }

}