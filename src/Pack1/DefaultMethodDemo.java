package Pack1;

/**
 * Created by Mohib on 11/15/2019.
 */
class MyIFImp implements MyIF{
    public int getUserID(){
        return 100;
    }
}
public class DefaultMethodDemo {
    public static void main(String args[]){
        MyIFImp obj=new MyIFImp();

        System.out.println("User ID is "+obj.getUserID());
        System.out.println("Administrator ID is "+obj.getAdminID());
        int uID=MyIF.getUniversalID();
        System.out.println("Universal ID is "+uID);
    }
}
