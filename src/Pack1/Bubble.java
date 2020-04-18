package Pack1;

/**
 * Created by Mohib on 11/25/2019.
 */
public class Bubble {
    public static void main(String args[]){
        int nums[]={23,-10,89,7,56,12,-3,97,4};
        int a,b,t;
        int size=nums.length;
        System.out.println("Unsorted array ");
        for(int i=0;i<size;i++)
            System.out.print(nums[i]+" ");

        for(a=1;a<size;a++){
            for(b=size-1;b>=a;b--) {
                if (nums[b - 1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted array ");
        for(int i=0;i<size;i++)
            System.out.print(nums[i]+" ");

    }
}
