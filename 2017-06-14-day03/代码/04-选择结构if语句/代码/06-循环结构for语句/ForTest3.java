/*
���1-100֮��ż����
���1-100֮��������
*/
class ForTest3{
	public static void main(String[] args){
		//���屣��ż���͵ı���
		int doubleSum = 0;
		//���屣�������͵ı���
		int singleSum = 0;
		//����1-100
		for(int i=1; i<=100; i++){
			//�ж�����������ż��
			if(i%2==0){
				//ż��
				doubleSum += i;
			}else{
				//����
				singleSum += i;
			}
		}
		System.out.println("1-100֮��ż���ͣ�"+doubleSum);
		System.out.println("1-100֮�������ͣ�"+singleSum);
	}
}