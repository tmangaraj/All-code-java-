package pattern_question;
import java.util.Scanner;
public class parallel_bar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n) 
					System.out.print("* ");
				else
					System.out.print("  ");
			}
		System.out.println();

	}
	}
}

