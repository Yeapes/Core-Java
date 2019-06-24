
package constructoroverloading;


public class TestConstructor {
    public static void main(String[] args){
        
        Student student1=new Student();
        
        Student student2=new Student("Md Yeapes","Noakhali");
        student2.displayInformation();
        Student student3=new Student("Md Raisul Kobir","Jamalpur",283170);
        student3.displayInformation();
        
        
        
        
    }
            
            
            
    
}
