class ArrayDemo2{
	public static void main(String[] args){
		int[] array =new int[3];
		int[] array2=new int[2];
		System.out.println("��һ�����飺"+array[0]);
		System.out.println("��һ�����飺"+array[1]);
		System.out.println("��һ�����飺"+array[2]);
		System.out.println("�ڶ������飺"+array2[0]);
		System.out.println("�ڶ������飺"+array2[1]);
		int[] array3=array;
		array3[0] = 100;
		array3[1] = 200;
		array3[2] = 300;
		System.out.println("���������飺"+array3[0]);
		System.out.println("���������飺"+array3[1]);
		System.out.println("���������飺"+array3[2]);
		System.out.println("��һ�����飺"+array[0]);
		System.out.println("��һ�����飺"+array[1]);
		System.out.println("��һ�����飺"+array[2]);
	}	
}