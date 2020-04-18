package Pack1;

/**
 * Created by Mohib on 12/7/2019.
 */
class StaticDemo{
    int x;
    static int y;

    int sum(){
        return x+y;
    }
}
public class SDemo {
    public static void main(String args[]){

        StaticDemo ob1=new StaticDemo();
        StaticDemo ob2=new StaticDemo();

        ob1.x=10;
        ob2.x=20;

        System.out.println("Ofcourse instance variables are independent");
        System.out.println("ob1.x: "+ob1.x+"\nob2.x: "+ob2.x);

        System.out.println("Static variable y is shared");
        System.out.println("Set StaticDemo.y to 19");

        StaticDemo.y=19;
        System.out.println("ob1.sum():"+ob1.sum());
        System.out.println("ob2.sum():"+ob2.sum());

        System.out.println();

        System.out.println("Set StaticDemo.y to 100");
        StaticDemo.y=100;

        System.out.println("ob1.sum():"+ob1.sum());
        System.out.println("ob2.sum():"+ob2.sum());

    }
}
