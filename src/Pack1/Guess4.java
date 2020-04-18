package Pack1;

/**
 * Created by Mohib on 12/27/2019.
 */
class Guess4 {
    public static void main(String args[])
        throws java.io.IOException{
        char ch,ignore,answer='K';
        do{
            System.out.println("I am thinking of a letter");
            System.out.print("Can you guess it ");
            ch=(char)System.in.read();
            do{
                ignore=(char)System.in.read();
            }while(ignore!='\n');

            if(ch==answer) System.out.println("**RIGHT**");
            else{
                if(ch<answer) System.out.println("you're too low");
                else System.out.println("you're too high");
                System.out.print("try again\n");
            }
        }while(answer!=ch);

    }

}

