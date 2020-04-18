package Pack1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/**
 * Created by Mohib on 1/3/2020.
 */
public class ArrayListDemo2 {
    public static void main(String args[]){
        ArrayList<Integer> myNumbers=new ArrayList<Integer>();
        myNumbers.add(20);
        myNumbers.add(15);
        myNumbers.add(30);
        myNumbers.add(5);
        Collections.sort(myNumbers);
        for(int i:myNumbers)
            System.out.println(i);
    }
}
