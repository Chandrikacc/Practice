package frameworkCheck;

import genericUtility.PropertyUtility;

public class PropertyUtilityCheck {

	public static void main(String[] args) {
		PropertyUtility utility=new PropertyUtility();
		System.out.println(utility.fetchingDataFromPropertyFile("url"));
		System.out.println(utility.fetchingDataFromPropertyFile("username"));
		System.out.println(utility.fetchingDataFromPropertyFile("password"));

	}

}
