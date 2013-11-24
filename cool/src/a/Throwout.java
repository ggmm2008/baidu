package a;

public class Throwout {

	/**
	 * @param args
	 * @throws Throwable 
	 */
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try{
			throw new Throwable();
		}catch(Exception e){
			System.out.println("throw Throwable");
		}
	}

}
