package com.Dealerware.Tests;

import org.testng.Assert;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import  io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.framework.base.BasePage;
import com.framework.base.constants.FrameworkConstants;
import com.framework.driver.WebUIDriver;
import static com.framework.elements.Locator.byXPath;
import static com.framework.elements.Locator.byId;
import static com.framework.elements.Locator.byLinkText;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.EmptyFileException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.framework.elements.Button;
import com.framework.elements.Checkbox;
import com.framework.elements.CustomAsserts;
import com.framework.elements.Dropbox;
import com.framework.elements.Label;
import com.framework.elements.Table;
import com.framework.elements.TextField;
import com.framework.restAPI.URL;
import com.framework.util.DatesUtil;
import com.framework.util.StringHash;
import com.framework.util.TestReportsLog;
import com.relevantcodes.extentreports.LogStatus;
import com.framework.elements.Link;
import com.framework.elements.PickList;
import com.framework.elements.RadioButton;

public class Dealerware_GetAPIDataFromPrecision {
	
	@Test(priority=1)
	public void GetAccountDetails()
	{	
               
                // Get authenticated to the API using Token (Always use Encripted username and password to authenticate API'S)

		String token1 ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJFbXBsb3llZUlkIjoiMCIsIlVzZXJuYW1lIjoiU2FudG9zaCBHb3V0aGEiLCJGaXJzdE5hbWUiOiJTYW50b3NoIiwiTGFzdE5hbWUiOiJHb3V0aGEiLCJFbWFpbCI6IlNhbnRvc2hfR291dGhhQHlsY29uc3VsdGluZy5jb20iLCJGdWxsTmFtZSI6IlNhbnRvc2ggR291dGhhIiwiQmFuayI6IklCQyBMYXJlZG8iLCJCcmFuY2giOiJNYWluIE9mZmljZSAtIDFzdCBGbG9vciIsIkJhbmtJRCI6IjEiLCJSb2xlIjoiMiIsIkJyb3dzZXJJbmZvIjoiSUE2SmxKdFp4VXNSVDZqLzlBMGFBS0ZjSWVUblJWT3VBa3FuRVhLYmpYbDhFSHFZc2hmbU5na0ExSlQyMnpJeFErelRtU1J1UndmUHRXRGdmOW56V0dXM2hmekF4Z1ZzSEU0aDFxdE5FSFhvbHVaaDdBVmVpQTJyV1lFcTVnY0VyTU5nK1l2ZjFFMmRnMWZXbmlnaDFKZGc0QU41Rk1wODFRSUZqMVNxb0Myd0ZreUVPUkxFUXBqTnNhVTVkazNBVWRCb1pvOEpRL1dWTnExTEt4a2tkT0RXVXJWVVg1YThpZDArbTE4ZjVXU0dibWhUeUw1cTBxVk01M0YySFA3T3JnR2NsTmhyRmY0RUZudDVwMnAzNmtqaWNpVT0iLCJJc0JTQSI6IlRydWUiLCJJc1FDIjoiRmFsc2UiLCJJc0xlZ2FsIjoiRmFsc2UiLCJJc1NhbGVzIjoiVHJ1ZSIsIklzU3VwZXJ2aXNvciI6IkZhbHNlIiwiVXNlclJvbGVzIjoiMjcsMjYsMjQsNCwyIiwiT2xkUmVwb3J0cyI6Imh0dHA6Ly85OTAxZHNxbGhyem52MDEvUmVwb3J0cy9QYWdlcy9Gb2xkZXIuYXNweCIsIk5ld1JlcG9ydHMiOiJodHRwOi8vOTkwMWRzcWxocnpudjAxL1JlcG9ydHMvUGFnZXMvRm9sZGVyLmFzcHgiLCJSZXBvcnRVUkwiOiJodHRwOi8vOTkwMWRzcWxocnpudjAxL1JlcG9ydHMvIiwiRmVhdHVyZXMiOiJET0MsTUFQUCxBQVBQLEFDTyxPVlIsRE9DLFVUQyxQUk8sQlJOLFRTQSxEQ0wsV0NMLE1BUFAsQUFQUCxPUlBULE5SUFQsQ0RSLEJSUCxVQUQsMzYwLFRFTCxFQVYsQ0FNLENEQixGQUQsTEFQLE1BQyxPQlAsT1BSVCxQRVIsUkFTLFNBRCxTV1UsVENLLFRSQSxVUkFTLFVDRCxVREIiLCJMb2dpbklkIjoiMjc3MyIsImV4cCI6MTYxMTI5Mzg1MSwiaXNzIjoiaWJjLmNvbSJ9.v-RHYWCS5UbVpU2OxDGWSdcJVmnnCnwE1xCuNQ7EY8s";
		String token2 ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJFbXBsb3llZUlkIjoiMCIsIlVzZXJuYW1lIjoiUmFtYW5qYVJlZGR5IG1lcnVndSIsIkZpcnN0TmFtZSI6IlJhbWFuamFyZWRkeSIsIkxhc3ROYW1lIjoiTWVydWd1IiwiRW1haWwiOiJyYW1hbmphcmVkZHlAeWxjb25zdWx0aW5nLmNvbSIsIkZ1bGxOYW1lIjoiUmFtYW5qYXJlZGR5IE1lcnVndSIsIkJhbmsiOiJJQkMgTGFyZWRvIiwiQnJhbmNoIjoiTWFpbiBPZmZpY2UgLSAxc3QgRmxvb3IiLCJCYW5rSUQiOiIxIiwiUm9sZSI6IjEiLCJCcm93c2VySW5mbyI6IklRNktnWnBBekRrelJMbnl2QUVoUk9jTVlJenBSRkdpQUVxdEVIcWVnbjU5ZkE3QjhFdlVGd2RWaU5hcW1qVlRCTEtYM2dSMENTMzA0aUx3SDczb1NRTFc0dkhVdUdwNldncGtrNzFZQWxMa3RhdzJsRnNFbEE2NFJ1UlJoR3BneTZ0WTNheVcxR2FSaTFtWjhHMEIxNG9tclNVK1hwSS9nQU1KaWtLcW9DaTJIMXo1YVVDVUVLS0Q0dmQ4TVZIREhOWjJlNHRIUXV1S05xeFZOQnNnRzYzU1ZiYzhDNVR0azR0cXpROGZzbXZXWkdoZnlMbzQwcUpFNUNFNlMvbWNwRmFhbGlzTTNicmtHY2dXWDIxTW5CWjFvOFlvTEtzNndBPT0iLCJJc0JTQSI6IkZhbHNlIiwiSXNRQyI6IkZhbHNlIiwiSXNMZWdhbCI6IkZhbHNlIiwiSXNTYWxlcyI6IlRydWUiLCJJc1N1cGVydmlzb3IiOiJUcnVlIiwiVXNlclJvbGVzIjoiMjQsMjEsNCwxIiwiT2xkUmVwb3J0cyI6Imh0dHA6Ly85OTAxZHNxbGhyem52MDEvUmVwb3J0cy9QYWdlcy9Gb2xkZXIuYXNweCIsIk5ld1JlcG9ydHMiOiJodHRwOi8vOTkwMWRzcWxocnpudjAxL1JlcG9ydHMvUGFnZXMvRm9sZG";
		
		Response res = given()
				      .header("Authorization","Bearer "+token2)
				      .body("{\"username\":\"TQP8+eH3CspkZ7LXeevIUU5YVhaLXz2AW7s7jt6epU+O9zKmwPFjUQ2Vn67MRBdret99T0+JPpP6LDUd/fzwScKTWpH++ruLNZ68/BGgSeXDvdbnjP/PfQR7RMOh784E8m/1APxOe25XXRlsXNudS5YzF1sPwJcdOEFhuA+6dZY=\",\"password\":\"IbZNZ3yFG8oTwf2vjOUL5Y2+L2pHm0TvGy6Q5oDe8caZ0JXffAlMfaNfdO6AnUjCgDKomRRF7e3YqADp969UtusnruxQjd9oGbV/iN/UOdXm8zNIc/7K3sjjTN2GBHbsUDeni+YJhK04KCR4jpsOWoK/BbTjs48WvLQOuR3ZZpc=\"}")
				      .when().contentType(ContentType.JSON)
				      .get("http://9901dappnhv01:91/serviceexternal/api/Precision/GetAccountDetails?bankId=1&accountNumber=8754213098");
		
		int code = res.getStatusCode();
		
		System.out.println("Status Code is " +code);
		
		System.out.println(res.getBody().asString());
		
		System.out.println(res.getStatusCode());
			
		System.out.println(res.getTime());
	       
                // Verify Response code of an API

		Assert.assertEquals(code, 200);	
		
               // Verify Response message using assert 
		String responseBodyAsString = res.getBody().asString();
		
		Assert.assertTrue(responseBodyAsString.contains("8754213098"));	
		Assert.assertTrue(responseBodyAsString.contains("01 - IBC Laredo"));
		Assert.assertTrue(responseBodyAsString.contains("New"));
		Assert.assertTrue(responseBodyAsString.contains("01/15/2021"));
         
	}
	
}
