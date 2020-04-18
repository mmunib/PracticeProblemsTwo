/**
 * Created by Mohib on 10/23/2019.
 */
class A{
    int i;

}
class B extends A{
    int i;
    B(int a,int b){
        super.i=a;
        i=b;
    }

    void show(){
        System.out.println("i in superclass "+super.i);
        System.out.println("i in subclass "+i);
    }

}
public class UseSuper {
    public static void main(String args[]) {

        B subObj = new B(3, 4);
        subObj.show();

    }
}
