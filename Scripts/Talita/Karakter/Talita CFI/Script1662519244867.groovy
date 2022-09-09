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

WebUI.click(findTestObject('Talita Structure/2 Page Rangkaian Test/Career Adaptabilities'))

WebUI.click(findTestObject('Talita Structure/3 Page Aturan Simulasi CPA/Button Coba Contoh Soal CFI'))

WebUI.click(findTestObject('Talita Structure/90 Page Simulasi CFI/1 Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/90 Page Simulasi CFI/2 Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/90 Page Simulasi CFI/Button Lanjutkan Simulasi'))

WebUI.comment('Section 1')

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 1/Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 1/Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 1/Agak Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 1/Agak Tidak Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 1/Tidak Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Button Next CFI'))

WebUI.comment('Section 2')

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 2/1 Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 2/2 Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 2/3 Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 2/4 Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 2/5 Sangat Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Button Next CFI'))

WebUI.comment('Section 3')

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 3/1 Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 3/2 Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 3/3 Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 3/4 Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 3/5 Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Button Next CFI'))

WebUI.comment('Section 4')

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 4/1 Tidak Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 4/2 Tidak Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 4/3 Tidak Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Section 4/4 Tidak Sesuai'))

WebUI.click(findTestObject('Talita Structure/91 CFI/Button Finish CFI'))

WebUI.click(findTestObject('Talita Structure/1 Page Dashboard/Button Dashboard'))

