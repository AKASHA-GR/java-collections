package com.xworkz.collectionIntro.collectionMethods.runner;

import com.xworkz.collectionIntro.collectionMethods.dto.SmartWatchDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SmartRunner {
    public static void main(String[] args) {


        List<SmartWatchDTO> smartWatchDTOS = new ArrayList<>();

        //1.ADD SINGE
        smartWatchDTOS.add(new SmartWatchDTO("Apple","Ultra","White",1.83,false,false,2,184.34,"watchOS", LocalDate.of(2020,8,7)));
        System.out.println();

        //2.I ADDED 10 HEAR
        smartWatchDTOS.add(new SmartWatchDTO("OnePlus","Watch 2","Blue",1.62,false,true,3,401.83,"Wear OS",LocalDate.of(2020,4,17)));
        smartWatchDTOS.add(new SmartWatchDTO("boAt","Storm Pro","Pink",1.79,false,false,6,123.43,"boAt OS",LocalDate.of(2024,3,20)));
        smartWatchDTOS.add(new SmartWatchDTO("Apple","Series 10","Silver",1.78,false,false,27,843.88,"watchOS",LocalDate.of(2020,2,16)));
        smartWatchDTOS.add(new SmartWatchDTO("boAt","Xtend Plus","Space Gray",1.95,false,false,21,929.91,"boAt OS",LocalDate.of(2026,8,20)));
        smartWatchDTOS.add(new SmartWatchDTO("Google","Pixel Watch 3","White",1.76,false,false,27,606.99,"Wear OS",LocalDate.of(2025,1,2)));
        smartWatchDTOS.add(new SmartWatchDTO("Samsung","Galaxy Watch 4","Red",1.76,false,true,21,405.93,"Wear OS",LocalDate.of(2025,2,26)));
        smartWatchDTOS.add(new SmartWatchDTO("Samsung","Galaxy Watch 7","Pink",1.42,true,false,5,616.12,"Wear OS",LocalDate.of(2021,1,8)));
        smartWatchDTOS.add(new SmartWatchDTO("Google","Pixel Watch 2","Gold",1.91,true,false,4,206.05,"Wear OS",LocalDate.of(2025,6,4)));
        smartWatchDTOS.add(new SmartWatchDTO("OnePlus","Watch 2","Blue",1.99,true,true,11,504.32,"Wear OS",LocalDate.of(2022,1,4)));
        smartWatchDTOS.add(new SmartWatchDTO("boAt","Xtend Plus","Red",1.52,false,false,13,935.45,"boAt OS",LocalDate.of(2022,7,13)));
        System.out.println();

        //ADD IN INDEX(0)
        smartWatchDTOS.add(0,new SmartWatchDTO("OnePlus","Watch 2","Silver",1.83,false,true,5,253.56,"Wear OS",LocalDate.of(2020,11,2)));
        System.out.println();

        //ADD IN INDEX(2) AND OTHER RANDOMLY
        smartWatchDTOS.add(2,new SmartWatchDTO("boAt","Xtend Plus","Gold",1.21,true,true,3,547.78,"boAt OS",LocalDate.of(2025,2,7)));
        smartWatchDTOS.add(7,new SmartWatchDTO("Google","Pixel Watch 3","Pink",1.63,true,true,28,620.86,"Wear OS",LocalDate.of(2024,10,6)));
        smartWatchDTOS.add(14,new SmartWatchDTO("Xiaomi","Watch S3","Black",1.8,true,false,3,952.44,"HyperOS",LocalDate.of(2021,5,5)));
        System.out.println();

        //ADD AT LAST
        smartWatchDTOS.add(new SmartWatchDTO("Noise","ColorFit Vision","Pink",1.74,true,false,29,852.13,"Noise OS",LocalDate.of(2022,10,26)));
        smartWatchDTOS.add(new SmartWatchDTO("Xiaomi","Mi Watch","Blue",1.34,false,false,5,749.62,"HyperOS",LocalDate.of(2022,11,8)));
        smartWatchDTOS.add(new SmartWatchDTO("boAt","Storm Pro","Green",1.3,false,false,24,892.06,"boAt OS",LocalDate.of(2025,4,12)));
        System.out.println();

        //SIZE METHOD
        System.out.println("The Totle SmartWatch:"+smartWatchDTOS.size());
        for(SmartWatchDTO ref:smartWatchDTOS){
            System.out.println(ref);
        }
        System.out.println();




        //SECOND LIST
        List<SmartWatchDTO> smartWatchDTOS1 = new ArrayList<>();

        smartWatchDTOS1.add(new SmartWatchDTO("boAt","Storm Pro","Green",1.3,false,false,24,892.06,"boAt OS",LocalDate.of(2025,4,12)));
        smartWatchDTOS1.add(new SmartWatchDTO("Apple","Ultra","White",1.91,true,false,11,878.74,"watchOS",LocalDate.of(2020,1,15)));
        smartWatchDTOS1.add(new SmartWatchDTO("Amazfit","GTR 4","Blue",1.69,false,false,15,791.58,"Zepp OS",LocalDate.of(2022,6,25)));

        smartWatchDTOS.addAll(smartWatchDTOS1);
        System.out.println("The Totle SmartWatch:"+smartWatchDTOS.size());
        for(SmartWatchDTO ref:smartWatchDTOS){
            System.out.println(ref);
        }
        System.out.println();

        //THIRD LIST
        List<SmartWatchDTO> smartWatchDTOS3 = new ArrayList<>();

        smartWatchDTOS3.add(new SmartWatchDTO("Apple","Ultra","White",1.91,true,false,11,878.74,"watchOS",LocalDate.of(2020,1,15)));
        smartWatchDTOS3.add(new SmartWatchDTO("Amazfit","GTR 4","Blue",1.69,false,false,15,791.58,"Zepp OS",LocalDate.of(2022,6,25)));

        smartWatchDTOS.addAll(2,smartWatchDTOS3);
        System.out.println("The Totle SmartWatch:"+smartWatchDTOS.size());
        for(SmartWatchDTO ref:smartWatchDTOS){
            System.out.println(ref);
        }
        System.out.println();


    }
}
