class Calculator{
	int num1;
	int num2;
	public void perform(){
		result=num1+num2;
	}
}
public class a1Demo{
	public static void main(String[]args){
	    Calculator a1=new Calculator();
        a1.num1=10;
        a1.num2=15;
	    a1.perform();
        System.out.println(a1.result);	
	}
}	
