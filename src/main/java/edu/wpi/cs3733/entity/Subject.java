package edu.wpi.cs3733.entity;

import javafx.beans.property.SimpleStringProperty;

public class Subject {

    private final SimpleStringProperty state = new SimpleStringProperty();

    public SimpleStringProperty getState() {
        return  state;
    }

    public void setState(String stringValue){
        state.set(stringValue);
    }
}
