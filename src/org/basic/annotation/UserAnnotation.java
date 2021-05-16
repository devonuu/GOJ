package org.basic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) //어노테이션 사용 대상 지정. 이 어노테이션은 메소드에 사용할 수 있다고 지정
@Retention(RetentionPolicy.RUNTIME) //어노테이션 유지 정보 지정.
public @interface UserAnnotation {
    public int number();
    public String text() default "This is first annotation";
}
