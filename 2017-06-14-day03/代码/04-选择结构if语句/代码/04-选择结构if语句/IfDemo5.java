/*
ѡ��ṹif����ʽ3��
	if(��ϵ���ʽ1){
		�����1;
	}else if(��ϵ���ʽ2){
		�����2��
	}else if(��ϵ���ʽ3){
		�����3��
	}
	������
	else{
		�����n+1��
	}
	ִ�����̣�
		�������ϵ���ʽ1��ֵ����������true����false
		�����true����ִ�������1
		�����false���������ϵ���ʽ2��ֵ����������true����false
		�����true����ִ�������2
		�����false���������ϵ���ʽ3��ֵ����������true����false
		�����true����ִ�������3
		�����false���������ϵ���ʽn��ֵ����������true����false
		�����true����ִ�������n
		�����false���������������������㣬��ִ��else����������n+1
		
	��զ�ǰ࿼�Գɼ��ֵȼ���
	90-100	����
	80-90	��
	70-80	��
	60-70	����
	60����	������

	��ȷ����
	�߽�����
	��������
*/
import java.util.Scanner;
class IfDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿼�Գɼ���");
		int score = sc.nextInt();
		//�ж�һ�´�������
		if(score<0 || score>100){
			System.out.println("������ĳɼ�����");
		}else if(score>=90 && score<=100){
			System.out.println("����");
		}else if(score>=80 && score<90){
			System.out.println("��");
		}else if(score>=70 && score<80){
			System.out.println("��");
		}else if(score>=60 && score<70){
			System.out.println("����");
		}else{
			System.out.println("������");
		}
	}
}