package Pack1;

/**
 * Created by Mohib on 1/8/2020.
 */
//A comment for GitHub
class UniChar{
    public static boolean isUniqueChars(String str){
        if(str.length()>128) return false;
        boolean[] char_set=new boolean[128];
        for(int i=0;i<str.length();i++){
            int val=str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val]=true;
        }
        return true;
    }
}
class UniqueChars {
    public static void main(String args[]){
        String s1="asdhatrcvbzx";
        boolean b=UniChar.isUniqueChars(s1);


        if(b) System.out.println("String has unique chars");
        else System.out.println("String doesnt have unique chars");

    }
}
