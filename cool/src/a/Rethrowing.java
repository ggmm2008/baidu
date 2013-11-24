package a;

public class Rethrowing {

	public static void f() throws Exception{
		System.out.println("throw exception f()");
		throw new Exception("f() exception");
	}
	
	public static void g() throws Throwable{
		try{
			f();
		}catch(Exception e){
			System.out.println("inside g()");
			e.printStackTrace();
			//throw e;
			throw e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try{
			g();
		}catch(Exception e){
			System.out.println("main()");
			e.printStackTrace();
		}
	}

}
