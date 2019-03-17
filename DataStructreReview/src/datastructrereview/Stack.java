/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructrereview;
import java.util.*;
public class Stack {
  private LinkedList linkedList =new LinkedList();



    Stack() {
    }
  
    public void push(int data){
    linkedList.add(data);
        System.out.println("Added "+data + "Successfully!");
    }
    
    public void pop(){
    linkedList.remove(linkedList.peekLast());
        System.out.println("Removed");
    }
    
   public void peek(){
   if (linkedList.isEmpty())
        throw  new  EmptyStackException();
   else 
         System.out.println("The top is "+linkedList.peekLast());
       
   } 
    
   
   
   
   
}
