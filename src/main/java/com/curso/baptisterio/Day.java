/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.baptisterio;

/**
 *
 * @author eibaneza
 */
public class Day {
    private int day;
    private int month;
    private int year;
    private int avaiableTickets;

    public Day(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.avaiableTickets = 10;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAvaiableTickets() {
        return avaiableTickets;
    }

    public void setAvaiableTickets(int avaiableTickets) {
        this.avaiableTickets = avaiableTickets;
    }
    
    
    
}
