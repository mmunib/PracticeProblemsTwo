package Pack1;

/**
 * Created by Mohib on 12/3/2019.
 */
class ErrorMsg{
    String msgs[]={
            "Input Error","Output Error","Disk Full","Index Out of Bound" };

    String ShowErrMsg(int i){
        if(i>=0 & i<msgs.length)
            return msgs[i];
        return "Invalid error code";
    }
}
class ErrMsg {
    public static void main(String args[]){
        ErrorMsg err=new ErrorMsg();
        System.out.println(err.ShowErrMsg(2));
        System.out.println(err.ShowErrMsg(19));
    }
}
