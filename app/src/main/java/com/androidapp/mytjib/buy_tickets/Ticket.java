package com.androidapp.mytjib.buy_tickets;

import androidx.annotation.NonNull;

public class Ticket {


    /**
     * id : 101
     * eventName : MAMAMOO 4 Seasons 4 Colors
     * section : GROUND
     * position : 1
     * price : 30000
     * status : unavailable
     * marked : true
     */

    private int id;
    private String eventName;
    private String section;
    private int position;
    private int price;
    private String status;
    private boolean marked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    @NonNull
    @Override
    public String toString() {
        String ticket = "";

        ticket += "Event: " + eventName + "\n";
        ticket += "Section: " + section + "\n";
        if(marked) ticket += "Position: " + position + "\n";
        ticket += "Price: " + price + "\n";

        return ticket;
    }
}