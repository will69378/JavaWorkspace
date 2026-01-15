package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {
	public static void main(String[] args) {

		try {
			String stationName = "종로구";
			String dataTerm = "DAILY";

			String serviceKey = "f6165e79a875ec3bd0b8e6195e025c" 
			+ "fb40976931539648893720ee352ee0f683";

			String serviceUrl = "http://apis.data.go.kr/B552584"
					+ "/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";

			serviceUrl += "?serviceKey=" + serviceKey + 
					"&stationName=" + URLEncoder.encode(stationName, "UTF-8")
					+ "&dataTerm=" + URLEncoder.encode(dataTerm, "UTF-8");

			URL url = new URL(serviceUrl);

			URLConnection ucon = url.openConnection();

			BufferedReader br = new BufferedReader(
					new InputStreamReader(ucon.getInputStream()));

			String data = null;

			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
