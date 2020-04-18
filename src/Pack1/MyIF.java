package Pack1;

/**
 * Created by Mohib on 11/15/2019.
 */
public interface MyIF {
    int getUserID();
    default int getAdminID(){
        return 1;
    }
    static int getUniversalID(){
        return 0;
    }
}
