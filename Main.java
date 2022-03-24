package fetchingmiddlecharacter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word : ");
		String s = sc.next();
		String str = UserMainCode.getMiddleChars(s);//function call
		System.out.println("A Middle Character : " + str);
		sc.close();
	}


	}


