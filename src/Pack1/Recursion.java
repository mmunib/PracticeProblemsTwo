package Pack1;

/**
 * Created by Mohib on 12/6/2019.
 */
class Factorial{
    int factR(int n){
        int result;
        if(n==1) return 1;
        result=factR(n-1)*n;
        System.out.println("result: "+result);
        return result;
    }
    int factI(int n){
        int t,result=1;

        for(t=1;t<=n;t++)
            result*=t;
        return result;
    }
}
public class Recursion {
    public static void main(String args[]){
        Factorial f=new Factorial();
        System.out.println("Factorials using recursive method ");
      //  System.out.println("factorial of 3 is "+f.factR(3));
      // System.out.println("factorial of 4 is "+f.factR(4));
        System.out.println("factorial of 5 is "+f.factR(5));

     /*   System.out.println("Factorials using iterative method ");
        System.out.println("factorial of 3 is "+f.factI(3));
        System.out.println("factorial of 4 is "+f.factI(4));
        System.out.println("factorial of 5 is "+f.factI(5));*/
    }
}
