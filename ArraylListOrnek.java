package com.bilgeadam.genericlisteler;

import java.util.List;
import java.util.ArrayList;

public class ArraylListOrnek {

	public static void main(String[] args) {
		
		List<String> arrList=new ArrayList<String>();
		arrList.add("Osman");
		arrList.add("Ibrahim");
		arrList.add(0,"Ozan");
		
		for (String str  : arrList)
		{
			System.out.println(str);
		}
		if(arrList.contains("Osman")) {
			System.out.println("Osman bulundu");
		}
		else {
			System.out.println("Aradiginiz kisi bulunamadi!");
		}
		if (arrList.size ()>0) {
			System.out.println("Liste su kadar elaman "+arrList.size()+" var.");
		}
		arrList.clear();
		if (arrList.size()==0) {
			System.out.println("Liste bos!");
		}

	}

}
