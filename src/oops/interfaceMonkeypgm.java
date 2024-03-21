package oops;
interface basicanimal{
	public void eat();
	public void sleep();
}
class monkey {
	public void jump(){
		System.out.println("monkey jumps");
		
	}
	public void bite() {
		System.out.println("monkey bites");
	}
}

class human extends monkey implements basicanimal{
	public void speak() {
		System.out.println("human speaks");
	}

	@Override
	public void eat() {
	System.out.println("human eat");	
		
	}

	@Override
	public void sleep() {
		
		System.out.println("human sleep");
	
}

}
public class interfaceMonkeypgm {

	public static void main(String[] args) {
		basicanimal b=new human();
		b.eat();
		b.sleep();
		
		monkey m=new human();
		m.jump();
		m.bite();
		human h=new human();
		h.speak();
		
		

	}

}


