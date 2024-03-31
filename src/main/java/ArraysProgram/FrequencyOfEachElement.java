package ArraysProgram;

import java.util.Arrays;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 1, 1, 3, 2, 4, 4, 2};
        int[] sortedTab = Arrays.stream(tab).sorted().toArray();
        System.out.println(Arrays.toString(sortedTab));
        int element = sortedTab[0];
        int occurrence = 0;
        for (int i = 0; i < sortedTab.length; i++) {
            if (sortedTab[i] == element) {
                occurrence = occurrence + 1;
                if (sortedTab[i] == sortedTab[sortedTab.length-1]) {
                    System.out.println("L'occurrence de " + sortedTab[i - 1] + "egale à " + occurrence);

                }
            } else {
                System.out.println("L'occurrence de " + sortedTab[i - 1] + "egale à " + occurrence);
                occurrence = 1;
                element = sortedTab[i];
            }
        }

    //autre maniere
    int[] tab1 = new int[]{1, 2, 1, 1, 3, 2, 4, 4, 2};
        Arrays.sort(tab1); // Tri du tableau

    int occurrenceNb = 1; // Initialiser le compteur d'occurrence à 1 pour le premier élément
        for (int i = 1; i <= tab1.length; i++) {
        if (i < tab1.length && tab1[i] == tab1[i - 1]) {
            occurrence++; // Incrémenter l'occurrence si l'élément actuel est égal à l'élément précédent
        } else {
            // Afficher l'occurrence de l'élément précédent et réinitialiser le compteur pour le nouvel élément
            System.out.println("L'occurrence de " + tab[i - 1] + " est égale à " + occurrenceNb);
            occurrence = 1;
        }
    }
}
}
