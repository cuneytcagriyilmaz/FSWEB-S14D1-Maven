package com.workintech.developers;

public class SeniorDeveloper  extends Employee{

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String work() {
        return "Senior Developer " + getName() + " starts to working";
    }
}
