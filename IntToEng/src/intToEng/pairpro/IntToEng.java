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
		    	
		    	int count = 0;
		    	int[] cn = new int(3);
		    	char[] change = new char(3);
		    	String result;
		    	
		    	for(int i=0; i<n.length(); i++) {
		    		change[i]=n.charAt(n.length()-1-i);
		    	}
		    	while(count<3 && change[count]!=null) {
		    		cn[count] = Intger.parseInt(change[2-count]);
		    		result = first[cn[count]] + result;
		    		count++;
		    	}
		    	
			return result;
		    }

}
