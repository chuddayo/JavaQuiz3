package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;
    public Student() {
        labs = new ArrayList<>();
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
    }

    public Lab getLab(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        if (labs.isEmpty()) throw new UnsupportedOperationException();
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                lab.setStatus(labStatus);
            }
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        for (Lab lab : labs) {
            if (lab.getName().equals(labName)) {
                return lab.getStatus();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder labString = new StringBuilder();
        for (int i = labs.size()-1; i >= 0; i--) {
            labString.append(labs.get(i).getName()).append(" > ").append(labs.get(i).getStatus());
            if (i != 0) labString.append("\n");
        }
        return labString.toString();
    }
}
