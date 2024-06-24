import java.util.Scanner;             // print Armstrong number;
public class Armstrong_number {

	public static void main(String[] args) {
		int n,arm=0,rem,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		 n=sc.nextInt();
         c=n;
         while(n>0) {
        	 rem=n%10;
        	 arm=(rem*rem*rem)+arm;
        	 n=n/10;
         }
         if(c==arm) {
        	 System.out.println("armstrong number");
         }else {
        	 System.out.println("not a armstrong number");
         }
	}

}
