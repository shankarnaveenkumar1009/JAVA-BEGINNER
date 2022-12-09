class Calc{
	int num1;
	int num2;
	public void perform(){
		result = num1 + num2;
	}
}
public class ObjectDemo{
	public static void main(String[]args){
	    Calc obj=new Calc();
        obj.num1=10;
        obj.num2=15;
	    obj.perform();
        System.out.println(obj.result);	
	}
}	
