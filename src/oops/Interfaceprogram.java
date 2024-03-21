package oops;
interface TvRemote
{
	public void poweroff();
	public void on();
	public void volup();
	public void voldown();
	public void channelup();
	public void channeldown();
}
interface SmarttvRemote extends TvRemote
{
	public void prime();
public void netflix();
public void youtube();

	}
class Tv implements SmarttvRemote{

	@Override
	public void poweroff() {
		System.out.println("off");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void on() {
		System.out.println("onn");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volup() {
		System.out.println("vol up");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voldown() {
		System.out.println("vol down");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channelup() {
		System.out.println("channel up");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void channeldown() {
		System.out.println("channel down");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prime() {
		System.out.println("prime ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void netflix() {
		System.out.println("netflix");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void youtube() {
		System.out.println("yt launched");
		// TODO Auto-generated method stub
		
	}}


public class Interfaceprogram {

	public static void main(String[] args) {
		Tv ob=new Tv();
		ob.channeldown();
		ob.channelup();
		ob.netflix();
		ob.prime();
		
		

	}

}
