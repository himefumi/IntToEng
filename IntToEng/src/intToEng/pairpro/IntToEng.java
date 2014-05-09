package intToEng.pairpro;
import java.util.Scanner;

public class IntToEng {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			System.out.println(tlanslateEng(input));
		    }
	 
		    static String tlanslateEng(String n) {
		    	String[] numberLibrary = {
		    			"","one","two","three","four","five",
		    			"six","seven","eight","nine","ten",
		    			"elevn","twelve","therteen","fourteen","fifteen",
		    			"sixteen","seventeen","eighteen","nineteen","twenty"
		    	};
			return "";
		    }

}
