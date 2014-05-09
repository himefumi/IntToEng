package intToEng.pairpro;
import java.util.Scanner;

public class IntToEng {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			System.out.println(tlanslateEng(input));
		    }
	 
		    static String tlanslateEng(String n) {
		    	// ƒ‰ƒCƒuƒ‰ƒŠW
		    	String[] first = {
		    			"zero","one","two","three","four","five",
		    			"six","seven","eight","nine","twenty"
		    	};
		    	String[] ten = {
		    			"ten","elevn","twelve","therteen","fourteen","fifteen",
		    			"sixteen","seventeen","eighteen","nineteen"	
		    	};
		    	String[] second = {
		    			"","","twenty","thirty","fourty","fifty",
		    			"sixty","seventy","eighty","ninety"
		    	};
		    	String[] hundred = { "hundred","hundreds" };
		    	
			return "";
		    }

}
