package packages;

public class Operators {

	public static void main(String[] args) {
		//ARITHMETIC OPERATOR
		int a=20,b=10;
		System.out.println("a+b ="+(a+b));
		System.out.println("a-b ="+(a-b));
		System.out.println("a/b ="+(a/b));//quotient
		System.out.println("a%b ="+(a%b));//reminder
		
		//assignment operator
		
		System.out.println(a+=b);//a+b
		System.out.println(a-=b);//a-b
		
		//Relational operation
		int v1=40,v2=20;
		System.out.println(v1 > v2);
		System.out.println(v1 == v2);
		
		//logical operators
		System.out.println("---logical---");
		String username= "abc",password="abc123";
		System.out.println(username=="abc" && password =="abc123");
		System.out.println(username=="abc" ||password =="abc123");
		System.out.println(!(username=="abc"));
		System.out.println(!(username=="abcd"));
		
		//unary operators
		System.out.println("unary op");
		int v3=10;
		System.out.println(v3++);
		System.out.println(v3);
		System.out.println(++v3);
		// ternary operator
		  //variable=condition?exp1:exp2;
		int x=100 ,y=50;
		String s = x>y?"x is greater":"y is greater";
		System.out.println(s);
		
		//swapping
		int o=50,p=20,temp;
		System.out.println("0="+o);
		System.out.println("p="+p);
	    temp=o;
		o=p;
		p=temp;
		System.out.println("0="+o);
		System.out.println("p="+p);
		
		//swap using operators
		int u=20,v=30;
		System.out.println("value of u ="+u);
		System.out.println("value of v ="+v);
		u=u+v;//50
		System.out.println("value of u ="+u);
		v=u-v;//20
		System.out.println("value of v ="+v);
		u=u-v;//30
		//after swapping
		System.out.println("After swapping value of u ="+u);
		System.out.println("After swapping value of v ="+v);
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
	
		

	}

}
