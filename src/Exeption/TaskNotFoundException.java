package Exeption;

import java.io.IOException;

public class TaskNotFoundException extends Exception{
    public TaskNotFoundException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Exeption.TaskNotFoundException " + super.toString();
    }
}
