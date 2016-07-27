package com.hybrid.http;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.util.Scanner;

public class WebClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		GET();
//		POST();
	}
	
	
	static void GET() throws UnknownHostException, IOException{
		
		System.out.println("Start...");
		
		Socket sok = new Socket("localhost", 8080);
		InputStream in = sok.getInputStream();
		OutputStream out = sok.getOutputStream();
		
		PrintWriter request = new PrintWriter(out);
		Scanner response = new Scanner(in);
		
		String  name = "美風 藍";
		name = URLEncoder.encode(name);
		
		String addr = "シャイニング 事務所";
		addr = URLEncoder.encode(addr);
		
// 한글이나 그 외 (스페이스-공백포함,특수문자) 다른언어는 encoding 처리를 해야된다...
		System.out.println("name = " + name);
		System.out.println("addr = " + addr);
		
		
		
		request.println("GET /Hello.jsp?name=" + name + "&addr=" + addr + " HTTP/1.1");
		
		request.println("Host:localhost:8080");
		request.println();
		request.println();
		
		request.flush();
		
		while(response.hasNextLine()){
			String line = response.nextLine();
			System.out.println(line);
			
			if(line.toLowerCase().lastIndexOf("</html>") != -1)
				break;
		}
		
		sok.close();
		
		System.out.println("End...");
		
	}

	static void POST() throws UnknownHostException, IOException {
		System.out.println("Start...");
		
		Socket sok = new Socket("localhost", 8080);
		PrintWriter request = new PrintWriter(sok.getOutputStream());
		Scanner response = new Scanner(sok.getInputStream());
		
		
		/*
		 * Request 전문 송신
		 */
		
		String body = "name=" + URLEncoder.encode("세라 릿카", "utf-8") 
					+ "&addr=" + URLEncoder.encode("츠키노 프로덕션", "utf-8");
		
		System.out.println("body = " + body);
		System.out.println("body length = " + body.length());
		
		
		request.println("POST /Hello.jsp HTTP/1.1");
		request.println("Host:localhost:8080");
		request.println("Content-Type:application/x-www-form-urlencoded");
		request.println("Content-Length:" + body.length());
		request.println();
		request.println(body);
		
		request.flush();
		
		
		/*
		 * Response 전문 송신
		 */
		
		
		while(response.hasNextLine()){
			String line = response.nextLine();
			System.out.println(line);
			
			if(line.toLowerCase().lastIndexOf("</html>") != -1)
				break;
		}
		
		sok.close();
		
		System.out.println("End...");
		
	}
}
