class A{
    void fun(){
        System.out.println("this is parent class");
    }
}

class B extends A{
void gets(){
        System.out.println("this is inherit class-B");
        super.fun();
    }
}
 
public class Main 
{
    
	public static void main(String[] args) {
		B obj=new B();
		obj.gets();
	}
}


