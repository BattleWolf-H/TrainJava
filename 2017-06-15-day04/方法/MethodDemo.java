import java.util.Scanner;
class MethodDemo{
	public static void main(String[] args){
		int a,b,c;
		System.out.println("��������������");
		a = getNum();
		b = getNum();
		System.out.println("�������е����ֵΪ��"+getTwoNumMax(a,b));
		System.out.println("��������������Ƿ����"+isEqual(a,b));
		System.out.println("��������������");
		a = getNum();
		b = getNum();
		c = getNum();
		System.out.println("������������������ֵΪ��"+getThreeNumMax(a,b,c));
	}
	//�Ӽ���¼������
	public static int getNum(){
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		return a ;
	}
	//����¼���������ݣ������������еĽϴ�ֵ
	public static int getTwoNumMax(int a,int b){
		int max=a>b?a:b;
		return max;
	}
	//����¼���������ݣ��Ƚ��������Ƿ����
	public static boolean isEqual(int a,int b){
		boolean result = false;
		if(a==b){
			result =true;
			return result;
		}
		return result;
	}
	//����¼���������ݣ������������е����ֵ
	public static int getThreeNumMax(int a,int b,int c){
		int max=(max=a>b?a:b)>c?max:c;
		return max;
	}

}