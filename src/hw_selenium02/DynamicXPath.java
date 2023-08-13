package hw_selenium02;
//Q 1: HW_SL02: Create 5 dynamic XPath for each following way. 
//a) Tag with a single attribute b) Tag with multiple attributes with 'and' logic
//c) Tag with inner text 
//d) Tag with partial inner text from any website.
//Write them by commenting in any class inside a package and push them to GitHub. Paste the link below.

public class DynamicXPath {
	
	/*
	 * Tag with a single attribute:
	 * 	 //input[@id='twotabsearchtextbox'] <---- Amazon {earch Field}
	 * //input[@id='nav-search-submit-button'] <----- Amazon {earch Button}
	 * //a[@id='homepage-link'] <---------- BBC {Home Page}
	 * //button[@id='cms-login-submit'] <---------- https://portal.cms.gov/portal/ {Login button}
	 * //input[@class='search-input'] <--------- Best Buy {Search Field} 
	 */

	
	/*
	 *  Tag with multiple attributes with 'and' logic 
	 *  //input[@id='mh-search-input' and @class='mh-search-input'] <--- Dell Technologies {Search Field}
	 *  //input[@id='SearchBox' and @name='HtmlSearchCriteria'] <------ Parkland Health {Search Field}
	 *  //input[@id='searchDesktop' and @class='header-search']  <-- https://www.pa.gov/ { Serach Field} 
	 *  //a[@id='cms-newuser-reg' and 'cms-newuser-reg'] <--- https://portal.cms.gov/portal/ {New User Reg}
	 *  Below https://portal.cms.gov/portal/  {CMS Icon}
	 *  //em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']
	 */
	
	
	
	/*
	 * c) Tag with inner text 
	 * //a[text()='Deal of the Day'] <-- Best Buy Deal of the day
	 * //a[text()='Gift Cards'] <--- Best Buy Gift Cards
	 * //span[text()='Logout'] <--- EnthrallIT Log Out
	 * //a[text()='Return site'] <--- EnhtrallIT Return Site
	 * //span[text()='Applications'] <--- CMS Applications
	 */
	
	
	
	/*
	 * d) Tag with partial inner text from any website.
	 * //html tag [contains(text(), 'partial or complete inner text value') ]
	 * //div[contains(text(),'Shoes & ')] <-- JC Penny {Shoes and Accessories}
	 * //a[contains(text(),'Weekly')] <--- Target weekly Ad 
	 * //a[contains(text(),'Thursday Night Football on Prime starts Sep. 14')]
	 * //a[contains(text(),'Thursday')] <--- Amazon Thursday Night Football on Prime
	 * //a[contains(text(),'Back to ')]<---- Amazon Back to School
	 */
	
	
	
	
	
}
