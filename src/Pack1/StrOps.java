package Pack1;

/**
 * Created by Mohib on 11/27/2019.
 */
public class StrOps {
    public static void main(String args[]){
        String str1="When it comes to web programming,Java is #1";
        String str2=new String(str1);
        String str3="Java strings are powerful";

        int result,idx;
        char ch;

        System.out.println("length of str1: "+str1.length());

        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 and str2 are equal");
        else
            System.out.println("str1 and str2 are not equal");

        if(str1.equals(str3))
            System.out.println("str1 and str3 are equal");
        else
            System.out.println("str1 and str3 are not equal");

        result=str1.compareTo(str3);
        if(result==0)
            System.out.println("str1 and str3 are equal");
        else if(result<0)
            System.out.println("str1 is less than str3");
        else
            System.out.println("str1 is greater than str3");

        str2="one two three one";
        idx=str2.indexOf("one");
         System.out.println("index of first occur of one in str2 "+idx);

        idx=str2.lastIndexOf("one");
        System.out.println("index of last occur of one in str2 "+idx);

    }
}
