package Homework_13;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    //У факультета: наименование факультета, список групп (List<Group> groups.)
    //Реализовать во всех классах методы геттеры и сеттеры.
    //1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)

    private String faculty;
    List<Group> groups;

    public Faculty(String faculty) {
        this.faculty = faculty;
        this.groups = new ArrayList<>();
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

}