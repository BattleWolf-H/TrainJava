/*���Ҹ߶ȣ�48m����������һ���㹻���ֽ�ţ����Ϊ��0.12m�����ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ����ڽ��ҵĸ߶�?
48m=48000mm
0.12m=120mm

������0
������floor
��ȣ�����*120
��һ�εĲ�������ǰһ�εĲ���*2
*/
class WhileTest{
	public static void main(String[] args){
		//�۵�����
		int count = 0;
		//����
		int floor = 1;
		while(floor*120<48000){
			count++;
			floor *= 2;
		}
		System.out.println("����"+count+"���۵������յĺ���ǣ�"+floor*120);//����9���۵������յĺ���ǣ�61440
	}
}