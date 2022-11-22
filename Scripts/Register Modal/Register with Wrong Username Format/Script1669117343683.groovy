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

WebUI.callTestCase(findTestCase('Register Modal/Access Register Modal'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Landing Page/Register Modal/div_Register'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Landing Page/Register Modal/input_Email_email'), 'faldiat' + RandomStringUtils.randomNumeric(
        3))

WebUI.sendKeys(findTestObject('Landing Page/Register Modal/input_Email_email'), '@getnada.com')

WebUI.setText(findTestObject('Landing Page/Register Modal/input_Full name_fullName'), 'Faldi AT')

WebUI.setText(findTestObject('Landing Page/Register Modal/input_Username_userName'), 'Fa')

WebUI.setText(findTestObject('Landing Page/Register Modal/input_Password_password'), GlobalVariable.testingpass)

WebUI.setText(findTestObject('Landing Page/Register Modal/input_Re-type Password_confirmPassword'), GlobalVariable.testingpass)

WebUI.click(findTestObject('Landing Page/Register Modal/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Landing Page/Register Modal/input_Username_userName'), 'Falditest1234045968745908674056')

WebUI.click(findTestObject('Landing Page/Register Modal/button_Sign Up'), FailureHandling.STOP_ON_FAILURE)

