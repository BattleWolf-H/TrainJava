/*
����¼��x��ֵ�������y�Ĳ����
x��y�Ĺ�ϵ�������£�
	x>=3	y = 2x + 1;
	-1<=x<1	y = 2x;
	x<-1	y = 2x �C 1;
*/
import java.util.Scanner;
class IfTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������X��ֵ��");
		int x = sc.nextInt();
		int y = 0;
		if(x>=3){
			y = 2*x+1;
		}else if(x>=-1 && x<1){
			y = 2*x;
		}else if(x<-1){
			y = 2*x-1;
		}
		System.out.println(y);//������δ��ʼ������y
	}
}