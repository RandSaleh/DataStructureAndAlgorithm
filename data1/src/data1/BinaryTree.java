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
    if (node.LeftNode == null){
    LeftNode = new Node(data);
    }
    else 
        node.LeftNode.insert(data);
        
        }
    
    
    if (this.data>data){
    
    }
    
    
    }
    }

    
    
    
}
