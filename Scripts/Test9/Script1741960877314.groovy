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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://adactinhotelapp.com/')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://adactinhotelapp.com/')

WebUI.setText(findTestObject('Object Repository/Test9/Page_Adactin.com - Hotel Reservation System/input_Username_username'), 
    'jayasrimannava')

WebUI.setEncryptedText(findTestObject('Object Repository/Test9/Page_Adactin.com - Hotel Reservation System/input_Password_password'), 
    'AsGU5CZax2E=')

WebUI.click(findTestObject('Object Repository/Test9/Page_Adactin.com - Hotel Reservation System/input_Forgot Password_login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Test9/Page_Adactin.com - Search Hotel/select_- Select Location -            Sydne_fd1b90'), 
    'Sydney', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test9/Page_Adactin.com - Search Hotel/select_- Select Hotel -            Hotel Cr_5dfd37'), 
    'Hotel Creek', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Test9/Page_Adactin.com - Search Hotel/select_- Select Room Type -            Stan_432a48'), 
    'Deluxe', true)

WebUI.click(findTestObject('Object Repository/Test9/Page_Adactin.com - Search Hotel/input_Children per Room_Submit'))

WebUI.click(findTestObject('Object Repository/Test9/Page_Adactin.com - Select Hotel/input_Total Price (excl. GST)_cancel'))

WebUI.closeBrowser()

