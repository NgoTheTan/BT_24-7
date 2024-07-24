import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName = "";
    private List<Person> list = new ArrayList<>();

    public Team(String teamName, List<Person> newlist) {
        this.teamName = teamName;
        list = newlist;
    }

    public void add(Person p) {
        list.add(p);
    }

    public void removeMember(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID().equalsIgnoreCase(id)) {
                list.remove(i);
            }
        }
    }

    public List<Person> getList() {
        return list;
    }

    public void setList(List<Person> list) {
        this.list = list;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String toString() {
        String res = teamName + "\n";
        for (int i = 0; i < list.size(); i++) {
            res = res + list.get(i).toString() + "\n";
        }
        return res;
    }

}