package ty;


public class RomantoInt {  
	int value(char v)   {   
		if (v == 'I')   
			return 1;   
		if (v == 'V')   
			return 5;   
		if (v == 'X')   
			return 10;   
		if (v == 'L')   
			return 50;   
		if (v == 'C')   
			return 100;   
		if (v == 'D')   
			return 500;   
		if (v == 'M')   
			return 1000;   
		return -1;   
	}   

	int convertRomanToInt(String s)   {    
		int total = 0;   
		for (int i=0; i<s.length(); i++)   
		{   
			int s1 = value(s.charAt(i));   
			if (i+1 <s.length()) {   
				int s2 = value(s.charAt(i+1));   
				if (s1 >= s2)   {   
					total = total + s1;   
				}   
				else  {   
					total = total - s1;   
				}   
			}   
			else {   
				total = total + s1;   
			}   
		}    
		return total;   
	}    
	public static void main(String args[])   {   
		RomantoInt r = new RomantoInt();  
		String romanStr="II";
		System.out.println("The corresponding Integer value is: "+r.convertRomanToInt(romanStr));   
	}   

}
