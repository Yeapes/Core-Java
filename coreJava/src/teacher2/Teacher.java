
package teacher2;
public class Teacher {
    String name,gender,district;
    int phone;
    void setInformation(String n,String g,String d,int p){
       name=n;
       gender=g;
       district=d;
       phone=p;
        
    }
    void disPlayInformationj(){
        System.out.println("Name's is :"+name); 
        System.out.println("Gender :"+gender);
        System.out.println("District :"+district);
        System.out.println("Phone :"+phone);
    }
 
}
