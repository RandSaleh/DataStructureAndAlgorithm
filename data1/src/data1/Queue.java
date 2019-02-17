/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;
public class Queue {
  private Node head ;
  private  Node tail; 
  private class Node {
  private int data ; 
  private  Node nextNode;
  private Node(int data){this.data=data;}  
  }
  public Queue(){
  head = null ; 
  tail = null ; 
  }
  public void add(int data){
  Node newNode= new Node(data);
  if (head == null && tail == null){
  newNode.nextNode =null ;
  head = newNode;
  tail = newNode;
  }
  if (tail != null ){
  newNode.nextNode = head ;
  tail = newNode;
  }
  }
  public void remove(){
      
  if (tail==head)
  {
  tail=null;
  head=null ;
  }
  else 
  tail=tail.nextNode;
  
  }
  public void retrive(){
      if (head != null)
      
      System.out.println("The order is for  "+ head.data);
      
      else {
      
          System.out.println("It's Empty");
      }
  }
}
