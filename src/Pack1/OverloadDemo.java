package Pack1;

/**
 * Created by Mohib on 12/4/2019.
 */
class Overload{
    void ovlDemo(){
        System.out.println("no parameter");
    }
    //int ovlDemo(){}
    void ovlDemo(int a){
        System.out.println("one parameter "+a);
    }

    int ovlDemo(int a,int b){
        System.out.println("two int parameters "+a+" and "+b);
        return a+b;
    }
    double ovlDemo(double a,double b){
        System.out.println("two double parameters "+a+" and "+b);
        return a+b;
    }
}
class OverloadDemo {
    public static void main(String args[]){
        Overload ob=new Overload();
        int resI;
        double resD;

        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(4);
        System.out.println();

        resI= ob.ovlDemo(4,6);
        System.out.println("result of ob.ovlDemo(4,6):"+resI);
        System.out.println();

        resD= ob.ovlDemo(1.1,2.32);
        System.out.println("result of ob.ovlDemo(1.1,2.32):"+resD);


    }
}
