//����¼������float�������ݣ���ȡ������ �����е����ֵ���������
import java.util.Scanner;
class ScannerTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ����ֵ��");
		float f = sc.nextFloat();
		System.out.println("������ڶ�����ֵ��");
		float f2 = sc.nextFloat();
		System.out.println("�������������ֵ��");
		float f3 = sc.nextFloat();
		
		float max = (max=f>f2?f:f2)>f3?max:f3;
		
		System.out.println("max="+max);
	}
}