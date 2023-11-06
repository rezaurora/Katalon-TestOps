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

WebUI.click(findTestObject('Admin/Menu SideBar Admin Object/a_Shortlist Candidate'))

WebUI.click(findTestObject('Admin/ShortListCandidate/New/buttonAdd_New'))

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_FullName'), fullName)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_Position'), position)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_SkillSet'), skillSet)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_Degree'), education)

WebUI.selectOptionByLabel(findTestObject('Admin/ShortListCandidate/New/select_University'), university, false)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_Domisili'), domisili)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_BirthDate'), birthDate)

WebUI.selectOptionByLabel(findTestObject('Admin/ShortListCandidate/New/select_Level'), level, false)

WebUI.selectOptionByLabel(findTestObject('Admin/ShortListCandidate/New/select_Experience'), experience, false)

WebUI.selectOptionByLabel(findTestObject('Admin/ShortListCandidate/New/select_Filtering'), filteringBy, false)

WebUI.check(findTestObject('Admin/ShortListCandidate/New/checkBox_WorkStatus'))

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_NoticePeriode'), noticePeriod)

//WebUI.uncheck(findTestObject('Admin/ShortListCandidate/New/checkBox_WorkStatus'))
WebUI.check(findTestObject('Admin/ShortListCandidate/New/checkBox_FinancialIndustry'))

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_RawCv'), rawCv)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_BercaCv'), bercaCv)

WebUI.selectOptionByLabel(findTestObject('Admin/ShortListCandidate/New/select_EnglishLevel'), englishLevel, false)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_CurrentSalary'), currentSalary)

WebUI.setText(findTestObject('Admin/ShortListCandidate/New/input_ExpectedSalary'), expectedSalary)

if (negotiable == "FALSE") {
    WebUI.click(findTestObject('Admin/ShortListCandidate/New/negotiable_No'))
} else if (negotiable=="TRUE") {
   
            WebUI.click(findTestObject('Admin/ShortListCandidate/New/negotiable_Yes'))
      
}else {
	WebUI.click(findTestObject('Admin/ShortListCandidate/New/negotiable_No'))
}

WebUI.click(findTestObject('Admin/ShortListCandidate/New/button_Save'))

