package org.basic;

import com.sun.org.apache.xpath.internal.operations.String;
import org.basic.annotation.AnnotationOverride;
import org.basic.annotation.UserAnnotation;
import org.basic.enums.Gender;
import org.basic.enums.OverTimeValues;
import org.basic.enums.OverTimeValues2;
import org.basic.enums.PowerSwitch;
import org.basic.exception.CustomException;
import org.basic.exception.ThrowableSample;
import org.basic.model.MemberDTO;
import org.basic.service.MemberManager;
import org.basic.service.MemberManagerImpl;

public class Main {

    public static void main(String[] args) {

    }

    public void throwCustomException(int number) throws CustomException{
        if (number > 12){
            throw new CustomException("Number is over than 12");
        }
    }

    public int getOverTimeAmount(OverTimeValues value){
        int amount = 0;
        System.out.println(value);
        switch (value){
            case THREE_HOUR:
                amount=18000;
                break;
            case FIVE_HOUR:
                amount=30000;
                break;
            case WEEKEND_FOUR_HOUR:
                amount=40000;
                break;
            case WEEKEND_EIGHT_HOUR:
                amount=60000;
                break;
        }
        return amount;
    }

    public void equalMethod(){
        MemberDTO mem1 = new MemberDTO("gunwoo");
        MemberDTO mem2 = new MemberDTO("gunwoo");
        if (mem1 == mem2){
            System.out.println("same");
        }else {
            System.out.println("different");
            System.out.println("mem1 = "+mem1);
            System.out.println("mem2 = "+mem2);
        }
    }
    public void equalMethod2(){
        MemberDTO mem1 = new MemberDTO("gunwoo");
        MemberDTO mem2 = new MemberDTO("gunwoo");
        if (mem1.equals(mem2)){
            System.out.println("same");
        }else {
            System.out.println("different");
            System.out.println("mem1 = "+mem1);
            System.out.println("mem2 = "+mem2);
        }
    }
}