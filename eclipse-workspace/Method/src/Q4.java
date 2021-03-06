
public class Q4 {
	
	//Write a recursive program to efficiently reverse a given string. For example:
		//Google Drive
		//evirD elgooG

	 private static void swap(char[] c, int i, int j) {
	    
	        char temp = c[i];
	        c[i] = c[j];
	        c[j] = temp;
	    }
	 
	   
	    public static void reverse(char[] c, int l, int h)
	    {
	        if (l < h)
	        {
	            swap(c, l, h);
	            reverse(c, l + 1, h - 1);
	        }
	    }
	 
	    public static void main(String[] args)
	    {
	        String str = "Google Drive";
	 
	        char[] c = str.toCharArray();
	        reverse(c, 0, c.length - 1);
	        str = new String(c);
	 
	        System.out.print("Reverse of the Google Drive is " + str);
	    }
	}
