package com.solvd.itcomp.linkedNode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LinkedList<T> {

	private NodeClass<T> headOfList;
	private NodeClass<T> tail;
	private int size;
	private Logger log = LogManager.getFormatterLogger(LinkedList.class);
	
	public LinkedList() {
		headOfList = new NodeClass<T>();
		tail = new NodeClass<T>();
		headOfList.setNext(tail);
		tail.setPrevious(headOfList);
		size=0;
	}
	
	
	public LinkedList<T> insert(T data) {
		
		NodeClass<T> newNode = new NodeClass<T>(data);
		NodeClass<T> last = this.getTail().getPrevious();
		newNode.setData(data);
		newNode.setNext(this.getTail());
		newNode.setPrevious(last);
		this.getTail().setPrevious(newNode);
		last.setNext(newNode);
		size++;
		return this;
	}
	
	public LinkedList<T> insert(Integer index, T data){
		
		if(index < 0 || index> this.size) throw new IndexOutOfBoundsException();
		int counter=0;
		NodeClass<T> currentNode= new NodeClass<T>(data) ;
		NodeClass<T> prevNode = this.getHead();
		while(counter< index) {
			prevNode = prevNode.getNext();
			counter ++;
		}
		currentNode.setNext(prevNode.getNext());
		currentNode.setPrevious(prevNode);
		prevNode.getNext().setPrevious(currentNode);
		prevNode.setNext(currentNode);
		size ++;
		return this;
	}
	
	
	public T getElementAt(Integer index) {
		int actual =0;
		NodeClass<T> tmp=this.getHead().getNext();
		while(actual<index) {
			if(tmp.getNext()!=null) {
				tmp= tmp.getNext();
			}else {
				throw new IndexOutOfBoundsException();
			}
			actual ++;
		}
		return tmp.getData();
	}
	
	
	
	public LinkedList<T> deleteWithData(T data) {
		NodeClass<T> currentNode = this.getHead().getNext();
		
		try {
			while(!currentNode.getData().equals(data)) {
				if(currentNode.getNext()!=null) {
					currentNode = currentNode.getNext();
				}
			}
			currentNode.getPrevious().setNext(currentNode.getNext());
			currentNode.getNext().setPrevious(currentNode.getPrevious());
			size--;
		}catch(NullPointerException e) {
			log.warn("No posible delete this element");
		}
		return this;
	}
	
	
	public LinkedList<T> deleteWithPosition(int index) {
		if(index < 0 || index> this.size) throw new IndexOutOfBoundsException();
		int counter=0;
		NodeClass<T> prevNode = this.getHead();
		while(counter< index) {
			prevNode = prevNode.getNext();
			counter ++;
		}
		prevNode.getNext().setPrevious(prevNode.getPrevious());
		prevNode.getPrevious().setNext(prevNode.getNext());
		size ++;
		
		return this;
	}
	
	
	
	
	public void printLinkedList() {
		NodeClass<T> currentNode= this.getHead();
	
		while(currentNode.getNext()!= null) {
			System.out.println(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
		}
		
	}


	public boolean isEmpty() {
		return this.size == 0;
	}
	public int size() {
		return this.size;
	}
	
	public void setHeadOfList(NodeClass<T> node) {
		this.headOfList=node;
		
	}
	public NodeClass<T> getHead() {
		return this.headOfList;
	}


	public NodeClass<T> getTail() {
		return tail;
	}


	public void setTail(NodeClass<T> tail) {
		this.tail = tail;
	}
	
}
