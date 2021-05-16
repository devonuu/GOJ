package org.basic.annotation;

public class AnnotationOverride {
    @UserAnnotation(number = 1)
    public void annotationSample1(){

    }

    @UserAnnotation(number = 2, text = "second")
    public void annotationSample2(){

    }
    @UserAnnotation(number = 3, text = "third")
    public void annotationSample3(){

    }
}
