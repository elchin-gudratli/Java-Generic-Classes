package com.bilgeadam.genericlisteler;

import java.util.ArrayList;
import java.util.List;

public class PersonelListesiOrnek {

	public static void main(String[] args) {
	      
		List <Personel>  personelList=new ArrayList<Personel>();


		Personel p1 =new Personel("Ibrahim","Gokyar",5000);
		Personel p2 =new Personel("Yunus","Emre",7000);
		Personel p3 =new Personel("Mehmet","Yilmaz",1000);
		personelList.add(p1);
		personelList.add(p2);
		personelList.add(p3);
		
		for(Personel str: personelList)
		{
			System.out.println("Personelin Adi: "+str.Ad+" Personelin Soyadi: "+str.Soyad
			+" Personelin Maasi: "+str.Maas);
		}

	}

}
