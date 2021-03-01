import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double visina = sc.nextInt();
    	double pospesek = izracun(visina);
    	izpis(visina, pospesek);
    	System.out.println("Sej OIS je kul.");
        sc.close();
    }
    public static double izracun(double v) {
        double stevec = 6.674 * Math.pow(10,-11) * 5.972 * Math.pow(10,24);
        double imenovalec = 6.371 * Math.pow(10,6) + v;
        return (stevec / (imenovalec * imenovalec));
    }

    public static void izpis(double v, double g) {
        System.out.printf("Visina: %.2f%n", v);
        System.out.printf("Gravitacijski pospesek: %.2f%n", g);
    }
}
