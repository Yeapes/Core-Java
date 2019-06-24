
package instanceofclass;


public class Test {
    public static void main(String[] args){
       Animal a1=new Animal();
       Person p1=new Person();
       Teacher t1=new Teacher();
       
       //that is one jkind of inheritance check;
       System.out.println(a1 instanceof Animal );
       System.out.println(p1 instanceof Person);
       System.out.println(t1 instanceof Person);
       System.out.println(t1 instanceof Animal);
       System.out.println(p1 instanceof Teacher);
       
       
       
       
       
        
        
        
        
        
    }
    
}
