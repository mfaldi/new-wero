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

WebUI.openBrowser(GlobalVariable.devurl)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Cloudflare Access Login Page/a_Google  Wero by Wildcats'))

WebUI.setText(findTestObject('Google Login Page/input_Wildcats Cloudflare Access_identifier'), GlobalVariable.devemail)

WebUI.click(findTestObject('Google Login Page/span_Berikutnya_email'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Google Login Page/input_Terlalu sering gagal_password'), GlobalVariable.devpass)

WebUI.click(findTestObject('Google Login Page/span_Berikutnya'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Login Page/img_Log in_transition-all duration-200'), 0)

