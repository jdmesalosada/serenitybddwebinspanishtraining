package starter.ui.dashboard;

import org.openqa.selenium.By;

public class DashboardPage {

    public static LeftMenu LEFT_MENU;


    public static By CREDIT_AVAILABLE = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
    public static By TOTAL_BALANCE = By.xpath("//div[contains(text(), 'Credit Available')]/following-sibling::div[@class='balance-value']");
    public static By ADD_ACCOUNT = By.xpath("//a//span[contains(., \"Add Account\")]");
    public static By MAKE_PAYMENT = By.xpath("//a//span[contains(., \"Make Payment\")]");
    public static By DUE_TODAY = By.xpath("//div[contains(text(), 'Due Today')]/following-sibling::div[contains(@class, 'balance-value')]");

    //table container
    public static By TABLE_CONTAINER = By.xpath("//div[contains(@class, \"table-responsive\")");
    //all table locators....


}
