/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;
public class BinaryTree {
    Node node ;
    
    class Node {
    int data ;
    Node LeftNode;
    Node RightNode; 
    private Node(int data){this.data=data;}
    
 
    
    public void insert(int data){
    
    if (this.data < data){
    if (LeftNode == null){
    LeftNode = new Node(data);
    }
    else 
        node.LeftNode.insert(data);
        
        }
    
    
    if (this.data>data){
    if (RightNode == null ){
    RightNode = new Node (data);
    }
    else 
    {
    RightNode.insert(data);
    }
        
    }
    
    
    }
    
    public boolean isContaine(int val){
    if (val == data)
        return true; 
    else 
    {
    if (val< data){
    if (LeftNode == null) 
        return false ;
    else 
        LeftNode.isContaine(val);
    
    }
    
    else 
    {
    if (RightNode ==null){
    
    return false ;
    }
    return RightNode.isContaine(val);
    
    }
    
    }
            
            return false ;
            
    
    }
    

    
    
    public void preOrder(){
        System.out.println(data);
        if (LeftNode!=null)
             LeftNode.inOrder();
  
  
     if (RightNode!=null)
         RightNode.inOrder(); 
            
    }
    public void inOrder(){
    //// left root right
    
    if (LeftNode!=null)
        LeftNode.inOrder();
    
    
        System.out.println(data);
        
        
     if (RightNode!=null)
         RightNode.inOrder(); 
    }
    public void postOrder(){
      if (LeftNode!=null)
        LeftNode.inOrder();
    
             
     if (RightNode!=null)
         RightNode.inOrder(); 
     
      
    System.out.println(data);
    }
    
    
    
    }

    
    
    
}
