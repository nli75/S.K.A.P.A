package se.kyh.ad10s.scrumapp;

import java.util.Scanner;

public class StartClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
//		 I den h�r klassen,
//		skapar vi en while-loop
//		innuti denna while-llop
//		f�r vi m�jligheten att skapa
//		nya backlog-items
//		backlog-items
//		sorteras i en backlog
//		s� i v�ran backlog-class
//		m�ste vi ha en ???
		
		Backlog backlog = new Backlog();
		
		while (true) {
			Scanner keyboard = new Scanner(System.in);
			
			PbItem pbitem = new PbItem();
			
			System.out.println("\nLets create a new pbi.");
			System.out.print("\nFORMAT: id prio est");
			
			pbitem.dbid = keyboard.nextInt();
			pbitem.prio = keyboard.nextInt();
			pbitem.est = keyboard.nextInt();
			
			System.out.println("\nNu skulle det vara bra med ett namn");
			
			pbitem.name = keyboard.next();
			
			System.out.println("\nOm du skulle vilja beskriva itemet");
			
			pbitem.description = keyboard.next();
			
//			System.out.println("Du har skapat ett PbItem\n" +
//					"\nNAME: "+pbitem.name +
//					"\nID: "+pbitem.dbid +
//					"\nPRIO: "+pbitem.prio +
//					"\nEST: "+pbitem.est + 
//					"\nDESC: " +pbitem.description);
//			
//			System.out.println("OBJEKT ID: "+pbitem);

			
			//h�r sparar vi det som vi precis har fr�gat efter
			backlog.savePbItem(pbitem);
			
			
			//Det h�r �r ett test f�r att loopa igenom alla items i mypbitems
			
			int myPbItemSize = backlog.MyPbItems.size();
			

			for(int i=0; i<myPbItemSize; i++){
			
				System.out.println(backlog.MyPbItems.get(i));
				
			}
			
			
//			

//				
//			}
			
//			System.out.println(backlog);
			
			
		}
		//new nav-class
		//fr�gar vad vi vill g�ra
		//skickar v�ra inputs
		//till passande platser
		
		
	}

}
