package a;

public class RethrowNew {
	
	public static void f() throws Exception{
		System.out.println("f()");
		throw new Exception("throw exception from f()");
	}
	
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try{
			f();
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}

}
