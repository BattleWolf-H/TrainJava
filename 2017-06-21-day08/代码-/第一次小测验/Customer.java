/*
	6����չ�����⣨�����϶���ģ�ͽ�����ǿ��
��дһ���������ͻ�Customer���ͻ������������ԣ�
   �ͻ�����username
   �ͻ��ȼ����ȼ���ֵ�����ǡ�������ʯVIP��������׽�VIP������ͨ�ͻ�����

Ȼ����4�еĶ������username���Ըĳ��ÿͻ���������ʾ,������������4һ�£�����
   ����id
   ���������û����� Customer c;
   ��Ʒ����items�������д�ŵ��Ƕ����Ʒ����
   �����ܽ��amount�������ܽ��=��Ʒ�����и���Ʒ�۸���ܺͣ�
   ����ʵ��Ӧ֧����payment���ı�֮ǰ�߼�����֮ǰ���ܽ����ۻ����ϣ����ݿͻ��ĵȼ��ٴ��ۣ����磺������ʯVIP����һ��8�ۣ�����׽�vip����һ��9�ۣ���ͨ�ͻ��������ۿۣ�


Ȼ��д����ģ�ⴴ��������Ʒ��һ��������Ȼ���ӡ������Ϣ����չ���󣺿���ͨ�����ö��������ϵ�һ���Զ��巽��ֱ�ӻ�ȡ�ö�����������Ʒ��
*/
class Customer{
	//�ͻ�����
	private String username;
	//�ͻ��ȼ���������2��ʾ��������ʯVIP��	��1��ʾ������׽�VIP�� Ĭ��0��ʾ����ͨ�ͻ�����
	private int level;
	public Customer(String username,int level){
		this.username = username;
		this.level = level;
	}
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return username;
	}
	public void setLevel(int level){
		this.level = level;
	}
	public int getLevel(){
		return level;
	}
}