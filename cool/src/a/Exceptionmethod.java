package a;

public class Exceptionmethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new Exception("here's my first exception");
		}catch(Exception e){
			System.out.println("caught exception");
			System.out.println("e.getmessage():"+e.getMessage());
			System.out.println("e.toString():"+e.toString());
			System.out.print("e.printStackTrace:");
			e.printStackTrace();
			
		}
	}

}
