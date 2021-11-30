package oopjlab112921;
import java.util.*;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Enter the character to be searched: ");
		char character=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(character==str.charAt(i))
				count++;
		}
		if(count==0)
			System.out.println("Character not present in the given string");
		else
		System.out.println("The frequency of the character is: "+count);
}
}
