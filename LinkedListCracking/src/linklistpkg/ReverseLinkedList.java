package linklistpkg;

public class ReverseLinkedList {

	class Node {
		int i;
		Node next;

		public Node(int i) {
			this.i = i;
			next = null;
		}

		public void printNode() {
			System.out.println("data: " + i);
		}
	}

	Node head;

	public void insert(int i) {
		Node nNode = new Node(i);
		nNode.next = head;
		head = nNode;
	}

	public void printList() {
		System.out.println("Last Inserted --> First Inserted");
		Node current = head;
		while (current != null) {
			current.printNode();
			current = current.next;
		}
	}

	// The recursive approach
	public void printReverseList(Node head) {
		if (head == null)
			return;
		printReverseList(head.next);
		head.printNode();
	}
	
	public void reverseLinkedList(){
		/*if(head == null || head.next == null)
			return;
		
		Node second = head.next;
		Node third = second.next;
		
		if(third.next == null)
			return;
		
		second.next = head;
		head.next = null;
		
		Node previous = second;
		Node current = third;
		
		while(current!=null){
			Node nextNode = current.next;
			current.next = previous.next;
			
			previous = current;
			current = nextNode;
		}
		head = previous;*/
		
		Node previous = null;
		Node current = head;
		while(current!=null){
			Node nextNode = current.next;
			current.next = previous;
			previous = current;
			current = nextNode;						
		}
		head = previous;
	}

	public static void main(String[] args) {
		ReverseLinkedList rl = new ReverseLinkedList();
		rl.insert(1);
		rl.insert(2);
		rl.insert(3);
		rl.insert(4);
		rl.printList();
		System.out.println("Last to First");
		rl.printReverseList(rl.head);
		rl.reverseLinkedList();		
		rl.printList();
		
	}
	
}
