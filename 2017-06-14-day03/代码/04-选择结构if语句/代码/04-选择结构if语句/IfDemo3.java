//����¼�����ݣ��ж���������������ż
import java.util.Scanner;
class IfDemo3{
	public static void main(String[] args){
		Scanner sc = new  Scanner(System.in);
		System.out.println("������Ҫ�жϵ���ֵ��");
		int number = sc.nextInt();
		
		if(number%2==0){
			System.out.println("�����������ż��");
		}else{
			System.out.println("���������������");
		}
	}
}