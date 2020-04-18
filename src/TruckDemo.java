/**
 * Created by Mohib on 10/23/2019.
 */
class Vehicle{
    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p,int f,int m){
        passengers=p;
        fuelcap=f;
        mpg=m;
    }

    int range(){
        return fuelcap*mpg;
    }

    double fuelneeded(int miles){
        return (double)miles/mpg;
    }

    void setPassengers(int p){passengers=p;}
    int getPassengers(){return passengers;}
    void setFuelcap(int f){fuelcap=f;}
    int getFuelcap(){return fuelcap;}
    void setMpg(int m){mpg=m;}
    int getMpg(){return mpg;}

}

class Truck extends Vehicle{
    private int cargocap;

    Truck(int p,int f,int m,int c){
        super(p,f,m);
        cargocap=c;
    }

    void putCargo(int c){cargocap=c;}
    int getCargo(){return cargocap;}
}
public class TruckDemo {
    public static void main(String args[]){

        Truck semi=new Truck(2,200,7,44000);
        Truck pickup=new Truck(3,28,15,2000);
        double gallons;
        int dist=252;

        gallons=semi.fuelneeded(dist);
        System.out.println("Semi can carry "+semi.getCargo()+" pounds");
        System.out.println("To go "+dist+" miles semi needs "+gallons+" gallons of fuel\n");

        gallons=pickup.fuelneeded(dist);
        System.out.println("Pickup can carry "+pickup.getCargo()+" pounds");
        System.out.println("To go "+dist+" miles pickup needs "+gallons+" gallons of fuel\n");

    }
}
