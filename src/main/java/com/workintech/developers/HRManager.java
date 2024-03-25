package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDeveloperArray;
    private MidDeveloper[] midDeveloperArray;
    private SeniorDeveloper[] seniorDeveloperArray;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    public String work() {
        return "HR Manager " + getName() + " starts to working";
    }

    public void addEmployee(JuniorDeveloper employee) {
        for (int i = 0; i < juniorDeveloperArray.length; i++) {
            if (juniorDeveloperArray[i] == null) {
                juniorDeveloperArray[i] = employee;
            }else{
                System.out.println("Junior Developer Array is Full");
            }

        }
    }

    public void addEmployee(MidDeveloper employee) {
        for (int i = 0; i < midDeveloperArray.length; i++) {
            if (midDeveloperArray[i] == null) {
                midDeveloperArray[i] = employee;

            }else {
                System.out.println("Mid Developer Array is Full");

            }
        }
    }

    public void addEmployee(SeniorDeveloper employee) {
        for (int i = 0; i < seniorDeveloperArray.length; i++) {
            if (seniorDeveloperArray[i] == null) {
                seniorDeveloperArray[i] = employee;
            }else {
                System.out.println("Senior Developer Array is Full");

            }
        }
    }


    public JuniorDeveloper[] getJuniorDeveloperArray() {
        return juniorDeveloperArray;
    }

    public void setJuniorDeveloperArray(JuniorDeveloper[] juniorDeveloperArray) {
        this.juniorDeveloperArray = juniorDeveloperArray;
    }

    public MidDeveloper[] getMidDeveloperArray() {
        return midDeveloperArray;
    }

    public void setMidDeveloperArray(MidDeveloper[] midDeveloperArray) {
        this.midDeveloperArray = midDeveloperArray;
    }

    public SeniorDeveloper[] getSeniorDeveloperArray() {
        return seniorDeveloperArray;
    }

    public void setSeniorDeveloperArray(SeniorDeveloper[] seniorDeveloperArray) {
        this.seniorDeveloperArray = seniorDeveloperArray;
    }
}
