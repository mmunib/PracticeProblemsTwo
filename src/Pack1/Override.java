package Pack1;

/**
 * Created by Mohib on 10/28/2019.
 */
class D{
    int i,j;

    D(int a,int b){
        i=a;
        j=b;
    }

    void show(){
        System.out.println("i and j: "+i+" "+j);
    }
}

class E extends D{
    int k;
    E(int a,int b,int c){
        super(a,b);
        k=c;
    }
    void show(){
        super.show();
        System.out.println("k: "+k);
    }

}
public class Override {
    public static void main(String args[]){
        E subOb=new E(3,4,5);
        subOb.show();

    }
}
