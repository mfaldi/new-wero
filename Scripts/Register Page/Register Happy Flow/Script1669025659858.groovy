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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.callTestCase(findTestCase('Register Page/Access Register Page'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Register Page/div_Sign up'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register Page/input_Email_email'), 'faldiat' + RandomStringUtils.randomNumeric(3))

WebUI.sendKeys(findTestObject('Register Page/input_Email_email'), '@getnada.com')

WebUI.setText(findTestObject('Register Page/input_Full Name_ordernumber'), 'Faldi AT')

WebUI.setText(findTestObject('Register Page/input_Username_username'), 'FaldiAT' + RandomStringUtils.randomNumeric(3))

WebUI.setText(findTestObject('Register Page/input_Password_password'), GlobalVariable.testingpass)

WebUI.setText(findTestObject('Register Page/input_Password_repassword'), GlobalVariable.testingpass)

WebUI.click(findTestObject('Register Page/button_Sign up'), FailureHandling.STOP_ON_FAILURE)
