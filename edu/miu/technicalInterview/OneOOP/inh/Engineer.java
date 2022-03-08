package edu.miu.technicalInterview.OneOOP.inh;


import java.util.List;

public class Engineer extends Employee {
    private List<String> techStack;

    public List<String> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<String> techStack) {
        this.techStack = techStack;
    }

    @Override
    public String toString() {
        return "Engineer [techStack=" + techStack + "], " + super.toString();
    }

}
