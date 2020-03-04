package com.iteagles.learnit.kuzminHW9;

public class Demo {
	public static void main(String[] args) {
		MyList list1 = new DefaultMyList();
	list1.add(1);
	list1.add(4);
	list1.add("Andrey");
	list1.add("Den");
	list1.add("Hello");
	list1.add("22.3");
	list1.add("122");
	System.out.println(list1);            // first method appends the specified element to the end of this list

//	list1.clear();
//	System.out.println(list1);            // second method removes all of the elements from this list

	list1.remove("Hello");
	System.out.println(list1);            // third method removes the first occurrence of the specified element from this list

    list1.toArray();
	System.out.println(list1);            // fourth method returns an array containing all of the elements in this list in proper sequence

	System.out.println(list1.size());     // fifth method returns the number of elements in this list

	if (list1.contains("Andrey")) {
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
	if (list1.containsAll(list2)) {
		System.out.println("true");
	}                                      // returns true if this list contains all of the elements of the specified list

}
}

