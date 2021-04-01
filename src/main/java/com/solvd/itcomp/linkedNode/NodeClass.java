package com.solvd.itcomp.linkedNode;

public class NodeClass<T> {

	private T data;
	private NodeClass<T> next;
	private NodeClass<T> previous;
	
	
	public NodeClass(T data) {
		this.setData(data);
		this.setNext(null);
		this.setPrevious(null);
		
	}


	public NodeClass() {
		this.data = null;
		this.next = null;
		this.previous=null;
		
	}
	

	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}


	public NodeClass<T> getNext() {
		return next;
	}


	public void setNext(NodeClass<T> next) {
		this.next = next;
	}


	public NodeClass<T> getPrevious() {
		return previous;
	}


	public void setPrevious(NodeClass<T> previous) {
		this.previous = previous;
	}
	
	
}
