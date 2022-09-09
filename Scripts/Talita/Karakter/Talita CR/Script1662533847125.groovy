import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
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

WebUI.click(findTestObject('Talita Structure/2 Page Rangkaian Test/Career Roles'))

WebUI.click(findTestObject('Talita Structure/3 Page Aturan Simulasi CPA/Button Coba contoh soal CR'))

WebUI.click(findTestObject('Talita Structure/92 Page Simulation CR/Berkesempatan untuk mengungkapkan peluang yang dapat menguntungkan perusahaan'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/92 Page Simulation CR/Berkesempatan untuk mengungkapkan peluang yang dapat menguntungkan perusahaan'), 
    findTestObject('Talita Structure/92 Page Simulation CR/Orang lain mengandalkan keahlian dan keterampilan yang saya miliki'))

WebUI.click(findTestObject('Talita Structure/92 Page Simulation CR/Button Simulasi CR'))

WebUI.comment('Section 1')

WebUI.click(findTestObject('Talita Structure/93 CR/Seorang pengusaha'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/93 CR/Seorang pengusaha'), findTestObject('Talita Structure/93 CR/Pimpinan divisi atau departemen'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Talita Structure/93 CR/Button Next CR'))

WebUI.comment('Section 2')

WebUI.click(findTestObject('Talita Structure/93 CR/Seorang pengusaha'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/93 CR/Seorang pengusaha'), findTestObject('Talita Structure/93 CR/Pimpinan divisi atau departemen'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Talita Structure/93 CR/Button Next CR'))

WebUI.comment('Section 3')

WebUI.click(findTestObject('Talita Structure/93 CR/Seorang pengusaha'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/93 CR/Seorang pengusaha'), findTestObject('Talita Structure/93 CR/Pimpinan divisi atau departemen'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Talita Structure/93 CR/Button Next CR'))

WebUI.comment('Section 4')

WebUI.click(findTestObject('Talita Structure/93 CR/Seorang pengusaha'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/93 CR/Seorang pengusaha'), findTestObject('Talita Structure/93 CR/Pimpinan divisi atau departemen'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Talita Structure/93 CR/Button Next CR'))

WebUI.comment('Section 5')

WebUI.click(findTestObject('Talita Structure/93 CR/Seorang pengusaha'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/93 CR/Seorang pengusaha'), findTestObject('Talita Structure/93 CR/Pimpinan divisi atau departemen'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Talita Structure/93 CR/Button Next CR'))

WebUI.comment('Section 6')

WebUI.click(findTestObject('Talita Structure/93 CR/Seorang pengusaha'))

WebUI.dragAndDropToObject(findTestObject('Talita Structure/93 CR/Seorang pengusaha'), findTestObject('Talita Structure/93 CR/Pimpinan divisi atau departemen'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Talita Structure/93 CR/Button Finish CR'))

WebUI.click(findTestObject('Talita Structure/1 Page Dashboard/Button Dashboard'))

