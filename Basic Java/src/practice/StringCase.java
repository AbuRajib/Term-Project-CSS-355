package practice;

public class StringCase {

	public static void main(String[] args) {
		
		//Methods: length(), toUpperCase(), toLowerCase(), indexOf()- the position of the first occurrence of a text
		//concat(), special Character(\',\",\\,\n,\t)
		//trim(), charAt(), codePointAt()
		
		String st="Hello World";
		String st1="Hello World";
/*		System.out.println(st.length());
		
		System.out.println(st.toUpperCase());
		System.out.println(st.toLowerCase());
		System.out.println(st.indexOf("World"));
		
		System.out.println(st.concat(st1));
		
		System.out.println("Good \'Morning\' NYC");
		System.out.println("Good \"Morning\" NYC");
		System.out.println("Good \nMorning NYC");
		System.out.println("Good \tMorning NYC");
*/
	//	System.out.println(st.trim());	//leading & trailing spaces in the original string
	//	System.out.println(st.charAt(6));
		System.out.println(st.codePointAt(0));	// start from 65=A..... 72=H
	//	System.out.println(st.compareTo(st1));
	//	System.out.println(st.hashCode());
		System.out.println(st1.replace("Hello World", "World Beautiful"));
		
	}

}
