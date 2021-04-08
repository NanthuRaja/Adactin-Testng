package org.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextPage extends BaseClass{
	public NextPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	
	@FindBy(id="continue")
	private WebElement nextpage;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getNextpage() {
		return nextpage;
	}

}
