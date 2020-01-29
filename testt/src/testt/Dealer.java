package testt;

import java.util.Random;

public class Dealer extends IDealer {

	public int doLotteryResult() {
		// TODO Auto-generated method stub
		Random random = new Random();
		int number = random.nextInt(10);
		return number;
	}

	public void removeMember(Observer g2) {
		// TODO Auto-generated method stub
		
	}

}
