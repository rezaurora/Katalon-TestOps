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

WebUI.callTestCase(findTestCase('Admin/Page/Short List Canidate/AddNew_Candidate'), [
		fullName:fullName,
		position:position,
		skillSet:skillSet,
		education:education,
		university:university,
		domisili:domisili,	
		birthDate: birthDate,	
		level:level,	
		experience: experience,	
		filteringBy: filteringBy,	
		workStatus: workStatus,	
		noticePeriod: noticePeriod,	
		financialIndustry: financialIndustry,
		rawCv:rawCv,	
		bercaCv:bercaCv,	
		englishLevel: englishLevel,	
		currentSalary: currentSalary,
		expectedSalary: expectedSalary,	
		negotiable : negotiable
		//interviewByRas	interviewDateByRas	interviewByUser	nameOfUser	interviewDateByUser	levelRecomend	status	notes
		
		], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/ShortListCandidate/New/alert_AddSortlistCandidate'), 'Data has been added!')

WebUI.delay(1)

WebUI.takeScreenshot('E:/Web-Test/CaptureTest/Success_Add_Shortlist.png')

