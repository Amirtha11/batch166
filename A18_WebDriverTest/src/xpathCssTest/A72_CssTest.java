package xpathCssTest;

public class A72_CssTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// class name - .
		// id 	      - #
		
		// #sb_form_q
		// .sbipane
		
/***********************************************************************************************/
		// relative path - .//tagname[attribute='value']
		// css           - tagname[attribute='value']
		// example       - input[id='sb_form_q']
		
/**********************************************************************************************/
		// contains - * , starts with - ^, ends with - $
		
		//contains
		//syntax   -  tagname[attribute*='value']
		//example  -  input[id*='sb_form_q']    -true
		//example   -  input[id*='sb_form_']     -true
		//example   -  input[id*='b_form_q']     -true
		//example   -  input[id*='sb_f_q']       -false
		//example   -  input[id*='b_form_']      -true
 
		// starts with 
		//Syntax    -  tagname[attribute^='value']
		//example   -  input[id^='sb_form_q']      -true
		//example   -  input[id^='sb_form_']       -true
		//example   -  input[id^='b_form_q']       -false
		//example   -  input[id^='sb_f_q']         -false
		//example   -  input[id^='b_form_']        -false
		
		// ends with
		//Syntax    -  tagname[attribute$='value']
		//example   -  input[id$='sb_form_q']      -true
		//example   -  input[id$='sb_form_']       -false
		//example   -  input[id$='b_form_q']       -true
		//example   -  input[id$='sb_f_q']         -false
		//example   -  input[id$='b_form_']        -false
		
/**************************************************************************************************/
		// AND or OR operator
		
		// AND syntax - tagname[attribute1='value1'][attribute2='value2']
		// AND example - input[id='sb_form_q'][name='q']   -- true
		// AND example - input[id='sb_form_q'][name='a']   -- false
		
		// OR syntax - tagname[attribute1='value1'],[attribute2='value2']
		// OR example - input[id='sb_form_q'],[name='q'] ---  true
		// OR example - input[id='sb_form_q'],[name='a'] ---  true
		
/*****************************************************************************************************/
		// types - first-of-type, last-of-type, nth-of-type, nth-child
		
		//first-of-type syntax  - tagname[attribute='value']>tagname:first-of-type
		//first-of-type example - ul[class='share']>li:first-of-type
		
		//last-of-type syntax  - tagname[attribute='value']>tagname:last-of-type
		//last-of-type example - ul[class='share']>li:last-of-type
		
	    //nth-of-type syntax  - tagname[attribute='value']>tagname:nth-of-type(index) -1
		//nth-of-type example - ul[class='share']>li:nth-of-type(1) -1
		
		//nth-child syntax  - tagname[attribute='value']>tagname:nth-child(index) -1
		//nth-child example - ul[class='share']>li:nth-child(1) -1

/************************************************************************************************************/
		// chained locator
		
		// syntax - tagname[attribute3='value3']>[attribute2='value2']>[attribute1='value1']
		// example - div[class='overflow_container']>[class='submenu']>[class='overflow_menu']
		
/***********************************************************************************************************/
		
		// operator +
		
		// operator syntax - tagname[atribute1='value']>tagname:nth-child(index)+tagname
		// operator example - div[class='submenu']>class='overflow_menu']>li:nth-child(1)+li

	}

}
