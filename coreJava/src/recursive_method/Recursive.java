
package recursive_method;


public class Recursive {
    //Recursive Call
    //Base Case;
    int fact(int n){
        
        if(n==1)
            return 1;
        else
          return  n*fact(n-1);
    }
    
    
}
