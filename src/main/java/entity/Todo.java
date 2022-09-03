package entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.sql.Date;

public class Todo {


    // ------------LAMBOK varjandiga---------------------
//    package org.example.todoList.entity;
//
//
//import lombok.*;
//
//import java.sql.Time;
//import java.sql.Date;
//import java.sql.Timestamp;
//
//    @AllArgsConstructor
//    @NoArgsConstructor
//    @Getter
//    @Setter
//    @ToString
//    public class Todo {
//        private Long id;
//        private String description;
//        private Date dueDate;
//        private Time dueTime;
//        private Status status;
//        private Timestamp createdAt;
//
//    }

    //--------dependency-----------------

//    <dependency>
//    <groupId>org.projectlombok</groupId>
//    <artifactId>lombok</artifactId>
//    <version>1.18.24</version>
//    </dependency>

    Long id;
    String description;
    Date dueDate;
    Time dueTime;
    Status status;
    Timestamp createAt;
    Timestamp updatedAt;

    public Todo() {
    }

    public Todo(Long id, String description, Date dueDate, Time dueTime, Status status, Timestamp createAt, Timestamp updatedAt) {
        this.id = id;
        this.description = description;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
        this.status = status;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Time getDueTime() {
        return dueTime;
    }

    public void setDueTime(Time dueTime) {
        this.dueTime = dueTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", dueTime=" + dueTime +
                ", status=" + status +
                ", createAt=" + createAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
