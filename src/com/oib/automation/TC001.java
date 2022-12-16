package com.oib.automation;

import org.testng.annotations.Test;

import com.oib.lib.General;

public class TC001
{

	//public static void main(String[] args) throws Exception {
	@Test	
	public void tc001() throws Exception{
		// Test Steps
		General obj = new General();
		    obj.openApplication();
		    obj.waitStmt();
		    obj.login1();
		    obj.waitStmt();
		   // obj.mouseoverAndClick();
		    obj.waitStmt();
		    obj.logout();
		    obj.closeApplication();
		   
		   
	}

}
