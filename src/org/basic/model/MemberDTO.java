package org.basic.model;

import java.util.Objects;

public class MemberDTO {
    public String name;
    public String gender;
    public int age;
    public String phone;
    public String email;

    public MemberDTO(){}
    public MemberDTO(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberDTO memberDTO = (MemberDTO) o;
        return age == memberDTO.age && name.equals(memberDTO.name) && gender.equals(memberDTO.gender) && Objects.equals(phone, memberDTO.phone) && Objects.equals(email, memberDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, phone, email);
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}