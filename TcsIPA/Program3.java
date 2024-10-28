package TcsIPA;

import java.util.Scanner;

class Player {
    private int playerId;
    private String skill;
    private String level;
    private int points;

    Player(int playerId, String skill, String level, int points) {
        this.playerId = playerId;
        this.skill = skill;
        this.level = level;
        this.points = points;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setSkill (String skill){
        this.skill = skill;
    }

    public void setLevel (String level){
        this.level = level;
    }

    public void setPoints (int points){
        this.points = points;
    }

    public int getPlayerId(){ return playerId;}
    public String getSkill(){ return skill;}
    public String getLevel(){ return level;}
    public int getPoints(){ return points;}

}

public class Program3 {
    public static void main(String[] args){
        Player[] players = new Player[4];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<4;i++){
            int playerId = Integer.parseInt(sc.nextLine());
            String skill = sc.nextLine();
            String level = sc.nextLine();
            int points = Integer.parseInt(sc.nextLine());

            players[i] = new Player(playerId,skill, level, points);
        }

        String inputSkill = sc.nextLine();
        int result = findPointsForGivenSkill(players, inputSkill);
        if (result > 0) {
            System.out.println(result);
        } else {
            System.out.println("The given Skill is not available");
        }

        String inputLevel = sc.nextLine();
        Player result1 = getPlayerBasedOnLevel(players, inputSkill, inputLevel);
        if(result1 != null){
            System.out.println(result1.getPlayerId());
        } else {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }

    private static Player getPlayerBasedOnLevel(Player[] players, String inputSkill, String inputLevel) {
        Player result = null;
        for(Player player :players){
            if(player.getSkill().equalsIgnoreCase(inputSkill) && player.getLevel().equalsIgnoreCase(inputLevel) && player.getPoints() >= 20){
                result = player;
            }
        }
        return result;
    }

    public static int findPointsForGivenSkill(Player[] players, String skill){
        int result = 0;

        for(Player player : players){
            if(player.getSkill().equalsIgnoreCase(skill)){
                result += player.getPoints();
            }
        }
        return result;
    }

}
