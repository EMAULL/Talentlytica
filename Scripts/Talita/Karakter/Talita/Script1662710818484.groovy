import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Alert as Alert
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import java.awt.AWTException as AWTException
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import org.openqa.selenium.By as By

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stagingintegro.assessmentcenter.id/login/login-token?token=Tktvd3hwWmhMVTcvZHBXV0tabTVVZlE2MzN2ZFN3aWorTWZvU3pBUis5RT0=')

WebDriver driver = DriverFactory.getWebDriver()

Robot robot = new Robot()

// Creates the delay of 5 sec so that you can open notepad before
// Robot start writting
robot.delay(5000)

robot.keyPress(KeyEvent.VK_TAB)

robot.keyPress(KeyEvent.VK_ENTER)

WebUI.click(findTestObject('Talita Structure/1 Page Dashboard/Button Mulai Dashboard'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Talita Structure/1 Page Dashboard/Button Lanjutkan Dashboard'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Talita/Karakter/Form Identitas'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tata Tertib/CheckBox Tata Tertib Test'))

WebUI.click(findTestObject('Tata Tertib/Button Lanjutkan'))

WebUI.callTestCase(findTestCase('Talita/Karakter/Talita CPA'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Talita/Karakter/Talita CPB'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Talita/Karakter/Talita CFI'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Talita/Karakter/Talita CR'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Feedback/Bintang 5'))

WebUI.setText(findTestObject('Feedback/Textarea Feedback'), 'Mantapp')

WebUI.click(findTestObject('Feedback/Button Submit'))

WebUI.verifyElementVisible(findTestObject(null))

WebUI.closeBrowser()

