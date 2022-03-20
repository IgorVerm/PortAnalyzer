package connection;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class YahooFinanceConnection {
	public YahooFinanceConnection (String ticker) {
		
	}
	
	public void lookup (String ticker) {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://yfapi.net/v8/finance/chart/"+ticker))
				.header("x-api-key", "YOUR-PERSONAL-API-KEY")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
				HttpResponse<String> response;
				try {
					response = HttpClient.newHttpClient()
					.send(request, HttpResponse.BodyHandlers.ofString());
					System.out.println(response.body());
				} catch (IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		
	}
	
}
