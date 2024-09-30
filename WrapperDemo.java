package module6;

public class WrapperDemo {

	public static void main(String[] args) {
		String str="100";
		String str1="200";
		String str2="100.88";
		String str3="200.33";
		String str4="55.66";
		String str5="88.99";
		String str6="55.66";
		String str7="88.99";
		System.out.println("Total is "+(Integer.parseInt(str)+Integer.parseInt(str1)));
		System.out.println("=================");
		System.out.println("total is "+(Double.parseDouble(str2)+(Double.parseDouble(str3))));
		System.out.println("=================");
		System.out.println("total is "+(Float.parseFloat(str4)+(Float.parseFloat(str5))));
		System.out.println("=================");
		System.out.println("total is "+(Float.parseFloat(str2)+(Float.parseFloat(str6))));
		System.out.println("=================");
		System.out.println("total is "+(Float.parseFloat(str2)+(Float.parseFloat(str6))));
		System.out.println("=================");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		
		

	}

}
