package Pack1;

/**
 * Created by Mohib on 12/27/2019.
 */
class DWDemo {
    public static void main(String args[])
        throws java.io.IOException{
        char ch;
        do{
            System.out.print("Press a key followed by ENTER: ");
            ch=(char)System.in.read();
        }while(ch!='q');

    }
}