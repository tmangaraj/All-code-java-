import java.util.Scanner;
public class spy_number {

	public static void main(String[] args) {
		int n,m,sum=0,product=1;
		Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			n=sc.nextInt();
			m=n;
			while(n!=0) {
				int d=n%10;
				sum=sum+d;product=product*d;
				n=n/10;
			}
			if(sum==product) {
				System.out.println("spy number");
			}else {
				System.out.println("not a spy number");
			}
		}

	}

