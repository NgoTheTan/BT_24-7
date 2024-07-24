import java.util.ArrayList;
import java.util.List;

public class TeamManagement {
    private List<Team> list = new ArrayList<>();

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

    public void welcomeTeam(Team team) {
        if (list.contains(team)) {
            System.out.println("***************WELCOME TO***************");
            int counter = 0;
            for (int i = 0; i < (40 - team.getTeamName().length()) / 2; i++) {
                System.out.print("*");
                counter++;
            }
            System.out.print(team.getTeamName());
            counter = counter + team.getTeamName().length();
            for (int i = 0; i < 40 - counter; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        } else {
            System.out.println("Your team is not on the list!");
        }
    }
}