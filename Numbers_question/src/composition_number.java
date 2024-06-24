import java.util.Scanner;
public class composition_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n,count=0;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter the number");
           n=sc.nextInt();
           for(int i=1;i<=n;i++) {
        	   if(n%i==0) {
        		   count++;
        	   }
        	   if(count>3) {
        		   System.out.println("composition number");
        	   }else {
        		   System.out.println("not a composition number");
        	   }
           }
	}

}
