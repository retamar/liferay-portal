/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.dbupgrade.sampledata523.expando.webcontent;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddPortletWCDTest extends BaseTestCase {
	public void testAddPortletWCD() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/expando-web-content-community/");
		selenium.clickAt("link=Web Content Display Page",
			RuntimeVariables.replace("Web Content Display Page"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isPartialText("//h2[@class='user-greeting']/span",
				"Welcome"));
		selenium.mouseOver("//h2[@class='user-greeting']/span");
		selenium.clickAt("//h2[@class='user-greeting']/span",
			RuntimeVariables.replace("Welcome"));
		selenium.waitForVisible("link=Add Application");
		selenium.clickAt("link=Add Application",
			RuntimeVariables.replace("Add Application"));
		selenium.waitForVisible("//input[@id='layout_configuration_content']");
		selenium.sendKeys("//input[@id='layout_configuration_content']",
			RuntimeVariables.replace("w"));
		selenium.waitForVisible("//div[@title='Web Content Display']/p/a");
		selenium.clickAt("//div[@title='Web Content Display']/p/a",
			RuntimeVariables.replace("Add"));
		selenium.waitForElementPresent("//td[1]/div/div[1]/div");
		assertTrue(selenium.isElementPresent("//td[1]/div/div[1]/div"));
	}
}