/*
����¼���������ݣ�Ȼ���ȡ���ֵ
*/
import java.util.Scanner;
class IfTest3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ��������");
		int a = sc.nextInt();
		System.out.println("������ڶ���������");
		int b = sc.nextInt();
		System.out.println("�����������������");
		int c = sc.nextInt();
		
		int max;
		
		/*
		//���ȱȽ�a��b��ֵ
		if(a>b){
			//��������ߵ������ˣ�˵��a��b��
			//�Ƚ�a��c
			if(a>c){
				//��������ߵ������˵�����ֵ��a
				max = a;
			}else{
				//��������ߵ������˵�����ֵ��c
				max = c;
			}
		}else{
			//��������ߵ������ˣ�˵��b��a��
			//�Ƚ�b��c
			if(b>c){
				//��������ߵ����˵�����ֵ��b
				max = b;
			}else{
				//��������ߵ����˵�����ֵ��c
				max = c;
			}
		}*/
		
		if(a>b){
			//��������ߵ������ˣ�˵��a��b��
			//�Ƚ�a��c
			if(a>c){
				//��������ߵ������˵�����ֵ��a
				max = a;
			}else{
				//��������ߵ������˵�����ֵ��c
				max = c;
			}
		}else if(b>c){//��������ߵ������ˣ�˵��b��a��
			//��������ߵ����˵�����ֵ��b
			max = b;		
		}else{//��������ߵ����˵�����ֵ��c
			max = c;
		}
		
		System.out.println("���ֵ��"+max);
	}
}