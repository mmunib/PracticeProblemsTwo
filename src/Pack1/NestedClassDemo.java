package Pack1;

/**
 * Created by Mohib on 12/11/2019.
 */
class Outer{
    int nums[];

    Outer(int n[]){
        nums=n;
    }

    void analyze(){
        Inner inOb=new Inner();
        System.out.println("Minimum: "+inOb.min());
        System.out.println("Maximum: "+inOb.max());
        System.out.println("Average: "+inOb.avg());

    }
    class Inner{
        int min(){
            int m=nums[0];
            for(int i=1;i<nums.length;i++)
                if(nums[i]<m) m=nums[i];

            return m;
        }

        int max(){
            int m=nums[0];
            for(int i=1;i<nums.length;i++)
                if(nums[i]>m) m=nums[i];

            return m;
        }

        int avg(){
            int a=0;
            for(int i=0;i<nums.length;i++)
                a+=nums[i];
            return a/nums.length;

        }
    }
}
public class NestedClassDemo {
    public static void main(String args[]){
        int arr[]={6,4,7,1,3,2,9,5,8};
        Outer outOb=new Outer(arr);
        outOb.analyze();
    }
}
