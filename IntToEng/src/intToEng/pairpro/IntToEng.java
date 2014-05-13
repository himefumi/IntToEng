package intToEng.pairpro;
import java.util.*;

public class IntToEng {
	 public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input = sc.next();
			System.out.println(tlanslateEng(input));
		    }
	 
		    static String tlanslateEng(String n) {
		    	// ƒ‰ƒCƒuƒ‰ƒŠW
		    	String[][] getNumber = { // 1‚ÌˆÊ
		    			{
		    				"zero","one","two","three","four","five",
		    				"six","seven","eight","nine"
		    			},{ // 10‚ÌˆÊ
		    				"","","twenty","thirty","fourty","fifty",
		    				"sixty","seventy","eighty","ninety"
		    			},{ 
		    				"one-hundred","two-hundreds","third-hundreds","four-hundreds","five-hundreds",
		    				"six-hundreds","seven-hundreds","eight-hundreds","nine-hundreds"
		    		    },{  // 10‚ÌŒ…
		    		    	"ten","elevn","twelve","therteen","fourteen","fifteen",
		    		    	"sixteen","seventeen","eighteen","nineteen"	
		    		    }};
		    	
		    	int count = 0;
		    	int[] cn = new int[n.length()];
		    	if(cn.length > 3) 
		    	    System.err.println("3Œ…‚Ü‚Å‚Ì“ü—Í");
		    	char[] change = new char[3];
		    	String result = "";
		    	
		    	for(int i=0; i<n.length(); i++) {
		    	    change[i]=n.charAt(n.length()-1-i);
		    	    cn[i] = Integer.parseInt(""+change[i]);
		    	}
		    	while(count < n.length()) {
		    	    if(count == 0 && cn[1] == 1) {
		    		result = getNumber[3][cn[count]];
		    		count++;
		    	    } else if(count == 1) {
		    		result = getNumber[count][cn[count]] + " " + result;
		    	    } else if(count == 2){
		    		result = getNumber[count][cn[count]-1] + " " + result;
		    	    } else {
		    		result = getNumber[count][cn[count]] + " " + result;
		    	    }
		    	    count++;
		    	}
		    	return result;
		        }   
		    }
