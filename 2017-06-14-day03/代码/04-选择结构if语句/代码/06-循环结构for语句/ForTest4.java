/*��ͳ��1-1000֮��ֱ��������������������ж��ٸ���
��3������2
��5������3
��7������2*/
class ForTest4{
	public static void main(String[] args){
		//��3������2
		int count_1 = 0;
		//��5������3
		int count_2 = 0;
		//��7������2
		int count_3 = 0;
		//����1-1000��ֵ
		for(int i=1; i<=1000; i++){
			if(i%3==2){//��3������2
				count_1++;
			}else if(i%5==3){//��5������3
				count_2++;
			}else if(i%7==2){//��7������2
				count_3++;
			}
		}
		System.out.println("1-1000֮���3������2�ĸ�����"+count_1);//333
		System.out.println("1-1000֮���5������3�ĸ�����"+count_2);//133
		System.out.println("1-1000֮���7������2�ĸ�����"+count_3);//77
	}
}
