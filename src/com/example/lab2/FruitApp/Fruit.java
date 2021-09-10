package com.example.lab2.FruitApp;

import java.util.Comparator;

public class Fruit {
	int no;
	String name; 
	int price;
	
	public Fruit(int no, String name, int price) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "Student [no="+no+", name="+name+", price="+price+"]";
	}

}

class FruitCompatator implements Comparator<Fruit>{
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitcomparatorDesc implements Comparator<Fruit>{
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}
