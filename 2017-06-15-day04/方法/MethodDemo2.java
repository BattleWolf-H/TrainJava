import java.util.Scanner;
class MethodDemo2{
	public static void main(String[] args){
		System.out.println("��������Ҫ��ʾ������ͼ�����к��У�");
		int row = getNum();
		int column = getNum();
		showPicture(row,column);
		System.out.println("��������Ҫ��ʾ�˷��������");
		int n = getNum();
		showTable(n);
	}
	//������������
	public static int getNum(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		return a;
	}
	//����¼�������������������Ӧ������
	public static void showPicture(int row,int column){
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	//����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷���
	public static void showTable(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}