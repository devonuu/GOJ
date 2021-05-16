package org.basic.inheritance;

public class ToString {
    public void toStringMethod(Object obj){
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus "+obj);
    }

    public void toStringMethod(){
        System.out.println(this);
        System.out.println(this.toString());
        System.out.println("plus "+this);
    }
}
