
import java.util.*;
public class Split {
	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/


		sandwich("apples pineapples bread lettus tomato bacon mayo ham bread cheese", "bread");
		//You will know if there are two breads if there is a space

	}
	public static void sandwich(String str, String keyWord) {
		//System.out.println(Arrays.toString(str.split(keyWord)));
		String[] afterBread = str.split(keyWord);
		String filling = null;
		for (int i = 0; i < afterBread.length; i++)
			filling = afterBread[i]; 
			System.out.println(filling);
	}
	
/* private int findKeyword(String statement, String goal, int startPos) { //searches for a word in the user's input
	String phrase = statement.trim(); 
	int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos); //allows the code to find the index of a specified character or string in the user's input when starting the search at a specific index.
	while (psn >= 0) { 	//the while loop makes sure the specified string (i.e. goal) isn't part of another word
		String before = " ", after = " ";
		if (psn > 0) {
			before = phrase.substring(psn - 1, psn).toLowerCase(); //Finds the character of length 1 before the word
		}
		if (psn + goal.length() < phrase.length()) {
			after = phrase.substring(psn + goal.length(), //Finds the character of length 1 after the word
					psn + goal.length() + 1).toLowerCase();
		}
		if (before.equals(" ") && after.equals(" ")) { //The specified string is a word in the user's input if there are spaces before and after the substring
			return psn;
		}
		psn = phrase.indexOf(goal.toLowerCase(), psn + 1); //If the actual word was not found, the program continues to search if the user's input once again contains the specified string
	}
	return -1; //returns -1 if the specified string is not found
}*/	


}
