import java.util.Scanner;
class ArrayDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ��ʾ��������ǵĲ�����");
		int cow = sc.nextInt();
		System.out.println("����������£�");
		showYH(cow);
		System.out.println("100-1000��ˮ�ɻ����£�");
		showFlower();
	}
	//��ά�������
	public static void showArray(int[][] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				System.out.println("�����"+i+"�е�"+j+"�е�ֵΪ��"+array[i][j]);
			}
		}
	}
	//�������
	public static void showYH(int cow){
		int[][] array=new int[cow][cow];
		array[0][0] =1;
		array[1][0] =1;array[1][1]=1;
		//[0][0]=1;[1][0]=1;[1][1]=1;[2][0]=1;
		for(int i=2;i<array.length;i++){
			array[i][0]=1;
			for(int j=1;j<i+1;j++){
					array[i][j]=array[i-1][j-1]+array[i-1][j];
			}
			array[i][i]=1;
		}
		//���������������
		for(int i=0;i<cow;i++){
			for(int j=0;j<=i;j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
	//��ӡ��100-999���е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ�������
	public static void showFlower(){
		int a=0,b=0,c=0;
		for(int i=100;i<1000;i++){
			a = i%10;//��λ
			b = i/10%10;//ʮλ
			c = i/100;//��λ
			if(i==(a*a*a+b*b*b+c*c*c))
				System.out.print(i+"\t");
		}
	}
	
	
	
	
	
	


	
}