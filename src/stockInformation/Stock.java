package stockInformation;

public class Stock {
	private String tickerName;
	private double priceEarnings;
	private double lastPrice;
	private double fiftyWeekLow;
	private double fiftyWeekHigh;
	private double marketCap;
	private double earnings;
	private double EPS;
	private double trailingEPS;
	private double trailingPE;



	public Stock (String tickerName)  {

		this.tickerName= tickerName;


	}

	public void calcPriceEarnings () {
		priceEarnings = lastPrice/EPS;
		trailingPE = lastPrice/trailingEPS;
	}

	public String getTickerName() {
		return tickerName;
	}



	public void setTickerName(String tickerName) {
		this.tickerName = tickerName;
	}



	public double getPriceEarnings() {
		return priceEarnings;
	}



	public void setPriceEarnings(double priceEarnings) {
		this.priceEarnings = priceEarnings;
	}



	public double getLastPrice() {
		return lastPrice;
	}



	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}



	public double getFiftyWeekLow() {
		return fiftyWeekLow;
	}



	public void setFiftyWeekLow(double fiftyWeekLow) {
		this.fiftyWeekLow = fiftyWeekLow;
	}



	public double getFiftyWeekHigh() {
		return fiftyWeekHigh;
	}



	public void setFiftyWeekHigh(double fiftyWeekHigh) {
		this.fiftyWeekHigh = fiftyWeekHigh;
	}



	public double getMarketCap() {
		return marketCap;
	}



	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}



	public double getEarnings() {
		return earnings;
	}



	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}

	@Override
	public String toString() {
		return "Stock [tickerName=" + tickerName + ", priceEarnings=" + priceEarnings + ", lastPrice=" + lastPrice
				+ ", fiftyWeekLow=" + fiftyWeekLow + ", fiftyWeekHigh=" + fiftyWeekHigh + ", marketCap=" + marketCap
				+ ", earnings=" + earnings + ", EPS=" + EPS + ", trailingEPS=" + trailingEPS + ", trailingPE="
				+ trailingPE + "]";
	}

	public double getEPS() {
		return EPS;
	}

	public void setEPS(double ePS) {
		EPS = ePS;
	}

	public double getTrailingEPS() {
		return trailingEPS;
	}

	public void setTrailingEPS(double trailingEPS) {
		this.trailingEPS = trailingEPS;
	}

}