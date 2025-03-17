package laufzeiten;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Laufzeit {

    public static int[] zweiZahlenSumme2(int[] array, int zielZahl) {
        Arrays.sort(array); //Welche Laufzeit hat arrays.sort() in Java? -> Dual Pivot Sort O(nlogn)
        int links = 0; // O(1)
        int rechts = array.length - 1; // O(1)
        while (links < rechts) { // Loop läuft n-mal: O(n)
            int aktuelleZahl = array[links] + array[rechts]; // O(1)
            if (aktuelleZahl == zielZahl) { // O(1)
                return new int[]{array[links], array[rechts]}; // O(1)
            } else if (aktuelleZahl < zielZahl) { // O(1)
                links++; // O(1)
            } else if (aktuelleZahl > zielZahl) { // O(1)
                rechts--; // O(1)
            }
        }
        return new int[0]; // O(1)
    }


    public static int[] zweiZahlenSumme3(int[] array, int zielZahl) {
        Set<Integer> nums = new HashSet<>(); // O(1)
        for (int num : array) { // O(n)
            int treffer = zielZahl - num; // O(1)
            if (nums.contains(treffer)) { // O(1) -> Da HashSet
                return new int[] { treffer, num }; //O(1)
            } else {
                nums.add(num); // O(1)
            }
        }
        return new int[0]; //O(1)
    }

    public static int[] zweiZahlenSumme(int[] array, int zielZahl) {
        for (int i = 0; i < array.length - 1; i++) { // O(n)
            int ersteZahl = array[i]; // O(1)
            for (int j = i + 1; j < array.length; j++) { // O(n)
                int zweiteZahl = array[j];  // O(1)
                if (ersteZahl + zweiteZahl == zielZahl) { // O(1)
                    return new int[] { ersteZahl, zweiteZahl }; // O(1)
                }
            }
        }
        return new int[0]; // O(1)
    }
}
