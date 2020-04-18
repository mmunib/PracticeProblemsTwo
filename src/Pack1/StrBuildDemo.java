package Pack1;

/**
 * Created by Mohib on 1/5/2020.
 */
class StrBuildDemo {
    public static void main(String args[]){
        StringBuilder strBuider=new StringBuilder();
        /*strBuider.append("JavaGuru");
        System.out.println(strBuider);
        strBuider.append(101);
        strBuider.insert(2,"Java");
        strBuider.replace(3,4,"Java");
        strBuider.reverse();
        strBuider.delete(2,4);*/

        System.out.println(strBuider.capacity());
        strBuider.append("1234");
        System.out.println(strBuider.capacity());
        strBuider.append("123456789101112");
        System.out.println(strBuider.capacity());
        strBuider.append(1);
        System.out.println(strBuider.capacity());

        StringBuilder strBuider2=new StringBuilder("1234");
        System.out.println(strBuider2);
    }
}
