package adamkorzeniak.com.cryptopocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HTTPResource {

    public static List<Coin> getCoins() {
        List<Coin> coins = new ArrayList<>();

        HttpURLConnection connection = null;
        URL url = null;
        StringBuilder sb = null;

        try {
            url = new URL("https://api.coinmarketcap.com/v2/ticker/?limit=0");
            connection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return null;
    }
}
