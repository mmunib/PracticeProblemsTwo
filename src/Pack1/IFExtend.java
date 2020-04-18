package Pack1;

/**
 * Created by Mohib on 11/13/2019.
 */
class MyClass1 implements J{
    public void meth1(){
        System.out.println("Implement meth1().");
    }
    public void meth2(){
        System.out.println("Implement meth2().");
    }
    public void meth3(){
        System.out.println("Implement meth3().");
    }
}
class IFExtend {
    public static void main(String args[]){
        MyClass1 ob=new MyClass1();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
