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

'Dinamis button ID menyesuaikan id sesuai dengan Id Employee'
WebUI.click(findTestObject('Admin/Manage Resource/Turn Over/button_TurnOver_ById'))

WebUI.click(findTestObject('Admin/Manage Resource/Turn Over/selectStatus_Transfer'))

WebUI.click(findTestObject('Admin/Manage Resource/Turn Over/selectDepartment_ResourceApplicationService'))

WebUI.setText(findTestObject('Admin/Manage Resource/Turn Over/inputDate'), '03112023')

WebUI.setText(findTestObject('Admin/Manage Resource/Turn Over/inputDescription'), 'Loremipsum')

WebUI.click(findTestObject('Admin/Manage Resource/button_Update'))

WebUI.verifyElementText(findTestObject('Admin/Manage Resource/Turn Over/alertSuccess_TurnOver'), 'Turn Over Status has Updated')

WebUI.delay(1)

WebUI.takeScreenshot('E:/Web-Test/CaptureTest/Success_TurnOver.png')

