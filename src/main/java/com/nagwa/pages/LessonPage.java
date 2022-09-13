package com.nagwa.pages;

import com.nagwa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LessonPage extends Base {

    public LessonPage (){PageFactory.initElements(driver,this);}

    @FindBy(className = "question-preview")
    WebElement workSheetSection;

    public WorksheetPage clickOnWorkSheetSection(){
        workSheetSection.click();
        return new WorksheetPage();
    }


}
