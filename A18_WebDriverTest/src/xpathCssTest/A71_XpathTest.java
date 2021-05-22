package xpathCssTest;

public class A71_XpathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Absolute path - /html/body/div[2]/div/div[3]/div[2]/form/input[1]
		// Relative path -  //*[@id="sb_form_q"]
		
		// Relative path - .//tagname[@attribute='value']
		
		// Relative path - .//*[@attribute='value']
/*************************************************************************************************/
		//Example - .//input[@aria-label='Enter your search term']
		//Example - .//input[@name='q']
		
/**************************************************************************************************/
	//	contains ,starts-with, ends with
		
		//contains xpath:
		// syntax   - .//tagname[contains(@attribute,'value')]
		//Example   - .//input[contains(@aria-label,'Enter your search term')] - true
		//Example   - .//input[contains(@aria-label,'Enter your search')] - true
		//Example   - .//input[contains(@aria-label,'your search term')] - true
		//Example   - .//input[contains(@aria-label,'your search')] - true
		//Example   - .//input[contains(@aria-label,'Enter search term')] - false
		
		// starts- with xpath
		
		// syntax   - .//tagname[contains(@attribute,'value')]
	    //Example   - .//input[starts-with(@aria-label,'Enter your search term')] - true
		//Example   - .//input[starts-with(@aria-label,'Enter your search')] - true
	    //Example   - .//input[starts-with(@aria-label,'your search term')] - false
		//Example   - .//input[starts-with(@aria-label,'your search')] - false
		//Example   - .//input[starts-with(@aria-label,'Enter search term')] - false
		
        // ends-with xpath
		
		// syntax   - .//tagname[contains(@attribute,'value')]
	    //Example   - .//input[ends-with(@aria-label,'Enter your search term')] - true
		//Example   - .//input[ends-with(@aria-label,'Enter your search')] - false
	    //Example   - .//input[ends-with(@aria-label,'your search term')] - true
		//Example   - .//input[ends-with(@aria-label,'your search')] - false
		//Example   - .//input[ends-with(@aria-label,'Enter search term')] - false
		
/*********************************************************************************************************/		
		// text function based
		
		//text() - <tag>matching text</tag>
		//Syntax - .//tagname[text()='matched text']
		//Syntax - .//tagname[contains(text(),'matched text')]
		//Syntax - .//tagname[starts-with(text(),'matched text')]
		//Syntax - .//tagname[ends-with(text(),'matched text')]
		
		//Example - .//span[text()='Languages:']          - true
		//Example - .//span[contains(text(),'anguages')]  - true
		//Example - .//span[starts-with(text(),'Langua')] - true
		//Example - .//span[ends-with(text(),'guages:')]  - true
		//Example -  .//a[text()='Images']                - true
		
/*************************************************************************************************************/
		
		//AND or OR operator
		
		//AND Syntax   - .//tagname[@attrib1='value1' and @attrib2='value2']
		
		// true and true - true, true and false -false, false and false - false
		
		// AND example - .//input[@id='sb_form_q' and @name='q'] - true
		// AND example - .//input[@id='sb_form_a' and @name='q'] - false
		// AND example - .//input[@id='sb_form_q' and @name='a'] - false
		
		//OR Operator
		
		//OR Syntax   - .//tagname[@attrib1='value1' and @attrib2='value2']
		
		// true or true - true, true or false -true, false or false - false

		
		// OR example - .//input[@id='sb_form_q' or @name='q'] - true
		// OR example - .//input[@id='sb_form_a' or @name='q'] - true
		// OR example - .//input[@id='sb_form_q' or @name='a'] - true
		// OR example - .//input[@id='sb_form_a' or @name='a'] - false
		
/******************************************************************************************************/		
		//following
		
		//Syntax  -  .//tagname[@attribute='value']/following::tagname
		//Syntax  -  .//tagname[@attribute='value']/following::tagname[index] - 1
		
		//Example - .//span[text()='Languages:']/following::a
		//Example - .//span[text()='Languages:']/following::a[1]
		
/*******************************************************************************************************/		
		
		//preceding
		
		//Syntax  -  .//tagname[@attribute='value']/preceding::tagname
		//Syntax  -  .//tagname[@attribute='value']/preceding::tagname[index] - 1
				
		//Example - .//span[text()='Languages:']/preceding::a
		//Example - .//span[text()='Languages:']/preceding::a[1]
		
/*********************************************************************************************************/
		
	// ancestor/ child, following sibling , preceding sibling , descendant
		
		
   //ancestor
		//Syntax  - .//tagname[@attribute='value']/ancestor::tagname
		//Example - .//input[@name='q']/ancestor::div
		
	//	child
		//Syntax  - .//tagname[@attribute='value']/child::tagname
		//Example - .//ul[@id='news_interest_title']/child::li
		//Example - .//ul[@id='news_interest_title']/child::li[2]
		
	// following siblings
		//Syntax  - .//tagname[@attribute='value']/following-sibling::tagname
		//Example - .//li[@id='local']/following-sibling::li
		//Example - .//li[@id='local']/following-sibling::li[2]
		
   // preceding sibling
		//Syntax  - .//tagname[@attribute='value']/preceding-sibling::tagname
		//Example - .//li[@id='esports']/preceding-sibling::li
		//Example - .//li[@id='esports']/preceding-sibling::li[2]
		
  // Descendants 		
		//Syntax  - .//tagname[@attribute='value']/descendant::tagname
		//Example - .//div[@class='overflow_container']/descendant::li
		//Example - .//li[@class='overflow_container']/descendant::li[2]
		
/**********************************************************************************************************/
		//chained locators:
		//syntax  : .//tagname[@attrib1='value1']/tagname[@attrib2='value2']/tagname[@attrib3='value3']
		//Example : .//div[@class='overflow_container']/div[@class='submenu']/ul[@class='overflow_menu']
		
		
		
		
		
		
	}

}
