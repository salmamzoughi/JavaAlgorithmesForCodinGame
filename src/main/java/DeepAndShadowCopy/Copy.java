package DeepAndShadowCopy;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Copy {
    public static void main(String[] args) {
        LinkedList<Player> players1 = new LinkedList<>();
        Player p1 = new Player();
        p1.setBattingAverage(46.7f);
        p1.setWorldRank(4);
        players1.add(p1);
        LinkedList<Player> liste_clone = new LinkedList<>(players1);
        System.out.println("players1 before set****"+ players1.get(0).getWorldRank());//4
        liste_clone.get(0).setWorldRank(5);
        System.out.println("players1 after set****"+ players1.get(0).getWorldRank());//5
        System.out.println("players2 after set****"+ liste_clone.get(0).getWorldRank());//5

        LinkedList<Player> clone_listAddAll = new LinkedList<>();
        System.out.println("players1 before set****"+ players1.get(0).getWorldRank());//4
        clone_listAddAll.addAll(liste_clone);
        clone_listAddAll.get(0).setWorldRank(6);
        System.out.println("players1 after set****"+ players1.get(0).getWorldRank());//5
        System.out.println("clone_listAddAll after set****"+ clone_listAddAll.get(0).getWorldRank());//5

        System.out.println("players1 before set****"+ players1.get(0).getWorldRank());//4
        List<Player> clone_listStream = players1.stream().collect(Collectors.toList());
        clone_listStream.get(0).setWorldRank(7);
        System.out.println("players1 after set****"+ players1.get(0).getWorldRank());//5
        System.out.println("clone_listStream after set****"+ clone_listStream.get(0).getWorldRank());//5

    }
}
