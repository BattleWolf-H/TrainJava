//����¼������int�������ݣ�����������������ͣ��������
import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = sc.nextInt();
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("sum="+sum);
	}
}