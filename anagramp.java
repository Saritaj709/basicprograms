import java.util.Arrays;
public class anagramp
{
public static void main(String[] args)
{  
String s1 = "abcd";
    String s2 = "dcba";
    boolean isAnagram = false;
    if (s1.length() == s2.length()) {
        char[] s1AsChar = s1.toCharArray();
        char[] s2AsChar = s2.toCharArray();
        Arrays.sort(s1AsChar);
        Arrays.sort(s2AsChar);
        isAnagram = Arrays.equals(s1AsChar, s2AsChar);
   if(isAnagram==true)
    System.out.println("Strings are anagram");
else
System.out.println("Strings are not anagram");
    } 
}
}
