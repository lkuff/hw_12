package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class DragAndDropTest extends TestBase{
    @Test
    void dragAndDropTest () {
        step("Open the internet drag_and_drop page", () -> {
            open("https://the-internet.herokuapp.com/drag_and_drop");
        });
        step("Move rectangle A to place B",() -> {
            $("#column-a").dragAndDropTo("#column-b");
        });
        step("Check that triangle A is in place B", () -> {
            $("#column-a").shouldHave(text("B"));
            $("#column-b").shouldHave(text("A"));
        });
    }
}
