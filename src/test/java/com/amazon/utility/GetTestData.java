/**
 * @author gaurnitai
 * @created_date Mar 2, 2019
 */

package com.amazon.utility;

import org.testng.annotations.DataProvider;

public class GetTestData {

	@DataProvider(name = "getSignData")
	public Object[][] getSignInData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "sharma.rajeshwar9@gmail.com";
		data[0][1] = "passwordone";
		data[1][0] = "asif@gmail.com";
		data[1][1] = "passwordtwo";
//		data[2][0] = "johny@gmail.com";
//		data[2][1] = "johnyrap";
		return data;

	}

}
