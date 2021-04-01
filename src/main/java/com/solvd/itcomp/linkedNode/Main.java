package com.solvd.itcomp.linkedNode;

public class Main {

	public static void main(String[] args) {
		
		
		LinkedList<String> list = new LinkedList<String>();
		list.insert("a");
		list.insert("B");
		list.insert("c");
		list.insert("D");
		list.printLinkedList();
		list.deleteWithData("c");
		list.printLinkedList();
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.insert(1);
		list2.insert(2);
		list2.insert(3);
		list2.insert(3, 7);
		list2.insert(4);
		list2.printLinkedList();
		list2.deleteWithData(2);
		list2.printLinkedList();
		
		
		
		System.out.println(list2.getElementAt(3));
		list.deleteWithPosition(2);
		list.printLinkedList();
		
	}

}
