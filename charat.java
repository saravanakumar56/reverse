package reversestring;

import java.util.Scanner;

public class charat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String start,last = "";
		Scanner first = new Scanner(System.in);
		try{
		System.out.println("Enter the string ");
		start = first.nextLine();
		int length = start.length();
		for(int i=length-1; i>=0;i-- )
			last = last+start.charAt(i);
		System.out.println("reversed string"+ " " +last);
		}
		finally{
			first.close();
		}
	}

}
