/*
���1-10֮�����
*/
class ForDemo{
	public static void main(String[] args){
		int sum1=0,sum2=0;
		//���1-10֮�����
		for(int i=1;i<=10;i++){
			sum1+=i;
			if(i==10){
			System.out.print(i);
			}else{
			System.out.print(i+",");
			}
		}
		System.out.print("\n");
		//���10-1֮�����
		for(int i=10;i>0;i--){
			if(i==1){
				System.out.print(i);
			}else{
				System.out.print(i+",");
			}
			
		}
		System.out.print("\n");
		//���1-100֮��ż���ĺ�
		for(int i=1;i<=100;i++){
			if(i%2==0){
				//System.out.println(i);
				sum2+=i;
			}
		}
		System.out.println("1-100֮���ż����Ϊ��"+sum2);
		//���1-100֮��������ĺ�
		for(int i=1;i<=100;i++){
			if(i%2==1){
				sum2+=i;
			}
		}
		System.out.println("1-100֮���������Ϊ��"+sum2);
		int count3=0,count5=0,count7=0;
		for(int i=1;i<1000;i++){
			if(i%3==2)
				count3++;
			if(i%5==3)
				count5++;
			if(i%7==2)
				count7++;
		}
		System.out.println("1-1000����3��2�ĸ���Ϊ��"+count3+",1-1000����5��3�ĸ���Ϊ��"+count5+"��1-1000����7��2�ĸ���Ϊ��"+count7);
	}
}