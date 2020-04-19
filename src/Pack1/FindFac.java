package Pack1;

/**
 * Created by Mohib on 12/30/2019.
 */
//A new comment
class FindFac {
    public static void main(String args[]){
        for(int i=2;i<25;i++){
            System.out.print("factors of "+i+" : ");
            for(int j=2;j<i;j++)
                if((i%j)==0)
                    System.out.print(j+" ");
            System.out.println();
        }
    }
}
