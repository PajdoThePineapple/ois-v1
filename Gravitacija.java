import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int visina = sc.nextInt();
    	int pospesek = izracun(visina);
    	izpis(visina, pospesek);
    	System.out.println("Sej OIS je kul.");
    }
    public static int izracun(int v) {
        int stevec = 6.674 * Math.pow(10,-11) * 5.972 * Math.pow(10,24);
        int imenovalec = 6.371 * Math.pow(10,6) + v;
        return (stevec / (imenovalec * imenovalec));
    }

    public static void izpis(int v, int g) {
        System.out.println(v);
        System.out.println(g);
    }
}
