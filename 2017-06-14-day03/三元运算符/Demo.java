class Demo{
	public static void main(String[] args){
		long l1=10L,l2=11L;
		float f1=2.12F,f2=2.13F,f3=2.14F;
		int i1=12,i2=13;
		
		long maxL= l1>l2?l1:l2;
		System.out.println("long型中最大的值为："+maxL);
		float maxF1= f1>f2?f1:f2;
		float maxF2= f3>maxF1?f3:maxF1;
		System.out.println("float型中最大的值为："+maxF2);
		int maxI= i1>i2?i1:i2;
		System.out.println("int型中最大的值为："+maxI);
		
	}
}