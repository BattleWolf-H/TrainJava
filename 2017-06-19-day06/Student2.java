class Student{
	public String name;
	public int age;
	public char sex;
	public long SNo;
	
	public void eat(String food){
		System.out.println("学生-"+name+"吃的是"+food);
	}
	public void showInfo(){
		System.out.println("学生："+name+";\n 年龄："+age+";\n性别 ："+sex+"；学号："+SNo);
	}
}
class Student2{
	public static void main(String[] args){
		Student stu = new Student();
		stu.name = "张三";
		stu.age = 18;
		stu.sex = '男';
		stu.SNo = 141401L;
		stu.showInfo();
		
		Student stu2 = new Student();
		stu2.name = "李四";
		stu.age = 19;
		stu.sex = '女';
		stu.showInfo();
	}
}