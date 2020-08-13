package com.androidapp.mytjib.customer;

import com.androidapp.mytjib.buy_tickets.Ticket;

import java.util.Date;
import java.util.List;

public class Order {


    /**
     * orderNum : 2
     * tickets : [{"id":101,"eventName":"MAMAMOO 4 Seasons 4 Colors","section":"GROUND","position":1,"price":30000,"status":"unavailable","marked":true}]
     * price : 0
     * orderTime : 2020-08-11T17:22:53.257+00:00
     * status : completed
     */

    private int orderNum;
    private int price;
    private Date orderTime;
    private String status;
    private List<Ticket> tickets;

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}