package Pack1;

/**
 * Created by Mohib on 11/25/2019.
 */
public class Squares {
    public static void main(String args[]){
        int sqrs[][]={{1,1},
            {2,4},{3,9},{4,16},{5,25}};

        int i,j;
        for(i=0;i<5;i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(sqrs[i][j] + " ");

            }
            System.out.println();
        }
    }
}
