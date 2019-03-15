/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructrereview;

import java.util.Iterator;

/**
 *
 * @author randsaleh
 */
public class DoublyLinkedList {

    Node head=null ;
    Node tail=null;
    int size =0; 
    
    private class Node {
    int data ; 
    Node prev ;
    Node next ; 

        public Node(int data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        
            public Node(int data) {
            this.data = data;
        }
               
        
    }
    //----- Insert new node at the begining of the doubly linked list 
    
    public void insetAtBegining(int data){
    if (head ==null && tail ==null){
    /// empty linked list 
    Node temp = new Node(data,null,null);
    head = temp ;
    tail = head ;
    }
        //-- it's contain  nodes 
        
        Node temp = new Node (data);
        
        temp.next=head ;
        temp.prev=null;
        head = temp;
          
    }


    
    public void retrieveBegining(){
    
        System.out.println("The top is "+head.data);
        
    
    }
    

 
    
    
    
    
}
