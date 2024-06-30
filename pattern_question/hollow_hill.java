package pattern_question;
import java.util.Scanner;
public class hollow_hill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("");
			}
			for(int j=1;j<i;j++) {
				if(i==n||j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				if(i==n||j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
					}

	}

}
