package testt;

import java.util.Random;

public class PlatinumMember implements Observer {

	IDealer dealer;
	Random random = new Random();
	int number = random.nextInt(10);
	public PlatinumMember(IDealer dealer) {
		// TODO Auto-generated constructor stub
		this.dealer = dealer;
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
			System.out.println("I win platinum prizw, my number is " + i);
		}else {
			System.out.println("I lost platinum prizw, my number is " + i);
		}
		
	}

	

}
