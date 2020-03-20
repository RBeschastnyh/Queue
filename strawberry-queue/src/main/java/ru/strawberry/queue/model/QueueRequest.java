package ru.strawberry.queue.model;

import java.util.Date;

public class QueueRequest {

    private String studentName;
    private String subject;
    private String desiredDate;
    private String desiredTask;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDesiredDate() {
        return desiredDate;
    }

    public void setDesiredDate(String desiredDate) {
        this.desiredDate = desiredDate;
    }

    public String getDesiredTask() {
        return desiredTask;
    }

    public void setDesiredTask(String desiredTask) {
        this.desiredTask = desiredTask;
    }
}
