
package oopStart;

//Constructor program ,,,two kind of constructor have in java..
//Default Constructor,Paramiterized Constructor
//Construcor is a spectial method,must be same of the class name;
//Object intialized ,have no return type even void
public class Constructor {
   
    String name ,district;
    int phone;
    //default constructor
    Constructor(){
        System.out.println("no value");  
    }
    
    Constructor(String n,String d,int p){
       name=n;
       district=d;
       phone=p;

    }
   void displayInformation(){
       
       System.out.println("Name is  :"+name);
       System.out.println("District is :"+district);
       System.out.println("Phone Number :"+phone);
       
       
   }
    
    
    
    
    
    
}
