package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {

	Pojo lp;
	SearchHotel sh;

	@BeforeClass
	private void browserLaunch() {
		getdriver("chromedriver");
		launchUrl("https://adactinhotelapp.com/");
	}

	@Parameters({ "username", "password" })
	@Test
	private void tc0(String s, String s1) {
		lp = new Pojo();
		enterText(lp.getTxtuser(), s);
		enterText(lp.getTxtpass(), s1);
		btnClick(lp.getBtnlogin());

	}

	@Test
	private void tc1() {
		sh = new SearchHotel();
		selectText(sh.getLocation(), "Melbourne");
		selectValue(sh.getHotel(), "Hotel Sunshine");
		selectIndex(sh.getRoom(), 2);
		selectIndex(sh.getRoomnos(), 4);
		selectValue(sh.getAdult(), "2");
		selectText(sh.getChild(), "2 - Two");
		enterText(sh.getDatein(), "10/12/2021");
		enterText(sh.getDateout(), "12/12/2021");
		btnClick(sh.getSubmit());

	}

	@Test
	private void tc2() {
		NextPage np = new NextPage();
		btnClick(np.getRadio());
		btnClick(np.getNextpage());

	}

	@Parameters({ "firstname", "lastname", "address", "cardnumber", "cardtype", "expmonth", "expyear", "ccv" })
	@Test
	private void tc3(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7)
			throws InterruptedException {
		BookHotel bh = new BookHotel();
		enterText(bh.getFirstname(), s);
		enterText(bh.getLastname(), s1);
		enterText(bh.getAddress(), s2);
		enterText(bh.getCardno(), s3);
		selectText(bh.getCardtype(), "VISA");
		selectValue(bh.getExpmonth(), "3");
		selectValue(bh.getExpyear(), "2021");
		enterText(bh.getCcv(), s7);
		btnClick(bh.getBook());

		Thread.sleep(7000);

	}

}
