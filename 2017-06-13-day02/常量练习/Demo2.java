/*
二进制： 以0b开头，包含0、1
八进制： 以0开头，包含0-7
十进制： 默认的就是十进制
十六进制：以0x开头，包含0-9，A-F
*/
//定义一个Demo2的类
class Demo2{
	//定义main方法
	public static void main(String[] args){
		//显示二进制
		System.out.println(0b1010);
		
		//显示八进制
		System.out.println(01001);
		
		//显示十进制
		System.out.println(256);
		
		//显示十六进制
		System.out.println(0x1001);
		
	}
}