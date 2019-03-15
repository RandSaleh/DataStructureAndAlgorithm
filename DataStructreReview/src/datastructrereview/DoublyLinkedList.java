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
    else {   
        Node temp = new Node (data);
        
        temp.next=head ;
        temp.prev=null;
        head = temp;
        
    }
    
    size ++;
    
          
    }


    
    public void retrieveBegining(){
    if (head==null)
            System.out.println("The list is empty ! ");
    
    else 
    
        System.out.println("The top is "+head.data);
        
    }
    

 public void insertAtEnd(int data){
     Node temp = new Node (data);
     if (head == null && tail ==null ){ 
     temp.prev = null ; 
     temp.next = null ; 
     }
     else 
     {
     
     temp.prev=tail;
     temp.next=null;
     tail = temp;
     }
     
     size ++;
     System.out.println("Added successfully");
 
 }
 
 
 public void retrieveEnd(){
 if (tail ==null)
         System.out.println("The list is empty");
 else 
         System.out.println("The Last node is "+tail.data);
 
 
 }
 
 
 
 public void removeFromBegining(){
     if (head ==null)
         System.out.println("The list is empty");
     else {
         if (head ==tail)
         { head =null;
            tail =null;
         }
         else {
         // more than one node 
         
         Node temp= head;
         temp=temp.next ;
         temp.prev = null;
         head = head.next;
         }
         
     
     }
 }
 public void removeFromLast(){
    
     if (tail==null)
         System.out.println("The list is empty ");
     else {
     
        Node  temp = tail.prev;
        tail.prev=null;
        tail=temp;    
     
     }     
     
     
 
 
 }
    
    
    
    
}
