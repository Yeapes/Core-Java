
package linkedListDemo;

import java.util.LinkedList;


public class LinkedListDemo {
    
    public static void main(String[] args){
       //Student linkedlist
        LinkedList<Students> s=new LinkedList<Students>();
        
        //create student
        Students s1=new Students(01,"Yeapes","Eleven");
        Students s2=new Students(02,"Raihan","Eleven");
        Students s3=new Students(03,"Rakib","Eleven");
        Students s4=new Students(04,"Rahat","Eleven");
        Students s5=new Students(05,"Anisul Islam","Eleven");
        
        //adding student information
        
  
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        
        for(Students ss: s){
            
            System.out.println("id :"+ss.id+" "+"Name :"+ss.name+" "+"Class :"+ss.className+" ");
            
        }
        
        

    }
    
    
    
    
    
    
}
