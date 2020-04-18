package Pack1;

/**
 * Created by Mohib on 10/28/2019.
 */
class A{
    int i,j;
    A(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j: "+i+" "+j);
    }

}
class B extends A{
    int k;
    B(int a,int b,int c){
        super(a,b);
        k=c;
    }
    void show(String msg){
        System.out.println(msg+k);
    }
}
class Overload1 {
    public static void main(String args[]){
        B subOb=new B(6,7,8);
        subOb.show("This is k :");
        subOb.show();
    }
}
