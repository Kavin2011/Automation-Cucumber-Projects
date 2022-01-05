package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Addcart_Page;
import com.pom.Bankwire_Page;
import com.pom.Confirmorder_Page;
import com.pom.Home_Page;
import com.pom.More_Page;
import com.pom.Proceed_Page1;
import com.pom.Proceed_Page2;
import com.pom.Select_Page;
import com.pom.Signout_Page;
import com.pom.Terms_Page;
import com.pom.Textarea_Page;

public class Page_Object_Manager {
	
	public Page_Object_Manager(WebDriver driver2) {
		
		this.driver= driver2;
	}

	public WebDriver driver; //null
	
	private Home_Page hp;
	private Select_Page sel;
	private More_Page mp;
	private Addcart_Page ap;
	private Proceed_Page1 pp1;
	private Proceed_Page2 pp2;
	private Textarea_Page txp;
	private Terms_Page tp;
	private Bankwire_Page bp;
	private Confirmorder_Page cp;
	private Signout_Page sp;

	public Home_Page getInstanceHp() {
	
	if (hp==null)  {
		
		hp= new Home_Page(driver);
	}
	return hp;
	
	}
	
	public Select_Page getInstancesel() {
		
	if (sel==null)  {
		
		sel= new Select_Page(driver);
	}
	return sel;
	}
	
	public More_Page getInstancemp() {
		
	if (mp==null)  {
		
		mp= new More_Page(driver);
	}
	return mp;	
	}	
	
	public Addcart_Page getInstanceap() {
	
	if (ap==null)  {
	
	ap= new Addcart_Page(driver);
	}
	return ap;	
	}	
	
	public Proceed_Page1 getInstancepp1() {
	
	if (pp1==null)  {
	
	pp1= new Proceed_Page1(driver);
	}
	return pp1;
	}

	public Proceed_Page2 getInstancepp2() {
	
		if (pp2==null)  {
	
	pp2= new Proceed_Page2(driver);
		}
		return pp2;
	}

	public Textarea_Page getInstancetxp() {
	
		if (txp==null)  {
	
	txp= new Textarea_Page(driver);
		}
		return txp;
	}
	public Terms_Page getInstancetp() {
	
		if (tp==null)  {
	
	tp= new Terms_Page(driver);
		}
		return tp;
	}
	   public Bankwire_Page getInstancebp() {
			
		if (bp==null)  {
	
	   bp= new Bankwire_Page(driver);
    }
	return bp;
	   }

	   public Confirmorder_Page getInstancecp() {
			
		if (cp==null)  {
	
	   cp= new Confirmorder_Page(driver);
       }
	return cp;
    }

	   public Signout_Page getInstancesp() {
			
		if (sp==null)  {
	
	   sp= new Signout_Page(driver);
       }
	return sp;
    }	 
}  