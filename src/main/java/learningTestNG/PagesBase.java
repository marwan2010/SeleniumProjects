 	package learningTestNG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PagesBase {

	protected WebDriver driver;
	public   Actions action;
    public static WebDriverWait wait;
    JavascriptExecutor js ;	
    

	
	public PagesBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action= new Actions(driver);
        wait = new WebDriverWait(driver,15);
        js=(JavascriptExecutor)driver;	
		
	}
	
	
	
	
	protected static void clickButton (WebElement button) {
		 wait.until(ExpectedConditions.visibilityOf(button));
	        
		button.click();
	}
	
	protected static void setTextElementText (WebElement textElement,String Value) {
		  wait.until(ExpectedConditions.visibilityOf(textElement));
		  textElement.clear();
		  textElement.sendKeys(Value);
}
	

	
	
	
	
	
	
	
	
    public void waitVisibility(WebElement elementBy) {
        wait.until(ExpectedConditions.visibilityOf(elementBy));
    }

    public static void Select_The_Checkbox(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        
    	try {
            if (element.isSelected()) {
               System.out.println("Checkbox: " + element + "is already selected");
            } else {
            	// Select the checkbox
                element.click();
            }
        } catch (Exception e) {
        	System.out.println("Unable to select the checkbox: " + element);
        }
     
        
    }
    
    
    
    
    public void DeSelect_The_Checkbox(WebElement element) {
		try {
            if (element.isSelected()) {
            	//De-select the checkbox
                element.click();
            } else {
            	System.out.println("Checkbox: "+element+"is already deselected");
            }
        } catch (Exception e) {
        	System.out.println("Unable to deselect checkbox: "+element);
        }
    }	

	public void Select_The_CheckBox_from_List(WebElement element, String valueToSelect) {
		/*List<WebElement> allOptions = element.findElements(By.tagName("input"));
		for (WebElement option : allOptions) {
			   System.out.println("Option value "+option.getText());
			        if (valueToSelect.equals(option.getText())) {
			            option.click();
			            break;
			        }
			    }
	}*/
	
}
    
    
	
	
	
	

}
