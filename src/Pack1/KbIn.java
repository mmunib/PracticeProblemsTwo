package Pack1;

/**
 * Created by Mohib on 12/23/2019.
 */
public class KbIn {
    public static void main(String args[])
        throws java.io.IOException{
        char ch;
        System.out.print("Press a key followed by ENTER: ");
        ch=(char)System.in.read();

        System.out.println("your key is "+ch);

    }

}
