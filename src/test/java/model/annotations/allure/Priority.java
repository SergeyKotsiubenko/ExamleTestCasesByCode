package model.annotations.allure;

import io.qameta.allure.LabelAnnotation;
import io.qameta.allure.SeverityLevel;

import java.lang.annotation.*;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@LabelAnnotation(name = "priority")
public @interface Priority {

  PriorityLevel value();

}
