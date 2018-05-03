
public class NestedLoop {

	public static void main(String[] args) {
//		
//		for(int i=1; i<=5; i ++) {
//			for(int x=1; x<=10; x ++) {
//				System.out.print("*");	
//			}
//			System.out.println(" ");	
//			}
//			
//		//Ex2
//		
//		for(int sps = 4, str = 1 ;sps >= 0; sps--, str+=2  ) {
//			for(int x=0; x < sps; x++) {
//				System.out.print(" ");
//				
//			}
//			for(int x = 0; x < str; x++) {
//				System.out.print("*");
//				
//			}
//
//				System.out.println("");
//				
//			}
//			
//			//NestedFour Ex2
//		int row, sp, str, roundSp, roundStr, discount = 0;
//		
//		for( row = 1; row <= 9; row++) {
//			
//			roundSp = (row<=5)? 5-row : row-5;
//			
//			for(sp =1; sp <= roundSp; sp++) {
//				
//				System.out.print(" ");
//			}
//			if(row>5) discount +=4;
//			
//			roundStr = (row<=5)? row *2 -1 : row *2 -1 -discount;
//			
//			for(str = 1; str <= roundStr; str++) {
//				
//				System.out.print("*");
//				
//			}
//			System.out.println();
//			
//			
//		}
//		
		public class MainLivre {
			
			public static void main(String[] args) {
				Livre monLivre1 = new Livre(1, "Harry Potter", "J.K Rowling", 150.00);
				Livre monLivre2 = new Livre(2, "L'économie bleue", "Gunter Pauli", 5.00);
				Livre monLivre3 = new Livre(3, "Libérez votre cerveau", "Idriss Aberkan", 30.00);
				
				System.out.println(monLivre1.toString());
				System.out.println("========");
				System.out.println(monLivre2.toString());
				System.out.println("========");
				System.out.println(monLivre3.toString());
				System.out.println("========");
			}
		}


		Ajouter un commentaireRéduire 
		}
		
		 }

	


