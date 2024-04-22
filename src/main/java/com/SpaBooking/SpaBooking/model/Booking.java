package com.SpaBooking.SpaBooking.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bookings")
public class Booking {
    @Id
    private String id;
    private String fName;
    private String lName;
    private String email;
    private String type;
    private String time;
    private String date;

    public Booking(String id, String fName, String lName, String email, String type, String time, String date) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.type = type;
        this.time = time;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
