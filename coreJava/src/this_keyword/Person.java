
package this_keyword;
//using this keyword in constructor method


public class Person {
    
    String name,haircolor;
    int age;
    
    
    Person(String name,String haircolor,int age){
        
        this(name,haircolor);
        this.age=age;
           
    }

    Person(String name,String haircolor){
        
        this.name=name;
        this.haircolor=haircolor;
        
        
    }
    
    void display(){
        
        System.out.println("Name is :"+name);
        System.out.println("Haircolor is :"+haircolor);
        System.out.println("Age is :"+age);
        
        
    }
    
    
    
    
    
    
    
}
