
import java.util.*;

public class Lab3_5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Input some sentence : ");
        String input = sc.nextLine();

        while (!input.endsWith(".")) {
            System.out.print("The sentence must end with full stop point : ");
            input = sc.nextLine();
        }

		System.out.println();

        String[] separateWord = input.split(" "); //แบ่งคำ
        for(int i = 0; i < separateWord.length; i++){ System.out.println(separateWord[i]);}
        
        sc.close();
	}
}