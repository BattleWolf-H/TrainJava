/*
成员变量和静态成员变量的区别：
	所属的不同
		成员变量：属于对象
		静态成员变量：属于类
	在内存中的位置不同
		成员变量：在堆内存中
		静态成员变量：在方法区中的静态区中
	声明周期不同
		成员变量：随着对象的创建而存在，随着对象的消失而消失
		静态成员变量：随着类的加载而存在，随着程序的退出而消失
	调用不同
		成员变量：只能通过对象名调用
		静态成员变量：既可以通过对象名调用还可以通过类名直接调用
*/
class Animal{
	public int age = 10;
	public static Strin name = "小猫";
}