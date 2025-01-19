import java.util.LinkedList;

public class Basics {

    public static void main(String[] args) {
        f3(2);
    }

    // Laufzeit O(n+m)
    public static boolean f1(String str1, String str2) {
        char[] array1 = new char[Character.MAX_VALUE]; // Konstant
        char[] array2 = new char[Character.MAX_VALUE]; // Konstant
        for(char c : str1.toCharArray()){
            array1[c]++;  // n - mal
        }
        for(char c : str2.toCharArray()){
            array2[c]++;  // m - mal
        }
        for(char c = 0; c < Character.MAX_VALUE; c++){
            if(array1[c] != array2[c])
                return false;
        } return true;
    }

    public static double f2(double a, int n) {
        double x = 1.0;  // O(1)
        for (int i = 0; i < n; i++)
            x = 0.5 * (x + a / x);  // n-mal
        return x;
    }

    // Schätzung der Zahl Pi
    //Allgemeinheit -> Ja
    //Determiniertheit -> Nicht gegeben
    //Determinismus -> Nicht gegeben
    //Terminierung -> Ja
    public static double f3(int n) {
        double sum = 0.0; // 1-mal
        for (int i = 0; i < n; i++) {
            double x = Math.random(); //n-mal
            double y = Math.random(); //n-mal
            if(Math.sqrt(x*x+y*y) <= 1.0) //2n-mal
                sum++; // n-mal, falls Bedingung true
        }
        return 4.0*sum/n; // 3 Operationen
    }


    //Allgemeinheit -> Erfüllt
    //Determiniertheit -> Erfüllt
    //Determinismus -> Erf+llt
    //Terminierung -> Terminiert nicht falls b <0
    public static int f4(int a, int b) {
        if (b == 1)
            return a;
        return a * f4(a, b - 1);
    }

    // Ackermann Funktion
    //Allgemeinheit -> Erfüllt
    //Determiniertheit -> Erfüllt
    //Determinismus -> Erfüllt
    //Terminierung -> Für a,b < 0 terminiert er nicht
    public static int f5(int a, int b) {
        if (a == 0)
            return b + 1;
        if (b == 0)
            return f5(a - 1, 1);
        return f5(a - 1, f5(a, b - 1));
    }



    //Allgemeinheit
    //Determiniertheit
    //Determinismus
    //Terminierung -> Terminiert nicht
    public static void f6() {
        LinkedList<Integer> list = new LinkedList<>();
        int n = 2;
        list.add(n);
        n = 3;
        list.add(n);
        while (true) {
            n += 2;
            boolean add = true;
            for (Integer m : list) {
                if (n % m == 0)
                    add = false;
            }
            if (add) {
                list.add(n);
                System.out.println(n);
            }
        }
    }
}
