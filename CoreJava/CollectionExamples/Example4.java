package CollectionExamples;

public class Example4 {
	public static void main(String[] args) {
		String a="190";
		int ans=Integer.parseInt(a);
		System.out.println(ans);
		String b="89.67";
		float ans1=Float.parseFloat(b);
		System.out.println(b);
		
		String name="nidhi123";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isAlphabetic(ch))
				System.out.print(ch);
			System.out.println();
			if(Character.isDigit(ch))
				System.out.print(ch);
		}
	}

}
