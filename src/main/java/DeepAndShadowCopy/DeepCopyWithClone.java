package DeepAndShadowCopy;

import java.util.LinkedList;

public class DeepCopyWithClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        LinkedList<Players> players1 = new LinkedList<>();
        Players p1 = new Players();
        p1.setBattingAverage(46.7f);
        p1.setWorldRank(4);
        players1.add(p1);

        Players p2 = new Players();
        p2.setBattingAverage(56.9f);
        p2.setWorldRank(1);
        players1.add(p2);

        LinkedList<Players> players2 = new LinkedList<>();
        for (Players p : players1) {
            players2.add(p.clone()); // Utiliser la méthode clone pour effectuer une copie profonde
        }
        System.out.println("players1 before set****"+ players1.get(0).getWorldRank());
        players2.get(0).setWorldRank(5);
        System.out.println("players1 after set****"+ players1.get(0).getWorldRank());
        System.out.println("players2 after set****"+ players2.get(0).getWorldRank());

        // Afficher les joueurs de players1
        System.out.println("Joueurs de players1 après modification de players2:");
        for (Players p : players1) {
            System.out.println(p);
        }
    }
}

class Players implements Cloneable {
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

    @Override
    public Players clone() throws CloneNotSupportedException {
        return (Players) super.clone(); // Utiliser la méthode clone de la classe Object
    }
    public Players(){

    }

    public Players(int worldRank) {
        this.worldRank = worldRank;
    }
}
