package Pack1;

/**
 * Created by Mohib on 10/30/2019.
 */
class DynTwoDShape{
    private double width;
    private double height;
    private String name;

    DynTwoDShape(){
        width=height=0.0;
        name="none";
    }

    DynTwoDShape(double w,double h,String n){
        width=w;
        height=h;
        name=n;
    }

    DynTwoDShape(double x,String n){
        width=height=x;
        name=n;
    }

    DynTwoDShape(DynTwoDShape ob){
        width=ob.width;
        height=ob.height;
        name=ob.name;
    }

    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width=w;}
    void setHeight(double h){height=h;}

    String getName(){return name;}
    void showDim(){
        System.out.println("Width and Height are "+width+" and "+height);
    }

    double area(){
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

class DynTriangle extends DynTwoDShape{
    private String style;

    DynTriangle(){
        super();
        style="none";

    }
    DynTriangle(String s,double w,double h){
        super(w,h,"DynTriangle");
        style=s;

    }
    DynTriangle(double x){
        super(x,"DynTriangle");
        style="filled";
    }

    DynTriangle(DynTriangle ob){
        super(ob);
        style=ob.style;
    }

    double area(){
        return getWidth()*getHeight()/2 ;
    }

    void showStyle(){
        System.out.println("DynTriangle is "+style);
    }
}
class DynRectangle extends DynTwoDShape{
    DynRectangle(){
        super();
    }
    DynRectangle(double w,double h){
        super(w,h,"DynRectangle");
    }

    DynRectangle(double x){
        super(x,"DynRectangle");
    }
    DynRectangle(DynRectangle ob){
        super(ob);
    }
    boolean isSquare(){
        if(getWidth()==getHeight()) return true;
        return false;
    }

    double area(){
        return getWidth()*getHeight();
    }
}
public class DynShapes {
    public static void main(String args[]){
        DynTwoDShape shapes[]=new DynTwoDShape[5];
        shapes[0]=new DynTriangle("outlined",8.0,12.0);
        shapes[1]=new DynRectangle(10);
        shapes[2]=new DynRectangle(10,4);
        shapes[3]=new DynTriangle(7.0);
        shapes[4]=new DynTwoDShape(10,20,"generic");

        for(int i=0;i<shapes.length;i++){
            System.out.println("object is "+shapes[i].getName());
            System.out.println("Area is "+shapes[i].area());
            System.out.println();
        }
    }
}

