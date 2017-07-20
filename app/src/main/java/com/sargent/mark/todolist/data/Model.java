package com.sargent.mark.todolist.data;

/**
 * Created by Welcome To Future on 7/18/2017.
 */

//here i have created a model class for the checkbox to remember that its checked or not

public class Model
{
    String name;
    int value;
    boolean selected;

    Model(String name,int value,boolean selected)
    {
        this.name=name;
        this.value=value;
        this.selected=selected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getValue() {
        return value;
    }
}
