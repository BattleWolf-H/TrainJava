/*
��switch���ʵ�ּ���¼���·ݣ������Ӧ�ļ���
	3��5��Ϊ����
	6��8��Ϊ�ļ�
	9��11��Ϊ�＾
	12�¡�2��Ϊ����
*/
import java.util.Scanner;
class SwitchTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("��������·�����");
				break;
		}
	}
}