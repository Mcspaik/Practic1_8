package com.mycompany.practical1_8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Люба
 */
public class Passport implements Comparable<Passport> {
    private int number;
    private String firstName;
    private String lastName;
    private String middleName;
    private String jobPosition;
    private boolean accessToTheTerritory; 

    public Passport(int number) {
        this.number = number;
    }
    

    public Passport(int number, String firstName, String lastName, String middleName, String jobPosition, boolean accessToTheTerritory) {
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.jobPosition = jobPosition;
        this.accessToTheTerritory = accessToTheTerritory;
    }

    public int getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public boolean isAccessToTheTerritory() {
        return accessToTheTerritory;
    }

    public void setNumber(int number) {
        if ((number > 99999)&&(1000000 > number)&&(number>0)){
            this.number = number;
        } else{
            System.out.println("Номер пасорта должен быть "
                    + "шестизначным и неотрицательным");
            System.exit(1);
        }
        
    }

    public void setFirstName(String firstName) {
        String chisla = "0123456789";
        int z = 0;
        char[] charss = chisla.toCharArray();
        char[] chars = firstName.toCharArray();
        for (char c:chars){
            for (char m: charss){
                if (c != m){
                    continue;
                } else {
                    z = z + 1;
                }
        }
            }
        if ( z == 0) {
            this.firstName = firstName;
        } else{
            System.out.println("Некорректно введено имя!");
            System.exit(z);
        }
    }
    
    public void setLastName(String lastName) {
        String chisla = "0123456789";
        int z = 0;
        char[] charss = chisla.toCharArray();
        char[] chars = lastName.toCharArray();
        for (char c:chars){
            for (char m: charss){
                if (c != m){
                    continue;
                } else {
                    z = z + 1;
                }
        }
            }
        if ( z == 0) {
            this.lastName = lastName;
        } else{
            System.out.println("Некорректно введена фамилия!");
            System.exit(z);
        }
    }

    public void setMiddleName(String middleName) {
        String chisla = "0123456789";
        int z = 0;
        char[] charss = chisla.toCharArray();
        char[] chars = middleName.toCharArray();
        for (char c:chars){
            for (char m: charss){
                if (c != m){
                    continue;
                } else {
                    z = z + 1;
                }
        }
            }
        if ( z == 0) {
            this.middleName = middleName;
        } else{
            System.out.println("Некорректно введено отчество!");
            System.exit(z);
        }
    }

    public void setJobPosition(String jobPosition) {
        String chisla = "0123456789";
        int z = 0;
        char[] charss = chisla.toCharArray();
        char[] chars = jobPosition.toCharArray();
        for (char c:chars){
            for (char m: charss){
                if (c != m){
                    continue;
                } else {
                    z = z + 1;
                }
        }
            }
        if ( z == 0) {
            this.jobPosition = jobPosition;
        } else{
            System.out.println("Некорректно введена должность!");
            System.exit(z);
        }
    }

    public void setAccessToTheTerritory(boolean accessToTheTerritory) {
     this.accessToTheTerritory = accessToTheTerritory;   
    }
    
    @Override
    public int compareTo(Passport d){
        return lastName.compareTo(d.getLastName());
    }
}
