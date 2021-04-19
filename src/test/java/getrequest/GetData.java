package getrequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetData {

	@Test
	public void testResponseCode()
	{	//Transaction api
		//Response resp = RestAssured.get("https://securegw-stage.paytm.in/order/process");
		
		//Callback api
		Response resp = RestAssured.get("https://securegw-stage.paytm.in/order/process?CALLBACK_URL=http%3A%2F%2Flocalhost%3A8080%2Fpgresponse&CHANNEL_ID=WEB&CHECKSUMHASH=zS%2FC9Ncd5xm3ImNDMDa3B2QAr0t0EPnLXUiRxUCD1EP9EauU3b%2Fy9FkGA3g7VSKZwK6DKlI8tOfMOmDS7Kjx6PHh2dZcOfVEGkC5gcb8VGI%3D&CUST_ID=12435&EMAIL=pushkarsingh978%40gmail.com&INDUSTRY_TYPE_ID=Retail&MID=enKbJM62403241118387&MOBILE_NO=8459386705&ORDER_ID=222334&TXN_AMOUNT=1&WEBSITE=WEBSTAGING");
		
		int code = resp.getStatusCode();
		System.out.println("Status code is" + code);
		Assert.assertEquals(code,200);
		
	}
	
	
	@Test
	public void testbody()
	{	
		//Response resp = RestAssured.get("https://securegw-stage.paytm.in/order/process");
		Response resp = RestAssured.get("https://securegw-stage.paytm.in/order/process?CALLBACK_URL=http%3A%2F%2Flocalhost%3A8080%2Fpgresponse&CHANNEL_ID=WEB&CHECKSUMHASH=zS%2FC9Ncd5xm3ImNDMDa3B2QAr0t0EPnLXUiRxUCD1EP9EauU3b%2Fy9FkGA3g7VSKZwK6DKlI8tOfMOmDS7Kjx6PHh2dZcOfVEGkC5gcb8VGI%3D&CUST_ID=12435&EMAIL=pushkarsingh978%40gmail.com&INDUSTRY_TYPE_ID=Retail&MID=enKbJM62403241118387&MOBILE_NO=8459386705&ORDER_ID=222334&TXN_AMOUNT=1&WEBSITE=WEBSTAGING");
		
		String data = resp.asString();
		System.out.println("Data is" + data);
		
		System.out.println("Response time is"+resp.getTime());
		
	}
	
	
}
