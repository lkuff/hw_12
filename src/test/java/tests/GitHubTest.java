package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GitHubTest extends TestBase {
    @Test
    void gitSolutionsHoverTest() {
        step("Open GitHub page", () -> {
            open("https://github.com/");
        });
        step("Hover over the solutions section and click on enterprise", () -> {
            $(".header-menu-wrapper").$(byText("Solutions")).hover();
            $$(".HeaderMenu-dropdown-link").findBy(text("Enterprise")).click();
        });
        step("Check Enterprise page has header with text 'Build like the best'", () -> {
            $(".col-9-max").shouldHave(text("Build like the best"));
        });
    }
}
