 import java.util.Scanner;

//public class EXfourLooping {
//
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		String  std1 ="", std2="" , std3="" ; 
//		int g1=0, g2=0 , g3=0;
//           for( int i = 1; i<=3; i++) {
//              System.out.println("Enter Student Number" + i + ":");
//              switch(i) {
//              case 1: std1 = s.next(); break;
//              case 2: std2 = s.next(); break;  
//              case 3: std3 = s.next(); break;
//              }
//              System.out.println("Enter Greade Of Number" + i +":"); 
//             switch(i) {
//             case 1 : g1 = s.nextInt();break;
//             case 2 : g2 = s.nextInt();break;
//             case 3 : g3 = s.nextInt();break;
//             }
//           	 
//           }
//       
//        	String StrResult = "";
//        	for(int y =0; y<=3; y++) {
//        		switch(y){
//        		case 1: StrResult = "Name  " + std1+ " Greade " + g1;break;
//        		case 2: StrResult = "Name  " + std2+ " Greade " + g2;break;
//        		case 3: StrResult = "Name  " + std3+ " Greade " + g3;break;
//        			
//        		}
//        		 System.out.println(StrResult); 
//        	}
//        	
//        	 
//         
//	}
//
//}
 
 public class Livre {
		int id;
		String titre;
		String auteur;
		double prix;
		
		public Livre() {}
		
		public Livre(int id, String titre, String auteur, double prix) {
			this.id = id;
			this.titre = titre;
			this.auteur = auteur;
			this.prix = prix;
		}
		
		public String toString() {

			return "Le titre du livre " +getId()+ " est: " +getTitre() + "\n" +
					"L'auteur du livre " +getId()+ " est: " +getAuteur() + "\n" +
					"Le prix du livre " +getId()+ " est: " +getPrix();
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public String getAuteur() {
			return auteur;
		}
		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}
		public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
		
		
	}