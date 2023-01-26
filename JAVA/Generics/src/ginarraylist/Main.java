package ginarraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("car1");
		
		list.add("car2");
		
		list.add("car3");
		
		//Integer can't be used if generics are specified 
//		list.add(55);
	System.out.println(list);	
	}

}
