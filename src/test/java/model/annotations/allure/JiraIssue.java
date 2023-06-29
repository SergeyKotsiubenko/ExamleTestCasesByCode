package model.annotations.allure;

import java.lang.annotation.*;
import io.qameta.allure.LabelAnnotation;

@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@LabelAnnotation(name = "jira")
@Repeatable(JiraIssues.class)
public @interface JiraIssue {
    String value();
}