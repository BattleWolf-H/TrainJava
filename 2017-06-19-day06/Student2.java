class Student{
	public String name;
	public int age;
	public char sex;
	public long SNo;
	
	public void eat(String food){
		System.out.println("ѧ��-"+name+"�Ե���"+food);
	}
	public void showInfo(){
		System.out.println("ѧ����"+name+";\n ���䣺"+age+";\n�Ա� ��"+sex+"��ѧ�ţ�"+SNo);
	}
}
class Student2{
	public static void main(String[] args){
		Student stu = new Student();
		stu.name = "����";
		stu.age = 18;
		stu.sex = '��';
		stu.SNo = 141401L;
		stu.showInfo();
		
		Student stu2 = new Student();
		stu2.name = "����";
		stu.age = 19;
		stu.sex = 'Ů';
		stu.showInfo();
	}
}