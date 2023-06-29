package model.annotations.allure;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Description {

    /**
     * Simple description text as String.
     *
     * @return Description text.
     */
    String value() default "";

    /**
     * Use annotated method's javadoc to extract description that
     * supports html markdown.
     *
     * @return boolean flag to enable description extraction from javadoc.
     */
    boolean useJavaDoc() default false;
}
