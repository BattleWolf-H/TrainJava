import java.util.Scanner;
class Demo2{
	public static void main(String[] args){
		int num1,num2,sum;//����2��int����ֵ��1��int�ͺ�
		long l1,l2,maxL;//����2��long����ֵ��1��long�����ֵ
		float f1,f2,f3,maxF;//����3��float����ֵ��1��float�����ֵ
		byte b1,b2;//����2��byte����ֵ
		Scanner sc=new Scanner(System.in);//����Scanner����sc
		//����2��int�����ݣ��������ݽ������
		System.out.println("��������2��int�����ݣ�");
		num1=sc.nextInt();
		num2=sc.nextInt();
		sum = num1+num2;
		System.out.println("����int���ݵĺ�Ϊ"+sum);
		//����2��long�����ݣ��������ݽ��бȽ�
		System.out.println("����������long�����ݣ�");
		l1=sc.nextLong();l2=sc.nextLong();
		maxL = l1>l2?l1:l2;
		System.out.println("����long���������ֵΪ��"+maxL);
		//����3��float�����ݣ�����3��float���������ֵ
		System.out.println("������3��float������");
		f1=sc.nextFloat();f2=sc.nextFloat();f3=sc.nextFloat();
		maxF = (f1>f2?f1:f2)>f3?(f1>f2?f1:f2):f3;
		System.out.println("3��float���������Ϊ��"+maxF);
		//����2��byte�����ݣ���������byte�����ݽ����ж��Ƿ����
		System.out.println("������2��byte������");
		b1=sc.nextByte();b2=sc.nextByte();
		System.out.println("2��byte�������Ƿ���ȣ�"+(b1==b2));
	}
}