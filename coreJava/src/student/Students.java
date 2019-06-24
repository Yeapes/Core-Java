
package student;


public class Students {
    
    String name,district,gender,religion;
    int roll,registration;
    
    
    void setInformation(String n,String d,String g,String rl, int r,int rn){
        
       name=n;
       district=d;
       gender=g;
       religion=rl;
       roll=r;
       registration=rn;
    
    }
    
    void displayInformation(){
        System.out.println("Student's name :"+name);
        System.out.println("District :"+district);
        System.out.println("Gender :"+gender);
        System.out.println("Religion :"+religion);
        System.out.println("Roll :"+roll);
        System.out.println("Registration :"+registration);
        
    }
    
  
    
}
