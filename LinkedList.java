public class Linked_List {

	int data;
	Node next;
	Node head;

	// Node Class
	class Node {
		int data;
		Node next;

		// Parameterized Constructor
		Node(int x) {
			data = x;
			next = null;
		}
	}

	public Node insertNode(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		return head;
	}

	public void display() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " -> ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		Linked_List l = new Linked_List();
		System.out.println("Creating a Linked List");

		l.insertNode(30);
		l.insertNode(20);
		l.insertNode(50);

		l.display();

	}

}