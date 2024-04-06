package pages;

import annotations.PageValidation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@PageValidation("template://h1[text()='%s']")
public class CoursePage extends AnyPageAbs<CoursePage> {

    public CoursePage(WebDriver driver) {
        super(driver);
    }

    public CoursePage pageShouldBeOpened(String name) {
        String locator = String.format(markerLocator, name);

        assertThat(standartWaiter.waitForElementVisible($(By.xpath(locator))))
                .as("Error")
                .isTrue();

        return this;
    }
}
