package com.test

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import org.openqa.selenium.interactions.Action
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.WebDriver
import java.time.Duration
import internal.GlobalVariable

public class DnD {

	@Keyword
	def dragdrop(TestObject to,TestObject destination,Integer intX,Integer intY) {

		def eleto = WebUiCommonHelper.findWebElement(to, 30)

		def eledest = WebUiCommonHelper.findWebElement(destination, 30)

		WebDriver driver = DriverFactory.getWebDriver()

		Actions build = new Actions(driver)

				.moveToElement(eleto)

				.pause(Duration.ofSeconds(3))

				.clickAndHold(eleto)

				.moveByOffset(1, 0)

				.moveToElement(eledest,intX,intY)

				//.moveByOffset(40, 0)

				.pause(Duration.ofSeconds(5))

				.release().perform()

	}
}

