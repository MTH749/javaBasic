package h_useful;

public class Subject {

	public static void main(String[] args) {
		String s = new String("Hello");

		

		char[] c = {'H','e','l','l','o'};

		s = new String(c);

		

		StringBuffer sb = new StringBuffer("Hello");

		s = new String(sb);

		

		s = "Hello";

		String n = "0123456";	
		

		int i = "aaa".compareTo("aaa");

		int i2 = "aaa".compareTo("bbb");

		int i3 = "bbb".compareTo("aaa");

		

		 s = "Hello";

		String s2 = s.concat("World");

		

		s = "abcedfg";

		boolean b = s.contains("bc");

		

		String file = "Hello.txt";

		boolean b1 = file.endsWith("txt");

		

		s = "Hello";

		boolean b5 = s.equals("Hello");

		boolean b2 = s.equals("hello");

		

		s = "Hello";

		boolean b4 = s.equalsIgnoreCase("HELLO");

		boolean b3 = s.equalsIgnoreCase("heLLo");

		

		s = "Hello";

		int idx1 = s.indexOf('o');

		int idx2 = s.indexOf('k');

		

		s = "Hello";

		int idx3 = s.indexOf('e', 0);

		int idx4 = s.indexOf('e', 2);

		

		s = "ABCDEFG";

		int idx = s.indexOf("CD");

		

		s = new String("abc");

		s2 = new String("abc");

		boolean b11 = (s==s2);

		boolean b21 = s.equals(s2);

		boolean b31 = (s.intern()==s2.intern());

		

		s = "java.lang.Object";

		int idx11 = s.lastIndexOf('.');

		int idx21 = s.indexOf('.');

		

		s = "java.lang.java";

		int idx111 = s.lastIndexOf("java");

		int idx211 = s.indexOf("java");

		

		 s = "Hello";

		int length = s.length();

		

		 s = "Hello";

		String s1 = s.replace('H','C');

		

		 s = "Hellollo";

		 s1 = s.replace("ll","LL");

		

		String ab = "AABBAABB";

		String r = ab.replaceAll("BB","bb");

		

		String animals = "dog,cat,bear";

		String[] arr = animals.split(",",2);

		

		s = "java.lang.Object";

		boolean b111 = s.startsWith("java");

		boolean b211 = s.startsWith("lang");

		

		s = "java.lang.Object";

		String c11 = s.substring(10);

		String p = s.substring(5,9);

		

		s = "Hello";

		s = s.toLowerCase();

		

		String s33 = "Hello";

		String s123 = s.toString();

		

		String s45 = "Hello";

		String s18 = s.toUpperCase();

		

		String s24 = "	Hello World	";

		String s168 = s.trim();

		

		String b1111 = String.valueOf(true);

		String c111 = String.valueOf('a');

		String i33 = String.valueOf(100);

		String l44 = String.valueOf(100L);

		String f = String.valueOf(10f);

		String d = String.valueOf(10.0);

		java.util.Date dd = new java.util.Date();

		String date = String.valueOf(dd);
	}

}
