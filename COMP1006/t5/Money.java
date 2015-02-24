public class Money {
	private int dollars;
	private int cents;

	public String getMoney(){
		return "$" + String.format("%01d", dollars) + "." + String.format("%02d", cents);
	}

	public Money(int d, int c){
		if (c >= 99) {
			double dollarsfromc = c/100f;
			c = c%100;
			d += (int)dollarsfromc;
		}
		this.dollars = d;
		this.cents = c;
	}

	public Money(int c){
		if (c >= 99) {
			double dollarsfromc = c/100f;
			this.cents = c%100;
			this.dollars = (int)dollarsfromc;
		} else {
			this.cents = c;
		}
	}

	public Money(double c){
		this.dollars = (int)c;
		this.cents = (int)((c*100)%100);
	}

	public Money(){
		this.dollars = 0;
		this.cents = 0;

	}

	public void add(int c){
		c += this.cents;
		int d = 0;
		if (c >= 99) {
			double dollarsfromc = c/100f;
			c = c%100;
			d = (int)dollarsfromc;
		}
		this.dollars += d;
		this.cents = c;
	}

	public void add(int d, int c){
		c = this.cents;
		if (c >= 99) {
			double dollarsfromc = c/100f;
			c = c%100;
			d += (int)dollarsfromc;
		}
		this.dollars += d;
		this.cents = c;
	}

	public int remove(int c){
		if (c > this.cents) {
			int cents = this.cents;
			this.cents = 0;
			return cents;

		} else {
			this.cents -= c;
			return c;
		}
	}
}