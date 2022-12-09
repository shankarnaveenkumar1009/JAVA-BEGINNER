class Calculator{
	int num1;
	int num2;
	public void perform(){
		result=num1+num2;
	}
}
public class a1Demo{
	public static void main(String[]args){
	    Calculator a=new Calculator();
        a.num1=10;
        a.num2=15;
	    a.perform();
        System.out.println(a.result);	
	}
}	
