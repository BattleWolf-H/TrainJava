import java.util.Scanner;
class ArrayDemo3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] array=new int[]{1,2,3,143,99,-1,7,2,9};
		//1.��������
		showArray(array);
		//2.��ȡ�������ֵ����Сֵ
		int[] arr=getMaxMin(array);
		System.out.println("���������ֵΪ��"+arr[0]+",��СֵΪ��"+arr[1]);
		//����Ԫ������ (���ǰ�Ԫ�ضԵ�)
		array=ConArray(array);
		showArray(array);
	}
		//1.�������
		public static void showArray(int[] array){
			for(int i=0;i<array.length;i++){
				System.out.println("�����е�"+(i+1)+"��ֵΪ��"+array[i]);
			}
		}
		//2.�����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
		public static int[] getMaxMin(int[] array){
			int max=array[0],min=array[0];
			for(int i=0;i<array.length;i++){
				if(max<array[i]){
					max=array[i];
				}
			}
			for(int i=0;i<array.length;i++){
				if(min>array[i]){
					min=array[i];
				}
			}
			int[] arrM = new int[2];
			//arrM[���ֵ����Сֵ]
			arrM[0]=max;
			arrM[1]=min;
			return arrM;
		}
		
		//3.����Ԫ������ (���ǰ�Ԫ�ضԵ�)
		public static int[] ConArray(int[] array){
			int[] array2 = new int[array.length];
			for(int i=0;i<array2.length;i++){
				array2[i]=array[array.length-1-i];
			}
			return array2;
		}
		//4.������(���ݼ���¼������,���Ҷ�Ӧ)
		public static void getWeek(int week){
			String[] weekend=new String[]{"����һ","���ڶ�","������","������","������","������","������"};
			if(week<1 || week>7){
				System.out.println("�����������");
			}else{
				System.out.println("�����е�"+week+"����Ϊ��"+weekend[week-1]);
			}
	}	
		public static void getIndex(int[] array,int Num){
		//5.����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����
			for(int i=0;i<array.length;i++){
				if(array[i]==Num){
					System.out.println("�����е�һ�γ���"+Num+"�ڵ�"+(i+1)+"��λ��");
					break;
				}
			}
		}
	
	
		
}