
package constructoroverloading;


public class Student {
    String name,district;
    int roll;
    
    Student(){
        System.out.println("No information ");
        
    }
    Student(String n,String d){
        name=n;
        district=d;
    }
    Student(String n,String d,int r){
        name=n;
        district=d;
        roll=r;
        
    }
    void displayInformation(){
        System.out.println("Name:"+name);
        System.out.println("District :"+district);
        System.out.println("Roll :"+roll);   
    }
    
}
