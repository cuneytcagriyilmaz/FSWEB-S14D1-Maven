package com.workintech.developers;

public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public String work() {
        return "Mid Developer " + getName() + " starts to working";
    }
}
