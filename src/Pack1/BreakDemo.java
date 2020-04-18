package Pack1;

/**
 * Created by Mohib on 12/27/2019.
 */
class BreakDemo {
    public static void main(String args[]){
        int num=100;
        for(int i=0;i<num;i++){
            if(i*i>=100) break;
            System.out.print(i+" ");
        }
        System.out.print("Loop complete");
    }
}
