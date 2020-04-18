package Pack1;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by Mohib on 1/3/2020.
 */
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<String> cars=new ArrayList<String>();

        cars.add("Honda");
        cars.add("Volvo");
        cars.add("Mazda");
        cars.add("BMW");
        /*System.out.println(cars.get(1));
        cars.set(1,"Toyota");
        System.out.println(cars.get(1));
        System.out.println(cars);
        cars.remove(1);
        for(int i=0;i<cars.size();i++)
           System.out.println(cars.get(i));*/
        Collections.sort(cars);
        for(String i:cars)
            System.out.println(i);
    }
}
