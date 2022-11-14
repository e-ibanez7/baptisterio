/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.baptisterio;

import java.util.Scanner;

/**
 *
 * @author eibaneza
 */
public class UI {
    private MyCalendar calendar;

    public UI() {
    }
    
    public void mainMenu(){
        int option=0;
        System.out.println("***********************************************");
        System.out.println("*** Menú Principal Baptisterio ***");
        System.out.println("1. Elegir día");
        System.out.println("0. Salir");
        System.out.println("***********************************************");
        try {
            System.out.print("Introduzca su opción: ");
            option = Integer.parseInt(this.keyboardListener());
        }
        catch (NumberFormatException e){
            System.out.println("Opción introducida inválida, por favor intentelo de nuevo");
            this.mainMenu();
        }
        switch (option){
            case 1 -> this.selectDayMenu();
            default -> System.exit(0);
        }
    }
    
    public void selectDayMenu(){
        String option;
        int ticketsNumber;
        System.out.println("***********************************************");
        System.out.println("*** Menú Elegir Fecha ***");
        try {
            System.out.print("Introduzca la fecha deseada (formato dd/mm/aaaa dd:mm:aaaa dd-mm-aaaa)");
            option = this.keyboardListener();
            String [] date = option.split("/|:|-");
            if (this.checkValidDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]))){
                //Ahora tenemos que ver cuantas quedan disponibles
            }
            else {
                System.out.println("Fecha inválida. Inténtelo de nuevo.");
                this.selectDayMenu();
            }
            System.out.print("Introduzca el número de entradas deseadas: )");
            ticketsNumber = Integer.parseInt(this.keyboardListener());
            
            
            this.purchaseTicket(option,ticketsNumber );
        }
        catch (Exception e){
            System.out.println("Opción introducida inválida, por favor intentelo de nuevo");
            this.selectDayMenu();
        }
    }
    
    public void purchaseTicket(String date, int ticketsNumber){
        
        
    }
    
    public String keyboardListener(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    
    public boolean checkValidDate(int day, int month, int year){
        boolean validDate=false;
        if (month >= 1 && month <=12 ){
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if (day >= 1 && day <= 31){
                    validDate = true;
                }   
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11){
                if (day >= 1 && day <= 30){
                    validDate = true;
                }
            }
            else if (month == 2){
                if (((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0)){
                    if (day >= 1 && day <= 29){
                        validDate = true;
                    }
                }
                else {
                    if (day >= 1 && day <= 28){
                        validDate = true;
                    }
                }
            }
        }
        return validDate;
    }
}
