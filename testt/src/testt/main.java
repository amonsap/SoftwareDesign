package testt;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDealer dealer = new Dealer();
		Observer g1 = new PremiumMember(dealer);
		Observer g2 = new PremiumMember(dealer);
		Observer d1 = new PlatinumMember(dealer);
		g1.buyNumber(2);//ซื้อ
		g2.buyNumber(7);
		d1.buyNumber(8);
		dealer.doLotteryResult();//ออก
		dealer.doLotteryResult();
		dealer.removeMember(g2);
		dealer.doLotteryResult();
	}

}
