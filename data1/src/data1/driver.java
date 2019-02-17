/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data1;

/**
 *
 * @author actc
 */
public class driver {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.add(20);
        q1.add(40);
        q1.retrive();
        q1.remove();
        q1.remove();
        q1.retrive();  
        
        
      //-----------
      Stack stack = new Stack();
      stack.push(1);
      stack.push(3);
      stack.pop();
        System.out.println(" the top of the stack now is  : "+stack.retrieve());
      
      
    }
    
    
}
