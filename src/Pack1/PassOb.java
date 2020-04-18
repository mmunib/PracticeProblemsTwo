package Pack1;

/**
 * Created by Mohib on 12/3/2019.
 */
class Block{
    int a,b,c;
    int volume;

    Block(int i,int j,int k){
        a=i;
        b=j;
        c=k;
        volume=a*b*c;
    }
    boolean sameDimension(Block ob){
        if((ob.a==a)&(ob.b==b)&(ob.c==c)) return true;
        else return false;
    }
    boolean sameVolume(Block ob){
        if (volume==ob.volume) return true;
        return false;
    }
}
public class PassOb {
    public static void main(String args[]){
        Block ob1=new Block(10,2,5);
        Block ob2=new Block(10,2,5);
        Block ob3=new Block(4,5,5);

        System.out.println("ob1 same dimension as ob2 :"+ob1.sameDimension(ob2));
        System.out.println("ob1 same dimension as ob3 :"+ob1.sameDimension(ob3));
        System.out.println("ob1 same volume as ob3 :"+ob1.sameVolume(ob3));
    }
}
