import java.util.Scanner;       //print fibonacci number
public class fibonacci_number {

	public static void main(String[] args) {
		int n,a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
