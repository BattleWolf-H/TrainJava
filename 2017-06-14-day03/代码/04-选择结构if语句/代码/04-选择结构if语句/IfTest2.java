/*
����¼���·ݵ�ֵ�������Ӧ�ļ���
	3��5��Ϊ����
	6��8��Ϊ�ļ�
	9��11��Ϊ�＾
	12�¡�2��Ϊ����
*/
import java.util.Scanner;
class IfTest2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		
		//һ�����������У������
		if(month<1 || month>12){
			System.out.println("��������·ݲ�����");
		}else if(month>=3 && month<=5){
			System.out.println("����");
		}else if(month>=6 && month<=8){
			System.out.println("�ļ�");
		}else if(month>=9 && month<=11){
			System.out.println("�＾");
		}else{
			System.out.println("����");
		}
		
		/*
		if(month>=3 && month<=5){
			System.out.println("����");
		}else if(month>=6 && month<=8){
			System.out.println("�ļ�");
		}else if(month>=9 && month<=11){
			System.out.println("�＾");
		}else if(month==12 || month==1 || month==2){
			System.out.println("����");
		}else{
			System.out.println("��������·ݲ�����");
		}*/
	}
}