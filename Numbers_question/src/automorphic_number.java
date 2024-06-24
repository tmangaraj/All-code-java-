import java.util.Scanner;        //print Automorphic number;
public class automorphic_number {

	public static void main(String[] args) {
		int n=1,temp=n,sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		n=sc.nextInt();
        while(temp>0) {
        	sum=sum%10;
        	temp=temp/10;
        }
        int square=n*n;
        if(square%sum==n) {
        	System.out.println("automorphic number");
        }else {
        	System.out.println("not a automophic number");
        }
	}

}
