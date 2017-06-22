/*
4�������ඨ����
дһ�������࣬���������û����ɵĶ���Order�����������������ԣ�
   ����id
   �����������û���username
   ��Ʒ����items�������д�ŵ��Ƕ����Ʒ����
   �����ܽ��amount�������õ�����ֱ�Ӹ�ֵ��Ӧ�����ڲ��Զ�����!!! �����ܽ��=��Ʒ�����и���Ʒ�۸���ܺͣ�
   ����ʵ��Ӧ֧����payment
     �������õ�����ֱ�Ӹ�ֵ��Ӧ�����ڲ��Զ�����!!!
      ʵ��Ӧ֧����ļ����߼���
       ��� �����ܽ�� ��[0-99] ֮�䣬��Ӧ֧����=�ܽ��
       ��� �����ܽ�� ��[100-199] ֮�䣬��Ӧ֧����=�ܽ��*0.9
       ��� �����ܽ��  >=200����Ӧ֧����=�ܽ��*0.8��
*/
class Order{
	private String id;
	private Customer customer;
	private Item[] items;
	private float amount;
	private float payment;
	
	public Order(){
		
	}
	public Order(String id,Customer customer,Item[] items){
		this.id = id;
		this.customer = customer;
		this.items = items;
	}
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setCustomer(Customer customer){
		this.customer = customer;
	}
	public Customer getCustomer(){
		return customer;
	}
	public void setItems(Item[] items){
		this.items = items;
	}
	public Item[] getItems(){
		return items;
	}
	public float getAmount(){
		//����������Ʒ�ļ۸�
		float sum = 0;
		for(int i=0; i<items.length; i++){
			sum += items[i].getPrice();
		}
		return sum;
	}
	public float getPayment(){
		//����һ��������ʾ��Ҫ����
		float discount = 1.0f;
		//�жϵ�ǰ�Ŀͻ���ʲô�ȼ�
		switch(customer.getLevel()){
			case 1:
				discount = 0.9f;
			break;
			case 2:
				discount = 0.8f;
				break;
		}
		
		float money = discount*getAmount();
		if(money>=0 && money<=99){
			return money;
		}else if(money >=100 && money<=199){
			return money*0.9f;
		}else{
			return money*0.8f;
		}
	}
	
	public Item getMostExpensive(){
		//�����һ����Ʒ������
		Item max = items[0];
		for(int i=1; i<items.length; i++){
			Item item = items[i];
			if(item.getPrice()>max.getPrice()){
				max = item;
			}
		}
		return max;
	}
	
	public void show(){
		System.out.println("�����ţ�"+getId());
		System.out.println("������ң�"+getCustomer().getUsername());
		for(int i=0; i<items.length; i++){
			items[i].show();
		}
		System.out.println("����Ӧ����"+getAmount());
		System.out.println("����ʵ����"+getPayment());
	}
}