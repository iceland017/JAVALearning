package com.polyarray;

public class Teacher extends Person {
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + " salary " + salary;
    }

    public void teach(){
        //老师特有方法
        System.out.println("老师 "+getName()+" 正在讲课 ");
    }
}