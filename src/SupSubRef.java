/**
 * Created by Mohib on 10/26/2019.
 */
class X{
    int a;
    X(int i){a=i;}
}
class Y extends X{
    int b;
    Y(int i,int j){
        super(j);
        b=i;
    }
}

public class SupSubRef {
    public static void main(String args[]){
        X x=new X(5);
        X x2;
        Y y=new Y(6,7);
        x2=x;
        System.out.println("x2.a :"+x2.a);
        x2=y;
        System.out.println("x2.a :"+x2.a);
        //x2.b=3;

    }
}
