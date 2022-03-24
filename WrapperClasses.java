package wrapper;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer integer=new Integer("100");//auto casting
		System.out.println(integer+200);
		
		integer=800;//auto boxing -converting primitive type to 
		//object type automatically
		int value=integer;//auto deboxing 
		
		Double doublevalue=new Double(56.90);
		System.out.println("max double value"+doublevalue.MAX_VALUE);
		
		System.out.println("max double value"+doublevalue.SIZE);
		Character ch=new Character('a');
		System.out.println("max char value"+ch.SIZE);
		String value1=new String("1238");
		int number=Integer.parseInt(value1);
		System.out.println(number);
		
		float fvalue=Float.parseFloat(value1); // parsexxx
		System.out.println(fvalue);
		
	double salary=34568.74;//Double object
	Double d=new Double(salary);
	
	       Double d1= Double.valueOf(salary);//convert primitive to object
	       
	       double d2=d1.doubleValue();//convert object to primitive
	       
	       
		int sum=0;
		for(String message : args)
		{
			System.out.println("value is "+ message);
			sum=sum+Integer.parseInt(message);
}
		System.out.println(sum);
	}

}

	
