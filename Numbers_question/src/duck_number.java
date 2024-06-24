import java.util.Scanner;
public class duck_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,m,count=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the numebr");
         n=sc.nextInt();
         m=n;
         while(n!=0) {
        	 int d=n%10;
        	 if(d==0)    count++;
        	 n=n/10;
         
	}
         if(count>0) {
        	 System.out.println("duck number");
         }else {
        	 System.out.println("not a duck number");
         }
	}
}
