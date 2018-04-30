
public class eighteen {

	public eighteen(int money) {
		int ten=0;
		int five=0;
		int two=0;
		int one=0;
		
		while(money != 0) {
			if(money >= 10) {
				ten++;
				money-=10;
			}else if(money >=5) {
				five++;
				money-=5;
			}else if(money >=2) {
				two++;
				money-=2;
			}else if(money >= 1) {
				one++;
				money-=1;
			}
		}
		
		System.out.println("Ten Coin = "+ten);
		System.out.println("Five Coin = "+five);
		System.out.println("Two Coin = "+two);
		System.out.println("One Coin = "+one);
	}
}
