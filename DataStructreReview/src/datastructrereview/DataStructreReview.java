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
        doublyLinkedList.retrieveBegining();
        doublyLinkedList.insetAtBegining(8);
        doublyLinkedList.insetAtBegining(9);
        doublyLinkedList.insetAtBegining(10);
        doublyLinkedList.retrieveBegining();
        
        doublyLinkedList.retrieveEnd();
        doublyLinkedList.insertAtEnd(80);
        doublyLinkedList.retrieveEnd();
        
        
    }
    
}
