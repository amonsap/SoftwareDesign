package testt;

import java.util.Random;

public class PremiumMember implements Observer {

	Random random = new Random();
	int number = random.nextInt(10);
	public PremiumMember(IDealer dealer) {
		// TODO Auto-generated constructor stub
		}
	
	@Override
	public void doLotteryResult() {
		// TODO Auto-generated method stub
		System.out.println("Lottery Result is " + number);
	}
	@Override
	public void buyNumber(int i) {
		// TODO Auto-generated method stub
		if(i == number) {
			System.out.println("I win agolden prizw, my number is " + i);
		}else {
			System.out.println("I lost agolden prizw, my number is " + i);
		}
	}



}
