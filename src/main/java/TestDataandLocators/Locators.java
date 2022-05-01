package TestDataandLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 public class Locators  {
	
	 //Login Page Locators
	 @FindBy(id="txtAsiNum")
	 public WebElement ASIno;
	 @FindBy(id="txtUserName")
	 public WebElement username;
	 @FindBy(id="txtPassword")
	 public WebElement passwrod;
	 @FindBy(xpath="//input[@class='btn btn-primary btn-block btnLogin']")
	 public WebElement loginbtn;
	 @FindBy(xpath="//a[@href='javascript:gotoMonitoList()']")
	 public WebElement loginverification;
	
	
	@FindBy(id="txtserach")
	public WebElement textsearch;
	@FindBy(xpath="//div[@class='pgName']")
	public WebElement distsearchtextverification;
	@FindBy(id="cmdSearch")
	public WebElement GO;
	
	
	@FindBy(xpath="//button[@onclick='javascript:validateData()']")
	public WebElement Phunter;
	@FindBy(xpath="//span[@class='PageHeadingGray']")
	public WebElement phunterverification;
	@FindBy(xpath="//span[@class='text-primary']")
	public WebElement paymentdetailverification;
	@FindBy(id="btnAddNewCard")
	public WebElement Addnewcard;
	@FindBy(id="chkTerms")
	public WebElement termscheckbox;
	
	
	@FindBy(id="billingAddress_FirstName")
	public WebElement billingaddress_firstname;
	@FindBy(id="billingAddress_LastName")
	public WebElement billingaddress_lastname;
	@FindBy(id="billingAddress_StreetAddress")
	public WebElement billingaddress_StreetAdress;
	@FindBy(id="billingAddress_City")
	public WebElement billingaddress_City;
	@FindBy(id="billingAddress_State")
	public WebElement billingaddress_state;
	@FindBy(id="billingAddress_PostalCode")
	public WebElement billingaddress_postalcode;
	@FindBy(id="btnSubmit")
	public WebElement submittbtn;
	@FindBy(id="saveCardForFuture")
	public WebElement saveforfuture;
	@FindBy(xpath="//a[contains(text(),'Cancel')]")
	public WebElement cancelbtn;
	public static String paymentverification="//div[@class='Label']";
	
	
	@FindBy(id="tdCardName")
	public WebElement searchnewcard;
	@FindBy(xpath="//input[contains(@src,'RemoveIcon.png')]")
	public WebElement delcard;
	@FindBy(xpath="//button[@class='btn btnCCDelete']")
	public WebElement delcontinue;
	@FindBy(id="btnPlaceOrderOld")
	public WebElement Placeyourorder;
	
	
	@FindBy(xpath="//a[@href='javascript:gotoProspectList()']")
	public WebElement PL;
	@FindBy(xpath="//div[@class='pgName']")
	public WebElement PLverification;
	@FindBy(id="searchDistPL")
	public WebElement EnterDisToPL;
	@FindBy(id="btnAddToPL")
	public WebElement AddToPL;
	@FindBy(xpath="//input[@aria-controls='tblProspectList']")
	public WebElement SearchDisPL;
	@FindBy(xpath="//input[contains(@src,'RemoveIcon.png')]")
	public WebElement RemoveDisFromPL;
	@FindBy(xpath="//button[@class='btn btnPLDelete']")
	public WebElement  contideletePL;
	@FindBy(xpath="//td[@class='dataTables_empty']")
	public WebElement distnotfound;
	public static String DisfoundPL="//span[@class='asi']";
	
	@FindBy(xpath="//a[@href='javascript:gotoMonitoList()']")
	public WebElement ML;
	@FindBy(xpath="//div[@class='pgName']")
	public WebElement MLverification;
	@FindBy(xpath="//input[@aria-controls='tblMonitorList']")
	public WebElement searchdisML;
	@FindBy(xpath="//tr[@class='odd']")
	public WebElement searchdML;
	@FindBy(xpath="//input[contains(@value,'Remove from Monitor')]")
	public WebElement RemovefromML;
	public static String DistfoundML="//a[@data-poptitle='asi/109480']";
	public static String AddToMonitorList="//input[contains(@value,'Add to Monitor List')]";

	
	@FindBy(xpath="//a[@href='/Search']")
	public WebElement AdvanceSearch;
	@FindBy(xpath="//optgroup[@label='--- US States ---']")
	public WebElement statedropdown;
	@FindBy(id="txtCompanyName")
	public WebElement Advancesearchdist;
	@FindBy(xpath="//button[@class='btn btn-custom btnWide']")
	public WebElement Advancesearchbtn;
	@FindBy(xpath="//a[@data-poptitle='asi/109480']")
	public WebElement Addistfound;
	
	
	@FindBy(xpath="//div[@class='crTitle']")
	public WebElement Basicsearch;
	@FindBy(xpath="//tr[@class='odd']")
	public WebElement Basicsearchtable;
	@FindBy(xpath="//tr[@class='even']")
	public WebElement evenrows;
	@FindBy(xpath="//a[contains(@href,'CreditReport')]")
	public WebElement company;
	public static String before_xpath="//*[@id=\"tblMonitorList\"]/tbody/tr[";
	public static String after_xpath="]/td[2]";
	public static String table="//*[@id=\"tblMonitorList\"]/tbody/tr";

	//Range Advance Search
	@FindBy(id="s2id_drpRange") public WebElement Range;
	public static String Rangedatafetch="//li[@class='select2-results-dept-0 select2-result select2-result-selectable']";
	
	//product line
	@FindBy(id="s2id_drpProdLine")
	public WebElement productline;
	public static String productlinefetch="//li[@class='select2-results-dept-0 select2-result select2-result-selectable']";
	
	//View Dyas
	@FindBy(id="s2id_drpDays")
	public WebElement viewdays;
	public static String viewdaysfetch="//li[@class='select2-results-dept-0 select2-result select2-result-selectable']";
	
	//Customer Type
	@FindBy(id="s2id_drpCustomerType")
	public WebElement Customertype;
	public static String Customertypefetchresult="//li[@class='select2-results-dept-0 select2-result select2-result-selectable']";
	
	//payhabitfromto
	@FindBy(id="s2id_drpAvgPayHabitFrom")
	public WebElement payhabitfrom;
	public static String payhabitfetchresultfrom="//li[@class='select2-results-dept-0 select2-result select2-result-selectable']";
	
	//payhabitfromto
	@FindBy(id="s2id_drpAvgPayHabitTo")
	public WebElement payhabitto;
	public static String payhabitfetchresultto="//li[@class='select2-results-dept-0 select2-result select2-result-selectable']";
	
	//currentcredit
	@FindBy(xpath="//div[@class='companyAverageAloneInBox float-left']")
	public WebElement CurrentCredit;
	@FindBy(xpath="//div[@class='padTop10 padLeft10 float-left creditScore bold']")
	public WebElement creditscore;
	public static String listCurrentCredit="//div[contains(text(),'N/A')][contains(@class,'companyAverageAloneInBox float-left')]";
	
	//distributor profile
	@FindBy(xpath="//a[contains(@href,'#productModal')]")
	public WebElement ESPProduct;
	@FindBy(xpath="//div[@class='modal-header'][1]")
	public WebElement ESPProductmodalwindowtext;
	public static String dfbeforexpath="//*[@id=\"prodCategories\"]/tbody/tr[1" ;
	public static String dfafterxpath="]/td";
	public static String dftable="//tr/parent::tbody[contains(@aria-live, 'polite')]";
	@FindBy(xpath="//div[contains(@id,'productModal')]/descendant::button")
	public WebElement CloseProductModalWindow;
	
	//Distributor Credit History
	public static String distcredithistory="//*[@id=\"CreditHistoryCollapse\"]/div/div/table/tbody/tr";
	public static String distcreditbefore_xpath="//*[@id=\"CreditHistoryCollapse\"]/div/div/table/tbody/tr[";
	public static String distcreditcol1after_xpath="]/td[1]";
	public static String distcreditafter_xpath="]/td[2]";
	public static String pre6monthsafter_xpath="]/td[3]";
	public static String IndusturyAverageafter_xpath="]/td[4]";
	public static String GeneralCreditsafter_xpath="]/td[5]";
	
	//Average Paying Habit
	public static String APHtable="//*[@id=\"AveragePayHabitsCollapse\"]/div/div/table/tbody/tr";
	public static String APHrowbefore_xpath="//*[@id=\"AveragePayHabitsCollapse\"]/div/div/table/tbody/tr[";
	public static String APHcol1after_xpath="]/td[1]";
	public static String APHcol2after_xpath="]/td[2]";
	public static String APHcol3after_xpath="]/td[3]";
	public static String APHVolumnafter_xpath="]/td[4]";
	
	//Reporing
	public static String MyReports="//a[contains(text(),'MY REPORTS')]";
	public static String SingleTransaction="//a[contains(text(),'Report a Single Transaction')]";
	public static String ReportASINo="txtAsi";
	public static String ReportCompanyNo="txtCompany";
	public static String ReportCompanyNotypeahead="//li[@data-value='AIA Corporation']";
	public static String invoicedate="txtInvoiceDate";
	public static String paymentduedate="txtPaymentDueDate";
	public static String invoiceleftarrow="//i[@class='icon-arrow-left']";
	public static String invoiceselectdate="//td[contains(text(),'1')]";
	public static String paymentselectdate="//div[contains(@class,'datepicker datepicker-dropdown dropdown-menu')][2]/div/table/tbody/tr[1]/td[2]";
	public static String paymentleftarrow="//div[contains(@class,'datepicker datepicker-dropdown dropdown-menu')][2]/div/table/thead/tr/th/i";
	public static String invoiceamount="txtInvoiceAmount";
	public static String amountpaid="txtAmountPaid";
	public static String extendedcreditamount="txtExtendedCreditAmount";
	public static String datepaid="txtDatePaid";
	public static String reportsubmit="//input[@onclick='SubmitPayment()']";
	public static String reportphone="txtPhone";
	public static String reportad1="txtAddress1";
	public static String reportcity="txtCity";
	public static String reportzip="txtZip";
	public static String reportstate="drpState";
	public static String reportcontactname="txtContactName";
	public static String reportconfirmation="SavedSuccess";

	//Colleaction TAB
	
	
	@FindBy(xpath="//a[contains(@href,'#tabCollections')]")
	public WebElement CollectionsTab;
	@FindBy(xpath="//input[contains(@name,'AgencyName')]")
	public WebElement AgencyName;
	@FindBy(xpath="//input[contains(@name,'CollectionsAmount')]")
	public WebElement CollectionsAmount;
	@FindBy(xpath="//input[contains(@name,'CollectionsPaymentAmount')]")
	public WebElement CollectionsPaymentAmount;
	@FindBy(xpath="//input[contains(@id,'txtCollectionsDate')]")
	public WebElement CollectionsDate;
	@FindBy(xpath="//input[contains(@id,'txtCollectionsPaymentDate')]")
	public WebElement CollectionsPaymentDueDate;
	@FindBy(xpath="//input[contains(@onclick,'SubmitCollections()')]")
	public WebElement SubmitCollectionReport;
	@FindBy(xpath="//select[contains(@id,'CollectionDisputeFlag')]")
	public WebElement CollectionDisputeFlag;
	@FindBy(xpath="//select[contains(@id,'WriteOffDisputeFlag')]")
	public WebElement WriteOffDisputeFlag;
	
	
	
	
	//Write Off TAB
	
	
		@FindBy(xpath="//a[contains(@href,'#tabWriteOff')]")
		public WebElement WriteOffTab;
		@FindBy(xpath="//input[contains(@name,'WriteOffAmount')]")
		public WebElement WriteOffAmount;
		@FindBy(xpath="//input[contains(@id,'txtWriteOffDate')]")
		public WebElement WriteOffDate;
		@FindBy(xpath="//input[contains(@onclick,'SubmitWriteOff()')]")
		public WebElement SubmitWriteOff;
		
		
	//Past Due	
		@FindBy(xpath="//div[contains(@class,'tabNameFont')][contains(text(),'Past Due')]")
		public WebElement PastDue;
		@FindBy(xpath="//input[contains(@name,'IsFullPayment')]")
		public WebElement PartialInvoiceAmount;
		@FindBy(xpath="//input[contains(@id,'txtPastDueAmount')]")
		public WebElement PastDueAmount;
		@FindBy(xpath="//input[contains(@onclick,'SubmitPastDue()')]")
		public WebElement SubmitPastDue;
		
		
		
		
		
	//UAT Locators
	public static String cardno="cardInfo_Number";
	public static String CVV="cardInfo_Cvv";
	public static String expiredate="cardInfo_ExpirationDate";
	
	//My Application
	@FindBy(xpath="//a[contains(text(),'My Applications')]")
	public WebElement MyApplications;
	@FindBy(xpath="//a[contains(text(),'ESP Analytics')]")
	public WebElement ESPAnalytics;
	@FindBy(xpath="//img[contains(@class,'logo-icon')]")
	public WebElement ESPAnalytics_Title;
	@FindBy(xpath="//a[contains(text(),'ESP Updates')]")
	public WebElement ESPUpdates;
	@FindBy(xpath="//a[contains(@class,'span2 espLogo')]")
	public WebElement ESPUpdates_Title;
	@FindBy(xpath="//a[contains(text(),'Email Marketing')]")
	public WebElement EmailMarketing;
	@FindBy(xpath="//div[contains(@class,'logoText')]")
	public WebElement  EmailMarketing_Title;
	
	
	//FooterLinks 
	@FindBy(xpath="//a[contains(text(),'ASI Magazines')]")
	public WebElement  ASIMagazines;
	@FindBy(xpath="//div/ul/li/a[contains(text(),'Connect')]")
	public WebElement  Connect;
	@FindBy(xpath="//a[contains(text(),'ESP Web')]")
	public WebElement  ESPWeb;
	@FindBy(xpath="//a[contains(text(),'ESP Advertising')]")
	public WebElement  	ESPAdvertising;
	@FindBy(xpath="//a[contains(text(),'ESP Websites')]")
	public WebElement  	ESPWebsites;
	@FindBy(xpath="//a[contains(text(),'Email Express')]")
	public WebElement  	EmailExpress;
	@FindBy(xpath="//a[contains(text(),'ASI Sales Pro')]")
	public WebElement  	ASISalesPro;

	@FindBy(xpath="//a[contains(text(),'ASI Central')]")
	public WebElement  	ASICentral;
	@FindBy(xpath="//a[contains(text(),'Tim Andrews Blog')]")
	public WebElement  	TimAndrewsBlog;
	@FindBy(xpath="//a[contains(text(),'ASI Facebook')]")
	public WebElement  	ASIFacebook;
	@FindBy(xpath="//a[contains(text(),'ASI YouTube')]")
	public WebElement  	ASIYouTube;
	@FindBy(xpath="//a[contains(text(),'ASI Twitter')]")
	public WebElement  	ASITwitter;
	
	@FindBy(xpath="//a[contains(text(),'About ASI')]")
	public WebElement  	AboutASI;
	@FindBy(xpath="//a[contains(text(),'Press Releases')]")
	public WebElement  	PressReleases;
	@FindBy(xpath="//a[contains(text(),'ASI Careers')]")
	public WebElement  	ASICareers;
	
	@FindBy(xpath="//a[contains(text(),'Feedback')]")
	public WebElement  	Feedback;
	
}
