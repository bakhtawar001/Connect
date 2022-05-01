package TestDataandLocators;

import java.util.Random;

public class TestData {
	public static final String Deleteverification = null;
	static Random rn= new Random() ;
	static int randomno = rn.nextInt(100000) + 1;
	static int firstname=rn.nextInt(100000)+1;
	static int lastname=rn.nextInt(100000)+1;
	
	public static String appurl="https://connect.asicentral.com/";
	public static String ASI="30232";
	public static String username="conn_phunter";
	public static String password="pakistan123@";
	public static String textsearch="test";
	public static String billingaddress_firstname="Bakhtawar"+firstname;
	public static String billingaddress_lastname="malik"+lastname;
	public static String billingaddress_StreetAdress="4800 street road";
	public static String billingAddress_City="trevose";
	public static String billingAddress_state="PA";
	public static String billingaddress_postalcode="19053";
	public static String UATcardnumber="4032038850658299";
	public static String UATCVV="892";
	public static String UATexpiredate="0224";
	
	public static String AddDisttoPL="109480";
	public static String AddDisttoML="109480";
	public static String Advancesearch="109480";
	public static String reportingamount="500";
	
	 public static String sEdge="exefile/MicrosoftWebDriver.exe";
	
	//public static String Searchkeyword="may2019" +randomno;
	//public static String Deleteverification;
	
	//public static String campaignname="campaigncreation"+camprandomno;
	//public static String subjline="welcomecampaign"+subjectline;
	
	
}
