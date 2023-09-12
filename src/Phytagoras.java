import java.util.Scanner;

public class Phytagoras {
    public static void main(String[] args) {
        Scanner tgb = new Scanner(System.in);
        int a,b;
        System.out.println("Mata in a och b");
        a = tgb.nextInt();
        b = tgb.nextInt();
        double c;
        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("c = %.3f",c);


    }
}
