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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Menu SideBar Admin Object/a_Shortlist Candidate'))

WebUI.delay(2)

WebUI.takeElementScreenshot('E:/Web-Test/CaptureTest/Filter_All_Shortlist.png', findTestObject('Admin/ShortListCandidate/Table/All'))

WebUI.click(findTestObject('Admin/ShortListCandidate/Table/Fullstack_Filter'))

WebUI.delay(2)

WebUI.takeElementScreenshot('E:/Web-Test/CaptureTest/Filter_FullStack_Shortlist.png', findTestObject('Admin/ShortListCandidate/Table/All'))

WebUI.click(findTestObject('Admin/ShortListCandidate/Table/FrontEnd_Filter'))

WebUI.delay(2)

WebUI.takeElementScreenshot('E:/Web-Test/CaptureTest/Filter_FrontEnd_Shortlist.png', findTestObject('Admin/ShortListCandidate/Table/All'))

WebUI.click(findTestObject('Admin/ShortListCandidate/Table/Backend_Filter'))

WebUI.delay(2)

WebUI.takeElementScreenshot('E:/Web-Test/CaptureTest/Filter_BackEnd_Shortlist.png', findTestObject('Admin/ShortListCandidate/Table/All'))

WebUI.click(findTestObject('Admin/ShortListCandidate/Table/DataScience_Filter'))

WebUI.delay(2)

WebUI.takeElementScreenshot('E:/Web-Test/CaptureTest/Filter_DataScience_Shortlist.png', findTestObject('Admin/ShortListCandidate/Table/All'))

