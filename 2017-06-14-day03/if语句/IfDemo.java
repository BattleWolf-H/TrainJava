import java.util.Scanner;
class IfDemo{
	public static void main(String[] args){
		int a,b;//��������int�͵ı���
		Scanner sc =new Scanner(System.in);//����Scanner����sc
		//�ж�������������Ƿ����
		System.out.println("�������һ��int�����ݣ�");
		a=sc.nextInt();
		System.out.println("������ڶ���int�����ݣ�");
		b=sc.nextInt();
		if(a==b)//��if�������ж����������Ƿ����
			System.out.println("����������������");
		System.out.println("������������ݲ����");
		//�Ƚ�������������ݵĴ�С
		System.out.println("�������һ��int�����ݣ�");
		a=sc.nextInt();
		System.out.println("������ڶ���int�����ݣ�");
		b=sc.nextInt();
		if(a>b)//��if����ж����ݵĴ�С
			System.out.println("����ĵ�һ������"+a+"�ȵڶ�������"+b+"��");
		System.out.println("����ĵ�һ������"+a+"�ȵڶ�������"+b+"С");
		//�ж�������������ż��
		System.out.println("������int�����ݣ�");
		a=sc.nextInt();
		if(a%2==0)//����if����ж����ݵ���ż��
			System.out.println("�����������ż��");
		System.out.println("���������������");
		
	}
}