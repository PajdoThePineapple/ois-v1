import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {
        System.out.println("OIS je zakon");
    }
    public static int (int v){
        int stevec = 6.674*Math.pow(10,-11)*5.972*Math.pow(10,24);
        int imenovalec = 6.371*Math.pow(10,6) + v;
        return stevec/(imenovalec*imenovalec)
    }
}