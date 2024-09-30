/* Given a singly linked list of integers. The task is to check if the given linked list is palindrome or not. */

import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

public class BCSE103E_ASSIGNMENT__30_9_24__PRG_2 {
    private static boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }

        //tortoise and hare algorithm for finding middle of linked list
        Node oneStep = head;
        Node twoStep = head;
        while (twoStep.next != null && twoStep.next.next != null) {
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }
        
        Node right = reverseList(oneStep.next);
        Node left = head;
        
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        
        return true;
    }
    
    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes for which palindrome needs to be checked: ");
        int n = sc.nextInt();
        
        System.out.printf("Enter the value of Node #0: ");
        Node head = new Node(sc.nextInt());
        Node current = head;
        for (int i = 1; i < n; i++) {
            System.out.printf("Enter the value of Node #%d: ", i);
            current.next = new Node(sc.nextInt());
            current = current.next;
        }
        boolean isPalindrome = checkPalindrome(head);
        if (isPalindrome == true){
            System.out.println("The linked list is a palindrome. (true)");
        }
        else{
            System.out.println("The linked list is not a palindrome. (false)");
        }
    }
}