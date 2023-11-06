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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Manage Resource/a_Detail'))

WebUI.click(findTestObject('Admin/Manage Resource/Placement/button_New Placement'))

WebUI.setText(findTestObject('Admin/Manage Resource/input_Company Name_companyName'), 'Berca Hardayaperkasa')

WebUI.setText(findTestObject('Admin/Manage Resource/Placement/input_Job Role_jobRole'), 'Fullstack Developer')

WebUI.setText(findTestObject('Admin/Manage Resource/Placement/input_Start Date_startDate'), '10112023')

WebUI.setText(findTestObject('Admin/Manage Resource/textarea_Description_description'), 'Loremipsum')

WebUI.click(findTestObject('Admin/Manage Resource/input_Status_status'))

WebUI.click(findTestObject('Admin/Manage Resource/Placement/button_Save'))

WebUI.delay(1)

WebUI.takeScreenshot('E:/Web-Test/CaptureTest/Success_New_Placement.png')

