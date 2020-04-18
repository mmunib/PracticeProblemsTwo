package Pack1;

/**
 * Created by Mohib on 11/25/2019.
 */
public class TwoD {
    public static void main(String args[]){
        int table[][]=new int[3][4];
        int t,i;
        for(t=0;t<3;++t){
            for(i=0;i<4;i++){
               table[t][i]=t*4+i+1;
                System.out.print(table[t][i]+" ");
            }
        }



    }
}
