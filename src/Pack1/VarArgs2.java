package Pack1;

/**
 * Created by Mohib on 12/12/2019.
 */
public class VarArgs2 {
    static void vaTest(String msg,int...v){
        System.out.println(msg+v.length);
        System.out.println("Contents:");
        for(int i=0;i<v.length;i++)
            System.out.println("  arg "+i+":"+v[i]);
        System.out.println();
    }
    public static void main(String args[]){
        vaTest("One Vararg:",10);
        vaTest("Three Vararg:",6,7,8);
        vaTest("No Vararg:");
    }
}
