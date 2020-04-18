package Pack1;

/**
 * Created by Mohib on 11/13/2019.
 */
class IConstD implements IConst{
    public static void main(String args[]) {
        int nums[] = new int[MAX];
        for(int i=MIN;i<11;i++){
            if(i>=MAX ) System.out.println(ERRORMSG);
            else{
                nums[i]=i;
                System.out.print(nums[i]+" ");
            }
        }

    }
}
