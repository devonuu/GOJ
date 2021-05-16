package org.basic.exception;

public class ThrowableSample {
    public void throwable(){
        int[] intArray = new int[5];
        try{
            intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable t){
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace();
        }
    }
    public void throwable (int number){
        try{
            if (number > 12){
                throw new Exception("Number is over than 12");
            }
            System.out.println("Number is " + number);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void throwException (int number) throws Exception{
        if (number > 12){
            throw new Exception("Number is over than 12");
        }
        System.out.println("Number is " + number);
    }

    public void printDivide(double d1, double d2) throws Exception{
        if (d2 == 0){
            throw new Exception("Second value can't be Zero");
        }
        double result = d1/d2;
        System.out.println(result);
    }
}
