package data1;
public class Stack {
    
Node Top;    
    
    
 private class Node{
 int data;
 Node nextNode; 
 private Node (int data){
 this.data=data;
 }
 }   
 
 public void  pop(){
 
     if (Top == null){
         System.out.println("It's empty");
     }
     
     else {
     
         System.out.println(" the cell "+ Top.data +" Deleted ");
         Top = Top.nextNode ;
         
     
     }
     
 
 }
 public void push(int data){
 Node newNode = new Node(data);
 
     if (Top ==null){
     Top = newNode;
     Top.nextNode=null;
     }
     
     else {
     newNode.nextNode=Top;
     
     Top = newNode ;
     
     
     }
 
 }
 public int  retrieve(){
 
     return Top.data;
 
 }
    
    
    
    
}
