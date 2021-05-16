package org.basic.annotation;

import org.basic.Main;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append(i);
                stringBuffer.append(i);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                stringBuilder.append(i);
                stringBuffer.append(i);
            }
        }).start();

        new Thread(()->{
            try{
                Thread.sleep(10000);
                System.out.println("stringBuilder.length()="+stringBuilder.length());
                System.out.println("stringBuffer.length()="+stringBuffer.length());
            } catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }

    public void checkAnnotations(Class useClass){
        System.out.println("----");
        Method[] methods = useClass.getDeclaredMethods(); //해당 클래스에 선언되어 있는 메소드 목록을 배열로 리턴한다.
        for(Method tempMethod : methods){
            UserAnnotation annotation = tempMethod.getAnnotation(UserAnnotation.class);//해당 메소드에 선언되어 있는 매개 변수로 넘겨준 어노테이션이 있는지 확인하고, 있을 경우 그 어노테이션의 객체를 리턴해 준다.
            if (annotation != null){
                int number = annotation.number(); //어노테이션에 선언된 메소드를 호출하면 그 값을 리턴해 준다
                String text = annotation.text();  //어노테이션에 선언된 메소드를 호출하면 그 값을 리턴해 준다
                System.out.printf("%s : number = %d, text = %s\n", tempMethod.getName(), number, text);
            }else {
                System.out.printf("%s : annotation is null.", tempMethod.getName());
            }
        }
    }
}
