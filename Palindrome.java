
import java.io.*;

public class Palindrome{

	public static void main(String Args[])throws IOException{
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a word: ");
		String str = x.readLine();
		
		char word[] = str.toCharArray();
		int q = word.length-1;
		
		System.out.print("palindrome?: " + isPalindrome(word,0,q));
	}
	public static boolean isPalindrome(char word[],int p, int q){
		if(word[p] != word[q]) return false;
		if(p == q) return true;
		else if(p+1 == q) return true;
		
		return isPalindrome(word,p+1,q-1);
	}

}