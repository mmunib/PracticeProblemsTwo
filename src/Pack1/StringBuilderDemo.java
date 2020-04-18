package Pack1;

/**
 * Created by Mohib on 1/4/2020.
 */
class StringBuilderDemo {
    public static void main(String args[]){
        StringBuilder strBuilder=new StringBuilder("Umbrella");
        /*strBuilder.append("JavaGuru");
        System.out.println(strBuilder);
        strBuilder.append(101);
        System.out.println(strBuilder);*/
        //strBuilder.insert(1,"Java");
        strBuilder.replace(2,4,"Java");
        //strBuilder.reverse();
        System.out.println(strBuilder);
    }
}
