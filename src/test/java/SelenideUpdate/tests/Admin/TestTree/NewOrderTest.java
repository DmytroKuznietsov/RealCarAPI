package SelenideUpdate.tests.Admin.TestTree;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class NewOrderTest {
    public String devURL = "https://admin.development.realcar.nyc";

    @Test
    public void LoginTest() {
        open(devURL);
        $("button[class=\"btn btn-success btn-block\"]").shouldHave(visible);

    }

    @Test
    public void search_selenide_in_google() {
        open("https://google.com/ncr");
        $(By.name("q")).val("selenide").pressEnter();
        $$("#res .g").shouldHave(sizeGreaterThan(1));
        $("#res .g").shouldBe(visible).shouldHave(
                text("Selenide: concise UI tests in Java"),
                text("selenide.org"));
    }
}
