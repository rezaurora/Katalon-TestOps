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

'Button contain ID Employee, if Id not found change id in object button detail'
WebUI.click(findTestObject('Admin/Manage Resource/a_Detail'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Manage Resource/Contract/button_Update Contract'))

WebUI.setText(findTestObject('Admin/Manage Resource/Contract/input_Start Contract_StartContract'), '01112023')

WebUI.setText(findTestObject('Admin/Manage Resource/Contract/input_Job Role_EndContract'), '01112025')

WebUI.click(findTestObject('Admin/Manage Resource/Contract/button_Update'))

WebUI.delay(0.5)

WebUI.takeScreenshot('E:/Web-Test/CaptureTest/Success_Update_Contract.png')

