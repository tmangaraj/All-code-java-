import java.util.Scanner;
public class niven_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,m,sum=0;
         Scanner sc=new Scanner(System.in) ;
        	 System.out.println("enter the number");
        	 n=sc.nextInt();
        	 m=n;
        	 while(n!=0) {
        		 int d=n%10;
        		 sum=sum+d;
        		 n=n/10;
        	 }
        	 if(m%sum==0) {
        		 System.out.println("niven number");
        	 }else {
        		 System.out.println("not a niven number");
        	 }
         }
	}


