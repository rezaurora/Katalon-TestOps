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

WebUI.click(findTestObject('Admin/Menu SideBar Admin Object/a_Create Account Employee'))

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_fullName'), fullName_)

if (statusHiring_ == 'Bootcamp') {
    WebUI.click(findTestObject('Admin/Create Account (Menu Admin)/input_hiredStatus'), FailureHandling.STOP_ON_FAILURE)
} else if (statusHiring_ == 'Prohire') {
    WebUI.click(findTestObject('Admin/Create Account (Menu Admin)/input_hiredStatus_1'))
}

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_email'), email_)

if (gender_ == 'Male') {
    WebUI.click(findTestObject('Admin/Create Account (Menu Admin)/input_gender_male'))
} else if (gender_ == 'Female') {
    WebUI.click(findTestObject('Admin/Create Account (Menu Admin)/input_female'))
}

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_Start Contract_start'), startContract_)

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_End Contract_end'), endContract_)

WebUI.setText(findTestObject('Admin/Create Account (Menu Admin)/input_Join Date_join'), joinDate_)

WebUI.click(findTestObject('Admin/Create Account (Menu Admin)/button_Submit'))

