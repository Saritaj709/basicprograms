

package com.bridgelabz.datastructures;
import com.bridgelabz.Ulist.ListUtility;
import com.bridgelabz.utility.Node;
import com.bridgelabz.utility.Utility1;

public class unorderedList {
static Node start;
ListUtility ListUtility=new ListUtility();
Utility1 Utility=new Utility1();
public unorderedList()
{
     try {
    	 start=ListUtility.readFile(start);
    	 System.out.println("enter the word to search:");
    	 String word1=Utility.inputString();
    	 // Search the word//
    	 start=ListUtility.searchData(start,word1);
    	 String word2=" ";
    	 
    	 while(start!=null)
    	 {
    		 word2=word2+start.data;
    		 word2=word2+" ";
    		 start=start.nextNode;
    	 }
    	 // Utility.writeToFile(start)
    	 ListUtility.writeDataToFile(word2);	
	}
     catch(NullPointerException n)
     {
    	 System.out.println(n);
     }
	// end of method  
     }
     public static void main(String[] args)
 	{
    	unorderedList l1=new unorderedList(); 
    	//System.out.println("The list of words to the file are:");
}
     }
