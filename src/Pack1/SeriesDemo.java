package Pack1;

/**
 * Created by Mohib on 11/10/2019.
 */
class ByTwos1 implements Series {
    int start;
    int val;
    int prev;

    ByTwos1(){
        start=0;
        val=0;
        prev=-2;
    }
    public int getNext(){
        prev=val;
        val+=2;
        return val;
    }
    public void reset(){
        val=start;
        prev=start-2;
    }
    public void setStart(int x)
    {
       start=x;
        val=x;
        prev=x-2;
    }
    int getPrevious(){
        return prev;
    }
}
class SeriesDemo {
    public static void main(String args[]){
        ByTwos1 ob=new ByTwos1();
        for(int i=0;i<5;i++)
            System.out.println("Next value is " + ob.getNext()+" Previous value is "+ob.getPrevious());

        System.out.println("\nResetting");
        ob.reset();

        for(int i=0;i<5;i++)
            System.out.println("Next value is " + ob.getNext()+" Previous value is "+ob.getPrevious());

        System.out.println("\nStarting at 100");
        ob.setStart(100);

        for(int i=0;i<5;i++)
            System.out.println("Next value is "+ob.getNext()+" Previous value is "+ob.getPrevious());

        int[] arr=new int[5];
        arr=ob.getNextArray(5);
        System.out.println("getNextArray:");
        for(int j=0;j<5;j++)
           System.out.print(arr[j]+" ");
    }
}

