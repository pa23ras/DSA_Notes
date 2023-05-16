import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}

class Solution{
	Node swapkthnode(Node head, int num, int k)
    {
        //Write your code here
		if (head.next == null) {
            return head;
        }
        
        // First, we need to count the length of the list
        int n = 0;
        Node curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        
        // Calculate the indices of the nodes we want to swap
        Node node1 = head;
        for (int i = 1; i < k; i++) {
            node1 = node1.next;
        }
        
        Node node2 = head;
        for (int i = 1; i < n - k + 1; i++) {
            node2 = node2.next;
        }
         int temp = node1.data;
        node1.data = node2.data;
        node2.data = temp;
        return head;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        LinkedList list = new LinkedList();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        Solution obj = new Solution();
		list.head = obj.swapkthnode(list.head, n, k);
		Node curr = list.head;
		while(curr != null){
			System.out.print(curr.data + " ");
			curr = curr.next;
	    }
	}
}