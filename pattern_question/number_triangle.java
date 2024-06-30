package pattern_question;
import java.util.Scanner;
public class number_triangle {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number to form a triangle");
    	int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
