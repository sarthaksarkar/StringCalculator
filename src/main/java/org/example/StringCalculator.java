package org.example;

public class StringCalculator {
    public String add(String number){

        return number;
    }
    public boolean orientation(String delimeter,String number){
        boolean correctOrientation=true;
        if (number.substring(0,1).equals(delimeter) || number.substring(number.length()-1).equals(delimeter)){
            correctOrientation=false;
        } else{
            for (int i=1;i<number.length()-1;i++){
                
            }
        }
        return correctOrientation;
    }
}

