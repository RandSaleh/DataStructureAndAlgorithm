/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructrereview;

/**
 *
 * @author randsaleh
 */
public class DataStructreReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList ();
        doublyLinkedList.insetAtBegining(5);
        doublyLinkedList.insetAtBegining(6);
        doublyLinkedList.insertAtEnd(4);
        doublyLinkedList.removeFromLast();
        doublyLinkedList.retrieveEnd();
        
        
        //-----------------------------------------
        System.out.println("--------------------------------");
        Stack stack = new Stack();
        
        stack.push(8);
        stack.peek();
        stack.push(9);
        stack.pop();
        stack.peek();
        
        
        
    }
    
}
