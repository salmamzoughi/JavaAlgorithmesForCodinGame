package DeepAndShadowCopy;

import java.util.LinkedList;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        LinkedList<Player> players1 = new LinkedList<>();
        Player p1 = new Player();
        p1.setBattingAverage(46.7f);
        p1.setWorldRank(4);
        Player p2 = new Player();
        p2.setBattingAverage(56.9f);
        p2.setWorldRank(1);
        players1.add(p1);
        players1.add(p2);
        LinkedList<Player> players2 = new LinkedList<>();
        for (Player p : players1) {
            players2.add(p);
        }
        System.out.println("players1 before set****"+ players1.get(0).getWorldRank());
        players2.get(0).setWorldRank(5);
        System.out.println("players1 after set****"+ players1.get(0).getWorldRank());
        System.out.println("players2 after set****"+ players2.get(0).getWorldRank());

    }
}

class Player  {
    private float battingAverage;
    private int worldRank;

    public float getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(float battingAverage) {
        this.battingAverage = battingAverage;
    }

    public int getWorldRank() {
        return worldRank;
    }

    public void setWorldRank(int worldRank) {
        this.worldRank = worldRank;
    }
    public Player (){

    }
}