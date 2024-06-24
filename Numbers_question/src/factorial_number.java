import java.util.Scanner;       //print factorial 
public class factorial_number {

	public static void main(String[] args) {
		int factorial = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		   factorial = factorial*i;
		}
		System.out.println(factorial);

	}

}
