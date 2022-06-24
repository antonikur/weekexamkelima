package com.nexsoft.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OneListPom {
	public AndroidDriver driver;
	
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddList")
	public WebElement btnAddList;

	@AndroidFindBy(id = "com.lolo.io.onelist:id/addItemEditText")
	public WebElement fieldAdd;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validate")
	public WebElement btnFieldAddCentang;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddComment")
	public WebElement btnArrowComment;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/addCommentEditText")
	public WebElement fieldComment;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonClearComment")
	public WebElement btnFieldCommentClear;
	
	
	//pop up new list
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	public WebElement fieldListName;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelEditList")
	public WebElement btnNewListCancel;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEditList")
	public WebElement btnNewListCentang;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/moreOptionsCursor")
	public WebElement btnMoreOption;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listImportButton")
	public WebElement btnMoreOptionImport;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listStorageButton")
	public WebElement btnMoreOptionAppPrivateStorage;
	
	//pop up when click import
	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_message")
	public WebElement msgPopUpMessageImport;
	//text contain:
	//Allow 1List to access photos and media on your device?
	
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listPathTitle")
	public WebElement msgPopUpMessageAppPrivateStorage;
	//text contain:
	//Change list storage folder
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/textView']")
	public List<WebElement> arrayOfList;
	
	
	//arrow to show comment in add
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Expand Item']")
	public List<WebElement> listBtnShowAddComment;
	
	//list of add created in list
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/text']")
	public List<WebElement> listOfAddCreated;
	
	//pop up edit list name
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonEditList")
	public WebElement btnEditList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonRemoveList")
	public WebElement btnDeleteList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	public WebElement fieldEditTitleList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEditList")
	public WebElement btnEditListCentang;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelEditList")
	public WebElement btnEditListSilang;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/moreOptionsCursor")
	public WebElement btnEditListMoreOption;
	
	//edit add pop up
	@AndroidFindBy(id = "com.lolo.io.onelist:id/item_title")
	public WebElement fieldEditAddName;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/item_comment")
	public WebElement fieldEditCommentName;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEdit")
	public WebElement btnCentangEditAdd;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelEdit")
	public WebElement btnSilangEditAdd;
	
	//pop up confirm delete list
	@AndroidFindBy(id = "com.lolo.io.onelist:id/clearList")
	public WebElement btnJustClearList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelDeleteList")
	public WebElement btnSilangConfirmDelete;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateDeleteList")
	public WebElement btnCentangConfirmDelete;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/deleteListText")
	public WebElement msgDeleteListConfirmation;
	
	
	public OneListPom(AndroidDriver driver){
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void clickListOnTitleContain(String title) {
		for(WebElement element : arrayOfList) {
			if(element.getText().contains(title)) {
				element.click();
				break;
			}
		}
	}
	
	public void clickAndHoldListOnTitleContain(String title) {
		for(WebElement element : arrayOfList) {
			if(element.getText().contains(title)) {
				touchHoldAndRelease(element);
				break;
			}
		}
	}
	
	public void clickAddInIndex(int index) {
		int currentIndex = 1;
		for(WebElement element: listOfAddCreated) {
			if(currentIndex == index) {
				element.click();
			}
			currentIndex++;
		}
		
	}
	
	public void swipeFirstAdd() {
		
	}
	
	public void touchHoldAndRelease(WebElement element) {
		Actions action = new Actions(driver);
		action.clickAndHold(element).perform();
		
	}
	
}
