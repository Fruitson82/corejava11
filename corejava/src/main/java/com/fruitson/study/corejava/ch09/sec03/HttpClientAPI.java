package com.fruitson.study.corejava.ch09.sec03;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;

/**
 * 09.02. 자바 입출력 - HTTP 커넥션
 * 	
 * @author Fruitson
 * @since 2019.05.27
 */
public class HttpClientAPI {
	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		HttpClient client = HttpClient.newBuilder()
				.followRedirects(HttpClient.Redirect.ALWAYS)
				.build();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(new URI("http://horstmann.com"))
				.GET()
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		String bodyString = response.body();
		
		System.out.println(bodyString);
	}
	
}
