import java.util.Scanner;
class IFDemo2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("������x��ֵ��");
		int x = sc.nextInt();
		int y=0;
		if(x>=1){
			y=2*x+1;
		}else if(x<1 && x>=-1){
			y=2*x;
		}else{
			y=2*x-1;
		}
		System.out.println("y��ֵΪ��"+y);
		System.out.println("�������·ݣ�");
		x=sc.nextInt();
		if(x<1 || x>12){
			System.out.println("�������������");
		}else if(x>=3&&x<=5){
			System.out.println("�ü���Ϊ����");
		}else if(x>=6&&x<=8){
			System.out.println("�ü���Ϊ�ļ�");
		}else if(x>=9&&x<=11){
			System.out.println("�ü���Ϊ�＾");
		}else{
			System.out.println("�ü���Ϊ����");
		}
		System.out.println("�������һ�����ݣ�");
		x=sc.nextInt();
		System.out.println("������ڶ������ݣ�");
		y=sc.nextInt();
		System.out.println("��������������ݣ�");
		int z=sc.nextInt();
		if(x>=y&&x>=z){
			System.out.println("��������������Ϊ��"+x);
		}else if(y>=x&&y>=z){
			System.out.println("��������������Ϊ��"+y);
		}else if(z>=x&&z>=y){
			System.out.println("��������������Ϊ��"+z);
		}
		System.out.println("Hello");
	}
}