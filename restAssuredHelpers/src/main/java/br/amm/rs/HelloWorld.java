/**
 * 
 */
package br.amm.rs;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

/**
 * @author andersonmann
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Response response = RestAssured.request(Method.GET, "http://restapi.wcaquino.me/ola");
		System.out.println(response.getBody().asString());

	}

}