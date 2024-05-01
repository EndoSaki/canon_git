package p31;

import java.util.ArrayList;
import java.util.List;

import p23.Canon;
import p23.Kudo;
import p23.Oku;

public class Start {

	public static void main(String[] args) {
	List<Canon> list = new ArrayList();
	
	list.add(new Oku());
	list.add(new Kudo());
	
	for(Canon con :list) {
		con.work();
		con.salary();
		
		System.out.println("-----");
		
	}
	
	}

}
