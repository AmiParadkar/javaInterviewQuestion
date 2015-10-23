import java.util.Stack;

public class AddNodeToTail {
	public static void main(String args[]) {

		AddNodeToTail a = new AddNodeToTail();
		Node head = null;
		// Node head = new Node();

		// head.data = 2;
		// //head.next = null;
		// //data = 3;
		// Node returnHead = a.Insert(head, 2);
		head = a.Insert(head, 2);
		// System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		// while(returnHead != null){
		//
		// System.out.println("Inside while");
		// System.out.println(returnHead.data);
		// System.out.println(returnHead.next);
		// returnHead = returnHead.next;
		//
		// }
		// System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		// System.out.println(head.data);
		// Node returnHeadNew = a.Insert(head, 4);
		head = a.Insert(head, 4);
		// //System.out.println(returnHead);
		// while(returnHeadNew != null){
		// System.out.println("Inside while");
		// System.out.println(returnHeadNew.data);
		// System.out.println(returnHeadNew.next);
		// returnHeadNew = returnHeadNew.next;
		//
		// }
		//
		// Node returnNewHead = a.InsertAtHead(head, 1);
		// System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		// while(returnNewHead != null){
		//
		// System.out.println("Inside while");
		// System.out.println(returnNewHead.data);
		// System.out.println(returnNewHead.next);
		// returnNewHead = returnNewHead.next;
		//
		// }
		// System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		head = a.InsertAtNth(head, 1, 0);
		head = a.InsertAtNth(head, 3, 2);
		head = a.InsertAtNth(head, 5, 4);
		head = a.InsertAtNth(head, 6, 3);
		// Node n = a.InsertAtNth(head, 6, 3);
		// System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		// while (n != null) {
		//
		// System.out.println("Inside while");
		// System.out.println(n.data);
		// System.out.println(n.next);
		// n = n.next;
		//
		// }
		// Node n = a.Delete(head, 3);
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
//		while (n != null) {
//
//			System.out.println("Inside while");
//			System.out.println(n.data);
//			System.out.println(n.next);
//			n = n.next;
//
//		}
		head = a.Delete(head, 3);
		a.ReversePrint(head);

	}

	Node Insert(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node newNode = new Node();
		newNode.data = data;
		if (head == null) {

			head = newNode;
		} else if (head.next == null) {

			head.next = newNode;
		} else {
			Node tmp = head;
			while (head.next != null) {
				head = head.next;
			}
			head.next = newNode;
			head = tmp;
		}
		return head;
	}

	Node InsertAtHead(Node head, int data) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node newNode = new Node();
		newNode.data = data;
		if (head.next == null && head.data == 0)
			head = newNode;
		else if (head.next == null)
			head.next = newNode;
		else {
			newNode.next = head;
			head = newNode;

		}
		return head;
	}

	Node InsertAtNth(Node head, int data, int position) {
		// This is a "method-only" submission.
		// You only need to complete this method.

		if (position < 0)
			return null;
		Node newNode = new Node();
		newNode.data = data;
		if (head == null && position == 0) {

			head = newNode;
		} else if (head.next == null || position == 0) {

			newNode.next = head;
			head = newNode;
		}

		else {

			Node tmp = head;
			Node prevNode = new Node();
			for (int i = 0; i < position; i++) {
				prevNode = head;
				head = head.next;

			}
			newNode.next = head;
			prevNode.next = newNode;

			head = tmp;

		}
		return head;
	}

	Node Delete(Node head, int position) {
		// Complete this method
		if (head == null)
			return null;
		if (head.next != null) {
			if (position == 0) {
				head = head.next;
			} else {
				Node tmp = head;
				Node prevNode = new Node();
				for (int i = 0; i < position; i++) {
					prevNode = head;
					head = head.next;

				}
				prevNode.next = head.next;
				head = tmp;
			}
		}

		else
			return null;
		return head;
	}

	void ReversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		
//		if (head == null)
//			System.out.println("List is Empty");
//		else {
//			List<Integer> arrList = new ArrayList<Integer>();
//			while (head.next != null) {
//				
//				arrList.add(head.data);
//				head = head.next;
//			}
//			arrList.add(head.data);
//			
//			for (int i = (arrList.size()-1); i >= 0; i--) {
//				
//				System.out.println(arrList.get(i));
//			}
//
//		}
		Stack<Integer> sc = new Stack<Integer>();
		Node tmp = head;
		while(tmp.next != null)
		{
			sc.push(tmp.data);
			tmp = tmp.next;
		}
		while(!sc.isEmpty()){
			System.out.println(sc.peek());
			sc.pop();
		}
		
	}

}

class Node {
	int data;
	Node next;
}
