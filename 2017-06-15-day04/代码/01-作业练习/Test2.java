/*
�����û�����¼�������ֵ����ӡ��Ӧ�㼶�����ֽ�����ͼ��
�����û�����3��ô��ӡͼ��������ʾ��
	  1
	 222
	33333
1.�ǵڼ��о������Ӧ��ֵ
2.�ӵڶ��㿪ʼÿһ���������ֵ��+2
3.�ӵ�һ�п�ʼ�����һ��Ϊֹ��ÿһ������Ŀո��ڵݼ�
*/
import java.util.Scanner;
class Test2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ӡ�Ľ�����������");
		int n = sc.nextInt();
		
		//�����ѭ�����Ʋ���
		for(int i=1; i<=n; i++){
			//���ƴ�ӡ�Ŀո�
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			//����ÿһ�����������
			for(int j=1;j<=i*2-1; j++){
				System.out.print(i);
			}
			//��һ��������֮����Ҫ����		
			System.out.println();
		}
	}
}