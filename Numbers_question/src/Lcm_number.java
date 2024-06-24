import java.util.Scanner;
public class Lcm_number {

	public static void main(String[] args) {
		int gcd=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int m=sc.nextInt();
        for(int i=1;i<=n&&i<=m;i++) {
        	if(n%i==0||m%i==0) {
        		gcd=i;
        	}
        	int lcm=(n*m)/gcd;
        	System.out.println(lcm);
        }
	}

}
