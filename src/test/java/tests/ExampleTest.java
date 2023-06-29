package tests;


import io.qameta.allure.*;
import model.annotations.allure.*;
import model.annotations.allure.Description;
import model.helpers.FileHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static io.qameta.allure.Allure.step;


@Severity(SeverityLevel.NORMAL)
@Owner("SergeyK")
@Manual
@Tags({@Tag("example")})
public class ExampleTest {

    private FileHelper file;

    @Test()
    @AllureId("87995")
    @JiraIssues({@JiraIssue("TEST-1")})
    @Links({@Link("TEST-1")})
    @Layer("ui")
    @DisplayName("Добавление товара в корзину")
    @Description("Пример тест-кейса как код")
    @Priority(PriorityLevel.NORMAL)
    public void uiTestExample() {
        step("Предусловия", () ->
                step("Открыть приложение", () -> {
                }));
        step("Ввести в поле [Поиск] код товара: 84846320", () -> {
        });
        step("Нажать кнопку [В корзину]", () -> {
        });
        step("Проверить:", () -> {
            step("Экран выглядит как на скриншоте:", () -> {
                file.attachPicture("Экран добавления товара", "examples/shoppingList.png", "png");
            });
            step("Товар добавлен в корзину", () -> {
            });
            step("По-умолчанию указано количество [1шт]", () -> {
            });
        });
    }

    @Test()
    @AllureId("87996")
    @JiraIssues({@JiraIssue("TEST-2")})
    @Links({@Link("TEST-2")})
    @Tags({@Tag("example")})
    @Layer("api")
    @DisplayName("Пример API теста")
    public void apiTestExample() {
        step("Отправить бэк запрос GET /v1/addresses/store=999&lmCode=10966327", () -> {
        });
        step("Проверить:", () -> {
            step("Получили httpcode=200", () -> {
            });
            step("В ответе вернулся json:", () -> {
                file.attachFile("Ответ", "examples/example_response.json", "json");
            });
        });
    }

}
