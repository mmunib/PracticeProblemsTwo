package Pack1;

/**
 * Created by Mohib on 12/27/2019.
 */
class Break2 {
    public static void main(String args[])
    throws java.io.IOException{
        char ch;
        for(;;){
            ch=(char)System.in.read();
            if(ch=='q') break;
        }
        System.out.println("you pressed q");
    }
}
