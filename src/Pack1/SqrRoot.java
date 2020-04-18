package Pack1;

/**
 * Created by Mohib on 12/24/2019.
 */
public class SqrRoot {
    public static void main(String args[]){
        double num,sroot,rerr;

        for(num=1.0;num<10.0;num++){
            sroot=Math.sqrt(num);
            System.out.println("Sqr Root of "+num+" is "+sroot);

            rerr=num-(sroot*sroot);
            System.out.println("Rounding error is "+rerr);
            System.out.println();

        }
    }
}
