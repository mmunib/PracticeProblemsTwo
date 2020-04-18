package Pack1;

/**
 * Created by Mohib on 11/11/2019.
 */
class ByThrees1 implements Series{
    int start;
    int val;

    ByThrees1(){
        start=0;
        val=0;
    }
    public int getNext(){
        val+=3;
        return val;
    }
    public void reset(){
        val=start;
    }
    public void setStart(int x){
        start=x;
        val=x;
    }
}
public class SeriesDemo1 {
    public static void main(String args[]){
        ByThrees1 ob=new ByThrees1();

        for(int i=0;i<5;i++)
            System.out.println("Next value is "+ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for(int i=0;i<5;i++)
            System.out.println("Next value is "+ob.getNext());

        System.out.println("\nStarting at 100");
        ob.setStart(100);

        for(int i=0;i<5;i++)
            System.out.println("Next value is "+ob.getNext());

    }

}
