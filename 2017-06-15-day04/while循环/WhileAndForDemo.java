class WhileAndForDemo{
	public static void main(String[] args){
		/*���Ҹ߶ȣ�48m����������һ���㹻���ֽ�ţ����Ϊ��0.12m�����ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ����ڽ��ҵĸ߶�?
		*/
		int i=0;
		float sum=0.12F;
		while(sum<=48){
			System.out.println(sum);
			sum*=2;
			i++;
		}
		System.out.println("����"+i+"���۵��󣬸߶�Ϊ"+sum);
	}
}