class Calc{
	int number1;
	int number2;
	public void perform(){
		result = num1 + num2;
	}
}
public class ObjectDemo{
	public static void main(String[]args){
	    Calc obj=new Calc();
        obj.number1=10;
        obj.number2=15;
	    obj.perform();
        System.out.println(obj.result);	
	}
}	
