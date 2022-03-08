/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santosoftvw.access;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author User
 */
public class ExDate {
    
    public static void main(String[] args){
      Date d = new Date();
      System.out.println(d);
      
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      System.out.println(sdf.format(d));
    }
    
}
