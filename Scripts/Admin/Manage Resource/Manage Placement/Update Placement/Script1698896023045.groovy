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

WebUI.callTestCase(findTestCase('Admin/Manage Resource/Menu Manage Resource'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Manage Resource/a_Detail'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Manage Resource/Placement/Button_Edit_Placement'))

WebUI.setText(findTestObject('Admin/Manage Resource/input_Company Name_companyName'), 'Pertamina')

WebUI.setText(findTestObject('Admin/Manage Resource/Placement/input_End Date_endDate'), '10112024')

WebUI.click(findTestObject('Admin/Manage Resource/Placement/input_This field is required_status'))

WebUI.click(findTestObject('Admin/Manage Resource/button_Update'))

WebUI.delay(1.5)

WebUI.takeScreenshot('E:/Web-Test/CaptureTest/Success_Update_Placement.png')

