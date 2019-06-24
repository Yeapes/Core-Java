
package teacher2;


public class Test {
    public static void main(String[] args){
        
        Teacher teacher1=new Teacher();
        System.out.println("Teacher 1 information :");
        
        teacher1.setInformation("Yeapes","Male","Noakhali",0133374);
        teacher1.disPlayInformationj();

        Teacher teacher2=new Teacher();
        
        teacher2.setInformation("Raisul Kobir", "Male", "Jamalpur", 07767);
        teacher2.disPlayInformationj();
        
        
        Teacher teacher3=new Teacher();
        
        teacher3.setInformation("Abdul Owhab", "Male", "Hatiya", 1213232);
        teacher3.disPlayInformationj();
    }
}
