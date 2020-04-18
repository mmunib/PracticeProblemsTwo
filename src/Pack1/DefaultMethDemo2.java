package Pack1;

/**
 * Created by Mohib on 11/15/2019.
 */
class MyIFImp2 implements MyIF{
    public int getUserID(){
        return 100;
    }
    public int getAdminID(){
        return 42;
    }
}
public class DefaultMethDemo2 {
    public static void main(String args[]){
        MyIFImp2 obj=new MyIFImp2();

        System.out.println("User ID is "+obj.getUserID());
        System.out.println("Administrator ID is "+obj.getAdminID());
    }
}
