/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portalweb.portal.controlpanel.webcontent.wcstructure.addwcstructure;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddWCStructure3Test extends BaseTestCase {
	public void testAddWCStructure3() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.clickAt("//div[@id='dockbar']",
			RuntimeVariables.replace("Dockbar"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Web Content",
			RuntimeVariables.replace("Web Content"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Manage"),
			selenium.getText("//span[@title='Manage']/ul/li/strong/a"));
		selenium.clickAt("//span[@title='Manage']/ul/li/strong/a",
			RuntimeVariables.replace("Manage"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]");
		assertEquals(RuntimeVariables.replace("Structures"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]"));
		selenium.clickAt("//div[@class='lfr-component lfr-menu-list']/ul/li/a[contains(.,'Structures')]",
			RuntimeVariables.replace("Structures"));
		selenium.waitForVisible("//iframe[contains(@src,'Structures')]");
		selenium.selectFrame("//iframe[contains(@src,'Structures')]");
		selenium.waitForElementPresent(
			"//script[contains(@src,'/liferay/store.js')]");
		assertEquals(RuntimeVariables.replace("Add"),
			selenium.getText(
				"//span[@class='lfr-toolbar-button add-button ']/a"));
		selenium.clickAt("//span[@class='lfr-toolbar-button add-button ']/a",
			RuntimeVariables.replace("Add"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//input[@id='_166_name_en_US']");
		selenium.type("//input[@id='_166_name_en_US']",
			RuntimeVariables.replace("WC Structure3 Name"));
		selenium.type("//textarea[@id='_166_description_en_US']",
			RuntimeVariables.replace("WC Structure3 Description"));
		selenium.waitForVisible(
			"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Boolean\"]/span");
		assertEquals(RuntimeVariables.replace("Boolean"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Boolean\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Boolean\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Date"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Date\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Date\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Decimal"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Decimal\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Decimal\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Documents and Media"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Documents and Media\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Documents and Media\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("File Upload"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"File Upload\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"File Upload\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("HTML"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"HTML\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"HTML\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Image"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Image\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Image\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Integer"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Integer\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Integer\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Link to Page"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Link to Page\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Link to Page\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Number"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Number\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Number\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Radio"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Radio\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Radio\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Select"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Select\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Select\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Text"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Text\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Text\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		assertEquals(RuntimeVariables.replace("Text Box"),
			selenium.getText(
				"//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Text Box\"]/div"));
		selenium.dragAndDropToObject("//div[@class='aui-tabview-content aui-widget-bd']/div/ul/li[@title=\"Text Box\"]/div",
			"//div[@class='aui-tabview-content aui-widget-bd']");
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		selenium.waitForVisible("//div[@class='portlet-msg-success']");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals(RuntimeVariables.replace("WC Structure3 Name"),
			selenium.getText("//tr[contains(.,'WC Structure3 Name')]/td[3]/a"));
		selenium.selectFrame("relative=top");
	}
}