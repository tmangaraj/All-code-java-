import java.util.Scanner;
public class palindrom_number {

	public static void main(String[] args) {
		int n,m,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
		m=n;
		while(n!=0) {
			int d=n%10;
			sum=sum*10+d;
			n=n/10;
		}
        if(sum==m) {
        	System.out.println("palindrom number");
        }else {
        	System.out.println("not a palindrome number");
        }
	}

}
