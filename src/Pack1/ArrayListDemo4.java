package Pack1;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by Mohib on 1/4/2020.
 */
class ArrayListDemo4 {
    public static void main(String args[]){
        ArrayList<Integer> myNumbers=new ArrayList<Integer>();
        myNumbers.add(23);
        myNumbers.add(34);
        myNumbers.add(18);
        myNumbers.add(3);

        Collections.sort(myNumbers);
        for(int i:myNumbers)
            System.out.println(i);

    }
}
