package Pack1;

/**
 * Created by Mohib on 12/2/2019.
 */
class MyClass2{
    private int alpha;
    public int bets;
    int gamma;
    void setAlpha(int a){
        alpha=a;
    }
    int getAlpha(){
        return alpha;
    }

}
public class AccessDemo {
    public static void main(String args[]){
        MyClass2 ob=new MyClass2();
        ob.setAlpha(-99);
        System.out.println("alpha is "+ob.getAlpha());


    }
}
