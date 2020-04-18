package Pack1;

/**
 * Created by Mohib on 12/12/2019.
 */
public class VarArgs {
    static void vaTest(int...v){
        System.out.println("Number of arguments: "+v.length);
        System.out.println("Contents:");
        for(int i=0;i<v.length;i++)
            System.out.println(" arg "+i+":"+v[i]);
        System.out.println();
    }

    public static void main(String args[]){
        vaTest(10);
        vaTest(7,8,9);
        vaTest();

    }
}
