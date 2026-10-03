package oop;

class A{
	int a;
	
	A(){
		System.out.println("This is A constructor");
	}
	
	A(int a){
		this.a = a;
	}
}

class B extends A{
	int b;
	
	B(){
		System.out.println("This is B constructor");
	}
	
	B(int b){
		this.b = b;
	}
	
	B(int a, int b){
		super(a);
		this.b = b;
	}
	
}

public class MainWork {
	public static void main(String[] args) {
		B obj = new B(10, 101);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
}
