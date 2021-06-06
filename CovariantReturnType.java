class NormalUsers {
	int deliveryCharges = 100;
	int deliveryTime = 4;
	boolean giftFeatures = false;
}

class PrimeUsers extends NormalUsers {
	int primeDeliveryCharges = 10;
	int primeDeliveryTime = 1;
	boolean primeGiftFeature = true;
}

class PrimeVideos {
	void show() {
		System.out.println("Welcome to prime videos...");
	}
}

class AmazonUsers {
	NormalUsers show() {
		System.out.println("This is normal user account...");
		NormalUsers obj = new NormalUsers();
		return obj;
	}
}

class AmazonPrimeUsers extends AmazonUsers {
	@Override
	PrimeUsers show() {
		System.out.println("This is prime user account...");
		PrimeUsers obj = new PrimeUsers();
		return obj;
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonPrimeUsers obj = new AmazonPrimeUsers();
		PrimeUsers prime = obj.show();
	}

}
