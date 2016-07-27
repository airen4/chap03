package com.hybrid.http;

import javax.swing.Spring;

import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

public class SpringWebClientTest {

	public static void main(String[] args) {
		
//		GET();
		POST();
		
	}
	
	static void GET() {
	
		System.out.println("Start spring...");
		
		RestTemplate rest = new RestTemplate();
		
		String body = rest.getForObject("http://localhost:8080/Hello.jsp?name={name}&addr={addr}", 
					  String.class, "카뮤","실크 파레스");
		
		System.out.println(body);
		System.out.println("End spring...");
		
	}
	
	/*
	 * post는 get보다는 좀 더 복잡하다....
	 */
	static void POST() {
		
		System.out.println("Start spring...");
		
		RestTemplate rest = new RestTemplate();
		
		LinkedMultiValueMap<String, String> params =new LinkedMultiValueMap<>();
		params.add("name", "미카제 아이");
		params.add("addr", "샤이닝 사무소");
		
		String body = rest.postForObject("http://localhost:8080/Hello.jsp", params, String.class);
		System.out.println(body);
		
		
		System.out.println("End spring...");
		
	}

}
