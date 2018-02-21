package com.bookshopping.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.bookshopping.model.ItemListModel;
import com.google.gson.Gson;

public class WalmartApiService {

	public ItemListModel callWalmartApi() {

		String url = "http://api.walmartlabs.com/v1/items?ids=12417832,19336123&apiKey=****************";

		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();

			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			// print result
			Gson gson = new Gson();
			ItemListModel itemModel = gson.fromJson(response.toString(), ItemListModel.class);
			return itemModel;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;


	}
}
