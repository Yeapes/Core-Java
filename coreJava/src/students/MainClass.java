
package students;
public class MainClass {
    public static void main(String[] args){
        
        System.out.println("Electronics Department student:");
        Students student1=new Students();//Declare object and create ;
        student1.name="Hridoy Khan";
        student1.gender="Male";
        student1.department="Electronics ";
        student1.roll=283197;
        student1.session=283197;
        student1.StudentsInformation();
        
        System.out.println("\n\n"+"Computer Department student :");
        Students student2=new Students();
        student2.name="Md Yeapes";
        student2.gender="Male";
        student2.department="Computer";
        student2.roll=283193;
        student2.session=283197;
        student2.StudentsInformation();

    }
    
}
