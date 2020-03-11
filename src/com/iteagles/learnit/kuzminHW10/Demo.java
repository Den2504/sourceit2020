package com.iteagles.learnit.kuzminHW10;

import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		DefaultMyList list = new DefaultMyList(); 
	list.add(1);
	list.add(4);
	list.add("Andrey");
	list.add("Den");
	list.add("Hello");
	list.add("22.3");
	list.add("122");
	System.out.println(list);            // first method appends the specified element to the end of this list

//	list1.clear();
//	System.out.println(list1);            // second method removes all of the elements from this list

	list.remove("Hello");
	System.out.println(list);            // third method removes the first occurrence of the specified element from this list

    list.toArray();
	System.out.println(list);            // fourth method returns an array containing all of the elements in this list in proper sequence

	System.out.println(list.size());     // fifth method returns the number of elements in this list

	if (list.contains("Andrey")) {
		System.out.println(true);
	}                                     // sixth method returns true if this list contains the specified element.

	MyList list2 = new DefaultMyList();
	list2.add(1);
	list2.add(4);
	list2.add("Andrey");
	list2.add("Den");
	list2.add("Hello");
	list2.add("22.3");
	list2.add("122");
	if (list.containsAll(list2)) {
		System.out.println("true");
	}                                      // returns true if this list contains all of the elements of the specified list


	MyListIterator it = list.listIterator();

	while(it.hasNext()) {
		System.out.println(it.next());
	}
	it.remove();
    it.hasNext();
	it.previous();
//	it.remove();
	it.previous();
//	it.remove();
	it.previous();
	System.out.println(list);
}
}
	

