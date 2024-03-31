package DeepAndShadowCopy;

import java.util.LinkedList;

public class DeepCopyWithConstructorCopy {
    public static void main(String[] args) {
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
            players2.add(new Players(p.getWorldRank())); // copie du constructeur
        }
        System.out.println("players1 before set****"+ players1.get(0).getWorldRank());
        players2.get(0).setWorldRank(5);
        System.out.println("players1 after set****"+ players1.get(0).getWorldRank());
        System.out.println("players2 after set****"+ players2.get(0).getWorldRank());
    }
}
