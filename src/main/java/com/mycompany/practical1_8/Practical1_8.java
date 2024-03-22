/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1_8;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author Люба
 */
public class Practical1_8 {

    public static void main(String[] args) {
        System.out.println("РИБО-02-22, Степеренкова "
                + "Любовь Алексеевна, Варинат 4");
        ArrayList<Passport> passports = new ArrayList<>(); 
        HashMap<Integer,Passport> passportsMap = new HashMap<>();
        passports.add(new Passport(111111,"Александр","Быков","Алексеевич","бухгалтер",false));
        passports.add(new Passport(222222,"Иван","Иванов","Иванович","уборщик",true));
        passports.add(new Passport(333333,"Алексей","Алексеев","Алексеевич","инженер",true));
        passports.add(new Passport(444444,"Матвей","Толстой","Сергеевич","водитель",false));
        passports.add(new Passport(555555,"Антон","Болков","Алексеевич","сантехник",false));
        int point = 1;
        Passport pr = new Passport(000000);
        Scanner sc = new Scanner(System.in);
        while(point==1){
            System.out.println("Хотите добавить пропуск в список? Если да,"
                    + "то введите 1, если нет, то введите 2: ");
            point = sc.nextInt();
            if(point == 1){
                System.out.println("Введите имя: ");
                String firstName = sc.next();
                pr.setFirstName(firstName);
                System.out.println("Введите фамилию: ");
                String lastName = sc.next();
                pr.setLastName(lastName);
                System.out.println("Введите отчество: ");
                String middleName = sc.next();
                pr.setMiddleName(middleName);
                System.out.println("Введите номер пасспорта: ");
                int number = sc.nextInt();
                pr.setNumber(number);
                System.out.println("Введите должность работника: ");
                String jobPosition = sc.next();
                pr.setJobPosition(jobPosition);
                System.out.println("Введите отсутсвие или присутствие допуска на территорию: ");
                Boolean accessToTheTerritory = sc.nextBoolean();
                pr.setAccessToTheTerritory(accessToTheTerritory);
                passports.add(new Passport(number,firstName,lastName,middleName,jobPosition,accessToTheTerritory));
                for (int i =0;i< passports.size()-1;i++){
                    if (passports.get(i).getNumber()== number){
                        passports.remove(passports.get(i));
                    }
                }
                for(Passport s:passports){
                    passportsMap.put(s.getNumber(),s);
                }
                TreeMap<Integer,Passport> sortedPassportsMap = new TreeMap<>(passportsMap);
                for(Map.Entry<Integer,Passport> entr: sortedPassportsMap.entrySet()){
                    int passportId = entr.getKey();
                    String fName = entr.getValue().getFirstName();
                    String lName = entr.getValue().getLastName();
                    String mName = entr.getValue().getMiddleName();
                    String jPosition = entr.getValue().getJobPosition();
                    boolean aTerritory = entr.getValue().isAccessToTheTerritory();
                    System.out.println(lName +" "+fName+" "+mName+" "+passportId+" "+jPosition+" "+aTerritory);
                }
                System.out.println("---------------");
                Collections.sort(passports);
                for(Passport p: passports){
            System.out.println(p.getLastName()+" "+p.getFirstName()+" "+p.getMiddleName()+" "+p.getNumber()+
                    " "+p.getJobPosition()+" "+ p.isAccessToTheTerritory());
            
        }
            } else{
                for(Passport s:passports){
                    passportsMap.put(s.getNumber(),s);
                }
                TreeMap<Integer,Passport> sortedPassportsMap = new TreeMap<>(passportsMap);
                for(Map.Entry<Integer,Passport> entr: sortedPassportsMap.entrySet()){
                    int passportId = entr.getKey();
                    String fName = entr.getValue().getFirstName();
                    String lName = entr.getValue().getLastName();
                    String mName = entr.getValue().getMiddleName();
                    String jPosition = entr.getValue().getJobPosition();
                    boolean aTerritory = entr.getValue().isAccessToTheTerritory();
                    System.out.println(lName +" "+fName+" "+mName+" "+passportId+" "+jPosition+" "+aTerritory);
                }
                System.out.println("---------------");
                Collections.sort(passports);
                for(Passport p: passports){
            System.out.println(p.getLastName()+" "+p.getFirstName()+" "+p.getMiddleName()+" "+p.getNumber()+
                    " "+p.getJobPosition()+" "+ p.isAccessToTheTerritory());
        }
            }
            
        }
    }
}
