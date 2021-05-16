package org.basic.string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SampleString {
    public void convert(){
        try{
            String korean = "한글";
            byte[] array1 = korean.getBytes();
            this.printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

    public void convertUTF16(){
        try{
            String korean = "자바의 신 최고 !!!";
            byte[] array1 = korean.getBytes("UTF-16");
            this.printByteArray(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

    public void convertUTF8(){
        try{
            String korean = "자바의 신 최고 !!!";
            byte[] array1 = korean.getBytes("UTF-8");
            this.printByteArray(array1);
            String korean2 = new String(array1, "UTF-8");
            System.out.println(korean2);
        }catch (Exception e){
            e.printStackTrace();
        }finally {

        }
    }

    public void printByteArray(byte[] arr){
        for(byte data : arr){
            System.out.print(data+" ");
        }
        System.out.println();
        System.out.println(arr.length);
    }
}
