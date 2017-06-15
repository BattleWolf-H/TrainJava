import java.util.Scanner;
class MethodReloadDemo{
	public static void main(String[] args){
		System.out.println("请输入要比较的两个数：");
		long a = (long)getNum();
		long b = (long)getNum();
		System.out.println(isEqual(a,b));
	}
	//从键盘获取数据
	public static int getNum(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	
	//比较两个byte型数据是否相等
	public static boolean isEqual(byte a,byte b){
		boolean result= a==b;
		return result;
	}
	//比较两个short型数据是否相等
	public static boolean isEqual(short a,short b){
		boolean result= a==b;
		return result;
	}
	//比较两个int型数据是否相等
	public static boolean isEqual(int a,int b){
		boolean result= a==b;
		return result;
	}
	//比较两个long型数据是否相等
	public static boolean isEqual(long a,long b){
		boolean result= a==b;
		return result;
	}
}