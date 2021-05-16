package org.basic.enums;

public enum Gender {
    MALE("M","남"),
    FEMALE("F","여");

    //객체의 생성과 값의 할당까지 ENUM에서 한번에 진행함.
    //생성자의 개수에 따라 MALE이라는 객체는 남일수도 M일수도
    //열거형이기 때문에 Runtime이 아닌 Compile 단계에서 이미 MALE에는 M과 남이라는 값이 할당됨

    private String genderShort;
    private String genderKor;

    private Gender(){}
    private Gender(String genderShort, String genderKor){
        this.genderShort = genderShort;
        this.genderKor = genderKor;
    }

    public String getGenderShort(){
        return this.genderShort;
    }
    public String getGenderKor(){
        return this.genderKor;
    }

    public String makeFullWordGender(){
        return this.getGenderKor() + "성";
    }
}
