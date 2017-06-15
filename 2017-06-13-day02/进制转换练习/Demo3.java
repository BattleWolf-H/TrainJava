class Demo3{
	public static void main(String[] args){
		//定义整型变量
		byte   a=10;//1个字节，范围：-128--+127
		System.out.println(a);
		
		short  b=20;//2个字节
		System.out.println(b);
		
		int    c=30;//4个字节
		System.out.println(c);
		
		//Java语言整型常量默认为int型，long型需要加l或L；
		long   d=40L;//8个字节
		System.out.println(d);
		
		//java语言浮点型常量默认为double型，float型需要加f或F
		float  e=12.12F;//4个字节
		System.out.println(e);
		
		double f=12.12;//8个字节
		System.out.println(f);
		
	}
}