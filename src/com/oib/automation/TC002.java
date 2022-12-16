package com.oib.automation;

import org.testng.annotations.Test;

import com.oib.lib.General;

public class TC002 {

	//public static void main(String[] args) throws Exception {
		@Test
		public void tc002()throws Exception{
		General obj = new General();
	    obj.openApplication();
	    obj.login1();
	    obj.mouseoverAndClick();
	    obj.logout();
	    obj.closeApplication();
	}

}
