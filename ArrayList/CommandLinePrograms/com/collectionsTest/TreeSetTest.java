package com.collectionsTest;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		SortedSet<Item> parts = new TreeSet<Item>();
		parts.add(new Item(8548,"First"));
		parts.add(new Item(8821,"Second"));
		parts.add(new Item(7856,"Third"));
		parts.add(new Item(9984,"Fourth"));
		
		System.out.println(parts);
		
		SortedSet<Item> description = new TreeSet<Item>( 
		new Comparator<Item>() {
			public int compare(Item a, Item b) {
				return a.getaDescription().compareTo(b.getaDescription());
			}			
		}		
		);
		
		description.addAll(parts);
		System.out.println(description);
	}
}
