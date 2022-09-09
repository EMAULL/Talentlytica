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

WebUI.click(findTestObject('Talita Structure/2 Page Rangkaian Test/Career Perception A'))

WebUI.click(findTestObject('Talita Structure/3 Page Aturan Simulasi CPA/Button Coba Contoh Soal CPA'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/4 Page Simulation CPA/1 Saya menyukai pekerjaan yang melibatkan aktivitas fisik'), 
    findTestObject('Talita Structure/4 Page Simulation CPA/2 Banyak orang menganggap saya adalah orang yang selalu ingin tahu'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Talita Structure/4 Page Simulation CPA/Button Lanjutkan Simulasi CPA'))

WebUI.comment('Section 1')

WebUI.click(findTestObject('Talita Structure/7 CPA/Button Next CPA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Section 2')

WebUI.click(findTestObject('Talita Structure/7 CPA/Button Next CPA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Section 3')

WebUI.click(findTestObject('Talita Structure/7 CPA/Button Next CPA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Section 4')

WebUI.click(findTestObject('Talita Structure/7 CPA/Button Next CPA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Section 5')

WebUI.click(findTestObject('Talita Structure/7 CPA/Button Next CPA'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Section 6')

WebUI.click(findTestObject('Talita Structure/7 CPA/Button Next CPA'))

WebUI.comment('Section 7')

WebUI.click(findTestObject('Talita Structure/7 CPA/Button Finish CPA'))

WebUI.click(findTestObject('Talita Structure/1 Page Dashboard/Button Dashboard'))

