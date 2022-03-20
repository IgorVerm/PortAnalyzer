package mainApp;
import connection.YahooFinanceConnection;
import stockInformation.Stock;

public class main {

	public static void main(String[] args) {
		YahooFinanceConnection connection = new YahooFinanceConnection ("ASML");
		YahooFinanceConnection connection2 = new YahooFinanceConnection ("QQQ");
		Stock test = new Stock ("ASML");
		test.setEarnings(9809000);
		test.setLastPrice(683);
		test.setEPS(15.87);
		test.calcPriceEarnings();
		test.setMarketCap(273713000);
		test.setFiftyWeekHigh(895.93);
		test.setFiftyWeekLow(555.50);
		System.out.println(test.toString());

	}

}
