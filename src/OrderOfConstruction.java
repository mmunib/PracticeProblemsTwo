/**
 * Created by Mohib on 10/26/2019.
 */
class E{
    E(){
        System.out.println("Constructing E");
    }
}
class F extends E {
    F() {
        System.out.println("Constructing F");
    }
}

class G extends F{
    G(){
        System.out.println("Constructing G");
    }

}
public class OrderOfConstruction {
    public static void main(String args[]){
        G g =new G();
    }
}
