import java.util.*;
class AnagramCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String str1=sc.nextLine();
        System.out.println("enter second string");
        String str2=sc.nextLine();
        System.out.println("whether they are anagrams"+ isAnagram(str1,str2));
    }

    public static boolean isAnagram(String s1,String s2){
        s1=s1.replaceAll("\\s","").toLowerCase();
        s2=s2.replaceAll("\\s","").toLowerCase();
        if(s1,length()!=s2.length()){
            return false;
        }
         char[] charArray1=s1.toCharArray();
         char[] charArray1=s1.toCharArray();
         Arrays.sort(charArray1);
         Arrays.sort(charArray2);
         return Arrays.equals(charArray1,charArray2)
    }
}











