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

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_RAS Management/span_Super_Admin'))

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_RAS Management/a_Change Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_RAS Management/inputcurrentPassword'), '7326p5kcqg2t3B5OULMPNQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_RAS Management/input_newPassword'), '7326p5kcqg2t3B5OULMPNQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/ChangePassword/Page_RAS Management/input_repeatPassword'), '7326p5kcqg2t3B5OULMPNQ==')

WebUI.click(findTestObject('Object Repository/ChangePassword/Page_RAS Management/button_Save changes'))

WebUI.delay(2)

