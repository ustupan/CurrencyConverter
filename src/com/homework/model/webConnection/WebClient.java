package com.homework.model.webConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class WebClient {
    private static StringBuffer response = new StringBuffer();
    private String urlString;

    public WebClient(String urlString) {
        this.urlString = urlString;
    }

    public StringBuffer requireData() {
        try {
            URL url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            System.out.println("Unable to prase from website");
        }
        return response;
    }
}

