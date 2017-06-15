class Demo1{
	public static void main(String[] args){
		int a=1,b=2;
		boolean c;

		c= a==b;
		System.out.println(c);
		
		c= a!=b;
		System.out.println(c);
		
		c= a<b;
		System.out.println(c);
		
		c= a>b;
		System.out.println(c);
		
		c= a<=b;
		System.out.println(c);
		
		c= a>=b;
		System.out.println(c);
		
		c= "haha" instanceof String;
		System.out.println(c);
	}
}