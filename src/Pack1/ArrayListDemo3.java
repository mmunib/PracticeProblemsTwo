package Pack1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/**
 * Created by Mohib on 1/4/2020.
 */
class ArrayListDemo3 {
    public static void main(String args[]){
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        //System.out.println(cars.size());
        //System.out.println(cars.get(1));
        //cars.set(1,"Toyota");
        //cars.remove(2);
        //System.out.println(cars.size());
        /*for(int i=0;i<cars.size();i++)
            System.out.println(cars.get(i));*/
        Collections.sort(cars);
        for(String i:cars)
            System.out.println(i);

    }
}
