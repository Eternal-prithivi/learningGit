package data_structures;

public class Linkelist {
	
	private Node head,tail;
	public int size;
	Linkelist(){
		//this.head=this.tail=null;// not needed because by default it is null
		this.size=0;
	}
	
	public class Node {
		private int data;
		private Node next;
		
		Node(int value){
			this.data = value;
		}
		

	}
	
	public void insertfront(int data) {
		Node node1 = new Node(data);
		node1.next = head;
		head = node1;
		if(tail==null) {
			tail=node1;
		}
		
	}
	
	public void display() {
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("null");
	}
	
	public void insertlast(int data) {
		if(head == null) {
			insertfront(data);
			return;
		}
		Node node = new Node(data);
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		tail = temp.next;
	}
	
	public void deletefirst() {
		head = head.next;
	}
	
	public void deletelast() {
		Node temp = head;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	
	public void insertAtIndex(int data,int index) {
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		Node node = new Node(data);
		node.next = temp.next;
		temp.next = node;
	}
	
	public void deleteAtIndex(int index) {
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		if(index == 0) {
			deletefirst();
		}
		temp.next = temp.next.next;
		
		
	}

}
