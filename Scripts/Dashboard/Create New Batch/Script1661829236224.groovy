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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stagingintegro.talentlytic.com/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Create Batch/Page_Sign In  Stagingintegro/input_Alamat Email_email'), 'staging9@master.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create Batch/Page_Sign In  Stagingintegro/input_Kata Sandi_password'), 
    'xiVpYvqkOJsHcfnlnuOibQ==')

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Sign In  Stagingintegro/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Beranda  Stagingintegro/button_Mengerti'))

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Beranda  Stagingintegro/span_Assignment'))

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Daftar Assignment  Stagingintegro/button_Batch Baru'))

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Daftar Assignment  Stagingintegro/a_Self Assessment (Default)'))

WebUI.setText(findTestObject('Object Repository/Create Batch/Page_Tambah Batch  Stagingintegro/input_Nama Batch_batchName'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Tambah Batch  Stagingintegro/span_Pilih Kelompok Test'))

WebUI.click(findTestObject('Create Batch/Page_Tambah Batch  Stagingintegro/li_PERSONA'))

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Tambah Batch  Stagingintegro/span_Zapier No Email'))

WebUI.click(findTestObject('Create Batch/Page_Tambah Batch  Stagingintegro/li_TEST ENDANG'))

WebUI.click(findTestObject('Object Repository/Create Batch/Page_Tambah Batch  Stagingintegro/a_Lanjutkan'))

