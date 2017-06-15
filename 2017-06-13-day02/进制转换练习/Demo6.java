class Demo6{
public static void main(String[] args){
	int a=10,b=10,c=10;
	a=b++;
	c=--a;
	b=++a;
	a=c--;
	System.out.println("a="+a);//a=9
	System.out.println("b="+b);//b=10
	System.out.println("c="+c);//c=8
	
	int d=4;
	int e=(d++)+(++d)+(d*10);
	System.out.println("e="+e);//e=70
	
		
}
}