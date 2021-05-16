package org.basic.enums;

import java.util.function.Function;

public enum Careers {
    CNT_EXAM(value -> value),
    CNT_REVIEW(value -> value + 10);

    private Function<Integer, Integer> cal;
    //함수형 인터페이스 Function<T,R>  T : 매개변수 타입 , R : 리턴타입
    //value하나 넣으면 연관된 모든 계산이 가능하다는 결론이네?

    private Careers(){}
    private Careers(Function<Integer, Integer> cal){
        this.cal = cal;
    }

    public Integer calculate(int value){
        return this.cal.apply(value);
    }
}
