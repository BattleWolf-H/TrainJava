import java.util.Scanner;
class MethodReloadDemo{
	public static void main(String[] args){
		System.out.println("������Ҫ�Ƚϵ���������");
		long a = (long)getNum();
		long b = (long)getNum();
		System.out.println(isEqual(a,b));
	}
	//�Ӽ��̻�ȡ����
	public static int getNum(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	
	//�Ƚ�����byte�������Ƿ����
	public static boolean isEqual(byte a,byte b){
		boolean result= a==b;
		return result;
	}
	//�Ƚ�����short�������Ƿ����
	public static boolean isEqual(short a,short b){
		boolean result= a==b;
		return result;
	}
	//�Ƚ�����int�������Ƿ����
	public static boolean isEqual(int a,int b){
		boolean result= a==b;
		return result;
	}
	//�Ƚ�����long�������Ƿ����
	public static boolean isEqual(long a,long b){
		boolean result= a==b;
		return result;
	}
}