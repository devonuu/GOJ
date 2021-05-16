package org.basic.inheritance;

public class Animal {
    private String name;
    private String kind;
    private String area;
    private String eatKind;
    private int iq;
    private int age;
    private int food;
    private int speed;
    private int legCount;
    private int wingCount;
    private int hornCount;
    private boolean hasWing;
    private boolean hasHorn;

    public Animal(){}

    public Animal(String kind, String area, String eatKind, boolean hasHorn, boolean hasWing, int legCount, int wingCount, int hornCount){
        this.kind = kind;
        this.area = area;
        this.eatKind = eatKind;
        this.hasHorn = hasHorn;
        this.hasWing = hasWing;
        this.legCount = legCount;
        this.wingCount = wingCount;
        this.hornCount = hornCount;
        this.age = 0;
        this.iq = 0;
    }

    public void move() {
        this.speed += 10;
    }

    public void moveDown(){
        if (this.speed - 10 <= 0) this.stop();
        else this.speed -= 10;
    }

    public void stop(){
        this.speed = 0;
    }

    public void study(){
        this.iq += 1;
    }

    public void eatFood(String eatKind){
        if (this.eatKind.equals(eatKind)){
            this.food += 5;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", area='" + area + '\'' +
                ", eatKind='" + eatKind + '\'' +
                ", iq=" + iq +
                ", age=" + age +
                ", food=" + food +
                ", speed=" + speed +
                ", legCount=" + legCount +
                ", wingCount=" + wingCount +
                ", hornCount=" + hornCount +
                ", hasWing=" + hasWing +
                ", hasHorn=" + hasHorn +
                '}';
    }
}
