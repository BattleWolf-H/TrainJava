//�����û�����¼�������ֵ�������Ӧ�Ľ׳ˡ�����5�Ľ׳˾���5*4*3*2*1
import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int number = sc.nextInt();
		//����һ����������׳�
		int result = 1;
		for(int i=1; i<=number; i++){
			result *= i;
		}
		System.out.println("result="+result);
	}
}