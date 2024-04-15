/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sunzida;

import java.time.LocalDate;

/**
 *
 * @author Asus
 */
public class Event {
   String eventName,foodMenuType,location;
   int  noOfPartecipants;
   LocalDate eventDate;

    public Event(String eventName, String foodMenuType, String location, int noOfPartecipants, LocalDate eventDate) {
        this.eventName = eventName;
        this.foodMenuType = foodMenuType;
        this.location = location;
        this.noOfPartecipants = noOfPartecipants;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getFoodMenuType() {
        return foodMenuType;
    }

    public void setFoodMenuType(String foodMenuType) {
        this.foodMenuType = foodMenuType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNoOfPartecipants() {
        return noOfPartecipants;
    }

    public void setNoOfPartecipants(int noOfPartecipants) {
        this.noOfPartecipants = noOfPartecipants;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    @Override
    public String toString() {
        return "Event{" + "eventName=" + eventName + ", foodMenuType=" + foodMenuType + ", location=" + location + ", noOfPartecipants=" + noOfPartecipants + ", eventDate=" + eventDate + '}';
    }
   
}
