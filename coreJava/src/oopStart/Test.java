
package oopStart;


public class Test {
    public static void main(String[] args){
        
        Teacher teacher1; //object declare;
        System.out.println("Electronics  Technolgy Teacher :");//print teacher department
        teacher1=new Teacher(); //create object;
        
        
        teacher1.name="Md Yeapes";
        teacher1.gender="Male";
        teacher1.phone=01767734016;
        teacher1.DisplayInformation();

        System.out.println("\n\n"+"Computer Technolgy Teacher :");
        Teacher teacher2=new Teacher();
        
        teacher2.name="Rakib Hossain Rabbi";
        teacher2.gender="Male";
        teacher2.phone=1355;
        teacher2.DisplayInformation();
        
 
    }

}
