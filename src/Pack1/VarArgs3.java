package Pack1;

/**
 * Created by Mohib on 12/13/2019.
 */
public class VarArgs3 {
    static void vaTest(int...v){
        System.out.println("vaTest(int...): Number of args:"+v.length);
        System.out.println("Contents:");
        for(int i=0;i<v.length;i++)
            System.out.println("Arg "+i+":"+v[i]);

        System.out.println();
    }
    static void vaTest(boolean...v){
        System.out.println("vaTest(boolean...): Number of args:"+v.length);
        System.out.println("Contents:");
        for(int i=0;i<v.length;i++)
            System.out.println("Arg "+i+":"+v[i]);

        System.out.println();
    }
    static void vaTest(String msg,int...v){
        System.out.println("vaTest(String,int...): "+msg+ v.length);
        System.out.println("Contents:");
        for(int i=0;i<v.length;i++)
            System.out.println("Arg "+i+":"+v[i]);
        System.out.println();
    }

    public static void main(String args[]){
        vaTest(3,6,8);
        vaTest("Testing :",7,23);
        vaTest(false,true,true);
    }
}
