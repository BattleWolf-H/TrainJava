/*
���ڿ���̨�������1-10
���1-10֮������֮��
*/
class ForTest{
	public static void main(String[] args){
		//����һ����ź͵ı���
		int sum = 0;
		//����1-10
		for(int i=1; i<=10; i++){
			//���ڿ���̨�������1-10
			System.out.println(i);
			sum += i;
		}
		
		System.out.println("------------------------");
		
		System.out.println("sum="+sum);
	}
}