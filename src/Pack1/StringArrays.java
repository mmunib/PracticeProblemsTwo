package Pack1;

/**
 * Created by Mohib on 11/28/2019.
 */
public class StringArrays {
    public static void main(String args[]){
        String strs[]={"This","is","a","test"};

        System.out.println("Original Array: ");
        for(String s:strs)
            System.out.print(s+' ');
        System.out.println("\n");
        strs[1]="was";
        strs[3]="test,too!";

        System.out.println("Modified Array: ");
        for(String s:strs)
            System.out.print(s+' ');


    }
}
