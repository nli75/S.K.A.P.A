package se.kyh.ad10s.scrumapp;

import java.util.ArrayList;

public class Backlog {
	
	//skapa en array som kan ta emot PbItemsobjekt
	ArrayList<PbItem> MyPbItems = new ArrayList<PbItem>();
	
	
	//method som kan h�mta ett PbItemobjekt.
	// som l�gg detta objekt i arrayen. 
//	F�r tillf�llet fr�n StartClass
	public void savePbItem(PbItem o){
		MyPbItems.add(o);
	}
	
	

	
	
	

}
