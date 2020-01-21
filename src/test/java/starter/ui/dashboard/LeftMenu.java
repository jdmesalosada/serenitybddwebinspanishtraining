package starter.ui.dashboard;

import org.openqa.selenium.By;

public class LeftMenu {
    public static By CREDIT_CARD_LINK = By.xpath("//a//span[contains(., \"Credit cards\")]");
    public static By DEBIT_CARD_LINK = By.xpath("//a//span[contains(., \"Debit cards\")]");
}
