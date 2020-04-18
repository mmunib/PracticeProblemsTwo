package Pack1;

/**
 * Created by Mohib on 11/24/2019.
 */
public class MinMax2 {
    public static void main(String args[]){

        int nums[]={20,1,-3,87,-14,76,34,3,27,-30};
        int min,max;

        min=max=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }

        System.out.println("min:"+ min+"   max:"+max);
    }
}
