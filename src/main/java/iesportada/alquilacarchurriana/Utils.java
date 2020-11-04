/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iesportada.alquilacarchurriana;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vzh
 */
public class Utils extends javax.swing.JFrame{
    
    String finalDropDate;
    String finalPickUpDate;
    String name;
    String address;
    String phone;
    String ccNumber;
    String dni;
    Date date1;
    Date date2;
    int age;
    
    private long rentedDays;
    final int eighteenYearsOld=18;
    private String todayDate;
    
    final static String AGE_WARNING_MESSAGE_ES="\nConductor ha de ser mayor de edad";
    final static String NAME_WARNING_MESSAGE_ES="\nIntroduzca un nombre";
    final static String ADDRESS_WARNING_MESSAGE_ES="\nIntroduzca una dirección";
    final static String PHONE_WARNING_MESSAGE_ES="\nTeléfono no válido";
    final static String CC_WARNING_MESSAGE_ES="\nTarjeta de crédito no válida";
    final static String DNI_WARNING_MESSAGE_ES="\nDNI incorrecto";
    
    
    //Métodos setter.
        
    public void setAge(int age){
        this.age=age;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setAddress(String address){
        this.address=address;
    }
    
    public void setPhone(String phone){
        this.phone=phone;
    }
    
    public void setCCNumber(String ccNumber){
        this.ccNumber=ccNumber;
    }
    
    public void setDNINumber(String dni){
        this.dni=dni;
    }
    
    public void finalPickUpDate(String finalPickUpDate){
        this.finalPickUpDate=finalPickUpDate;
    }
    
    
    public void finalDropDate(String finalDropDate){
        this.finalDropDate=finalDropDate;
    }
    
    public void setDate1(Date date1){
        this.date1=date1;
    }
    
    public void setDate2(Date date2){
        this.date2=date2;
    }
    
    //Constructores
    
    public boolean checkEdad(){
        boolean ageValue=true;
        if (this.age<eighteenYearsOld){
            ageValue=false;
        }
        return ageValue;
    }
    
    
    public boolean checkNameJTextField(){
        boolean nameTextField=true;
        if (this.name.equals("")){
            nameTextField=false;
        }
        return nameTextField;
    }
       
    
    public boolean checkAddressJTextField(){
        boolean addressTextField=true;
        if(this.address.equals("")){
            addressTextField=false;
        }
        return addressTextField;
    }
    
    /*
    public boolean checkPhoneJTextField(){
        boolean phoneTextField=true;
        int count = 0;
        if(this.phone.equals("")){
            phoneTextField=false;
        }
        return phoneTextField;
    }

    **/
    
    /*
    Método que mejora la comprobación del teléfono introducido.
    No puede estar vacio, solo pueden ser números y solo valen
    teléfonos de entre 9 y 13 cifras.
    ej1.666444333
    ej2.0034666444333
    */
    
    public boolean checkPhoneJTextField(){
        boolean phoneTextField = true;
        int count = 0;
        for (int i = 0; i < phone.length(); i++){
            if(phone.charAt(i) != ' '){
                count++;
            }
        }
        if (count < 9){
            phoneTextField = false;
        }
        if (count > 13){
            phoneTextField = false;
        }
        return phoneTextField;
    }
    
    
    public boolean checkCCJTextField(){
        boolean ccJTextField=true;
        int count=0;
        for(int i = 0; i < ccNumber.length(); i++){
            if(ccNumber.charAt(i) != ' '){
                count++;
            }   
        }
        if(count != 16){
            ccJTextField=false;
        }       
        return ccJTextField;
    }
    
    
    public boolean checkDNI() {
 
        boolean esValido = false;
        int i = 0;
        int caracterASCII = 0;
        char letra = ' ';
        int miDNI = 0;
        int resto = 0;
        char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
 
        if(dni.length() == 9 && Character.isLetter(dni.charAt(8))) {
 
            do {
                caracterASCII = dni.codePointAt(i);
                esValido = (caracterASCII > 47 && caracterASCII < 58);
                i++;
            } 
            while(i < dni.length() - 1 && esValido);     
        }
 
        if(esValido) {
            letra = Character.toUpperCase(dni.charAt(8));
            miDNI = Integer.parseInt(dni.substring(0,8));
            resto = miDNI % 23;
            esValido = (letra == asignacionLetra[resto]);
        }
 
        return esValido;
    }



    public String todayDate(){
        Date date= new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        todayDate=sdf.format(date);
        return todayDate;
    }
    


    public String defaultDropDate(){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            c.setTime(sdf.parse(todayDate));
        }
        catch (ParseException e){
            e.printStackTrace();
        }
        c.add(Calendar.DAY_OF_MONTH, 1);
        return sdf.format(c.getTime());
    }
    
    
    public long rentedDays(){

        try {
            rentedDays = date2.getTime()-date1.getTime();
            }
        catch(NullPointerException e){
            e.getStackTrace();
            }
        return rentedDays;
    }
    
}
