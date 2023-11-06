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

WebUI.callTestCase(findTestCase('Admin/Admin_Login Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Admin/Menu SideBar Admin Object/a_Create Account Employee'))

WebUI.setText(findTestObject('Object Repository/Admin/Create Account (Menu Admin)/input_fullName'), 'Achmad Fauzi')

WebUI.click(findTestObject('Object Repository/Admin/Create Account (Menu Admin)/input_hiredStatus'))

WebUI.setText(findTestObject('Object Repository/Admin/Create Account (Menu Admin)/input_email'), 'dharu.jiwopambudi@berca.co.id')

WebUI.click(findTestObject('Object Repository/Admin/Create Account (Menu Admin)/input_gender'))

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_Start Contract_start'), '10042023')

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_End Contract_end'), '10042025')

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_Join Date_join'), '10042023')

WebUI.click(findTestObject('Admin/Create Account (Menu Admin)/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Create Account (Menu Admin)/button_OK_Alert'))

WebUI.delay(1.5)

WebUI.verifyElementText(findTestObject('Admin/Create Account (Menu Admin)/Alert_Email_Sent'), 'Email Has ben sent')

