interface IPlayer {
//	public abstract void walk();
	void walk();
	void kick();
	void jump();
	void punch();
	void defence();
	void EntryStyle();
	void ExitStyle();
//	public static final int MAX_JUMP = 100;
	int MAX_JUMP = 100;
	int DEFAULT_JUMP = 10;
}

interface ExtraPower {
	void show();
	void hide();
}

// also known as adapter class
abstract class CommonFeatures implements IPlayer {
	public void EntryStyle() {
		System.out.println("Entry in Style...");
	}
	public void ExitStyle() {
		System.out.println("Exit in Style...");
	}
}

//class Paul implements IPlayer {
//	
//}

class Eddy extends CommonFeatures implements IPlayer {
	int currentJump = MAX_JUMP;
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		
	}
	
}

class King extends CommonFeatures implements IPlayer, ExtraPower {

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
