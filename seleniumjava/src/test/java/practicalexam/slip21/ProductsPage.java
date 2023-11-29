package practicalexam.slip21;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {

    @FindBy(id = "inventory_container")
    private WebElement productsContainer;

    public boolean isProductsPageDisplayed() {
        return productsContainer.isDisplayed();
    }
}