import java.util.*;

public class Lab204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input value of X : ");
        int x = sc.nextInt();
        System.out.print("Input value of Y : ");
        int y = sc.nextInt();
        while (x > y) {
            System.out.print("Input value of Y, again : ");
            y = sc.nextInt();
        }

        System.out.println();
        
        int last = x;
        for (int i = x; i < y; i++) {
            System.out.println((last) + " + " + 
            (i + 1) + " = " + (last + (i + 1)));
            last = (last + (i + 1));
        }

        sc.close();
    }
}