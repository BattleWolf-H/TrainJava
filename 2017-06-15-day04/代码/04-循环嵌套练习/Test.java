//1.�����һ��4��5�е�����(*)ͼ��
class Test{
	public static void main(String[] args){
		/*
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		//�����forѭ����������
		for(int i=0; i<4; i++){
			System.out.println("*****");
		}
		*/
		//����һ���еı���
		int row = 4;
		//����һ���еı���
		int colum = 5;
		
		//�����forѭ����������
		for(int i=0; i<row; i++){
			//��������������
			for(int j=0; j<colum; j++){
				System.out.print("*");
			}
			//����
			System.out.println();
		}
	}
}