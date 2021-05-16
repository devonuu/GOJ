package org.basic.enums;

public enum PowerSwitch {
    ON("켜짐"),
    OFF("꺼짐");

    private String status;

    private PowerSwitch(){}
    private PowerSwitch(String korName){
        this.status = korName;
    }

    public String getStatus(){
        return this.status;
    }

    public PowerSwitch opposite(){
        if (this == PowerSwitch.ON) {
            return PowerSwitch.OFF;
        }else {
            return PowerSwitch.ON;
        }
    }
}
