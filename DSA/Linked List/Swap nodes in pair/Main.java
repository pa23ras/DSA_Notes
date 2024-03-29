import java.util.*;

class Solution{  
	void pairWiseSwap(Node head)
	{

        // //////////////////////////////////////////////////////////////////////////////
		// Write your code here
		if(head==null || head.next == null)
		{
			System.out.println(head);
		}
		Node dummy = new Node(-1);
		dummy.next = head;

		Node prev = dummy;
		Node curr = head;

		while(curr!=null && curr.next!= null)
			{
		Node firstNode = curr;
		Node secondNode = curr.next;

				prev.next = secondNode;
				firstNode.next = secondNode.next;
				secondNode.next = firstNode;

				prev = firstNode;
				curr = firstNode.next;
            }
		
        curr = dummy.next;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////////
	}
	
}
public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            LinkedList llist= new LinkedList(); 
            int a1=sc.nextInt();
            Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) 
            {
                int a = sc.nextInt(); 
                llist.addToTheLast(new Node(a));
            }    
			Solution A = new Solution();
	        A.pairWiseSwap(llist.head);
        }  
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
    
class LinkedList
{
    Node head;  
    Node tail;
    public void addToTheLast(Node node) 
    {
      if (head == null) 
      {
       head = node;
       tail = node;
      } 
      else 
      {
       tail.next = node;
       tail = node;
      }
    }
      void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }   
}