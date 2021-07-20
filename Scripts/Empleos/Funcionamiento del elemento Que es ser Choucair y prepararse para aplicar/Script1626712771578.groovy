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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.callTestCase(findTestCase('Empleos/Funcionamiento del Navigator'), [('result') : ''], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Choucair Testing/img_Search Button_elementor-animation-grow'))

WebUI.scrollToElement(findTestObject('Page_Choucair Testing/img_Qu es ser Choucair_elementor-animation-grow'), 
    3600)

WebUI.waitForElementPresent(findTestObject('Page_Choucair Testing/img_Qu es ser Choucair_elementor-animation-grow'), 
    3600)

WebUI.click(findTestObject('Page_Choucair Testing/a_Prepararse para aplicar'))

