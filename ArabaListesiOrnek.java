package com.bilgeadam.genericlisteler;

import java.util.ArrayList;
import java.util.List;

public class ArabaListesiOrnek {
	public static void main(String[ ] args) {
	
	List<Araba> arabaList=new ArrayList<Araba>();
    
	Araba  a1=new Araba("BMW","X5",220);
	Araba  a2=new Araba("Mercedes","G63",260);
	Araba  a3=new Araba("Porche","Cayenne",240);
	arabaList.add(a1);
	arabaList.add(a2);
	arabaList.add(a3);
	
	for(Araba str: arabaList)
	{
		System.out.println("Markasi: "+str.Marka+" Modeli: "+str.Model+" Yakit Ne Kadar: "+str.Benzin);
	}
	
	}

}
