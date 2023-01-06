package training_code;

public class Methods {
   int c=5; //instance variable or global variable but default c values id 0.
   //if i entered values inside and outside c values . which one have majority?inside local variable
	int value() {
		return 3;
	}
   void method1(int a, int b) { //local variable
	 int c =3; //if i have given c values error gone.and inside function c value no need 
	 //i need to call instance c values means---> what have to do ----. use this keyword ,by using this we will call method and variable 
		System.out.println(a+b+this.c + this.value());
		System.out.println( this.value());
		System.out.println( this.c);
	}
	
	
	public static void main(String[] args) {
		 Methods obj =new Methods();
		 obj.method1(3, 3);

	}

}
 
