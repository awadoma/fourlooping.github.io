import java.util.Scanner;

public class FourLoub2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Number" );
		/*
		int numb = s.nextInt();
		System.out.println("Enter your Acount" );
		int count = s.nextInt();
		 int temp=numb;
		 for(int x= 0; x<count; x++) {
			 numb*= temp;	 
		 
		 System.out.println(numb );
		 }
		 */
		 ////////number pair et unpair
		/*
		 for(int i=1; i<=10; i +=2) {
			 System.out.println(i );
		 }
		 */
		/*
		for(int i=1, x = 10 ,y = 20; i<=20; i +=2 ,x++,y--) {
			 System.out.println(i+ ";" + y +";" +x);
		 }
		 */
		//infinity Loop
		int l=1;
		for(;;) {
			System.out.println(l );
			l++;
			if(l>=100)break;
		}
	}

}
