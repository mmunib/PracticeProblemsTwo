package Pack1;

/**
 * Created by Mohib on 11/27/2019.
 */
public class Search {
    public static void main(String args[]){
        int nums[]={4,8,2,5,3,9,6};
        int val=7;
        boolean f=false;

        for(int x:nums){
            if(x==val){
                f=true;
                break;
            }
        }

        if(f)
            System.out.println("Value found");
        else
             System.out.println("Value not found");
    }
}
