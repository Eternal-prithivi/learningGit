package data_structures;

public class Practice {

	public static void main(String[] args) {
		Linkelist node = new Linkelist();
		node.insertfront(45);
		node.insertfront(23);
		node.insertlast(80);
		node.insertlast(100);
		node.deletefirst();
		node.deletelast();
		node.insertAtIndex(23, 1);
		node.deleteAtIndex(0);
		node.display();

	}
}
