/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santosoftvw.access;

import com.santosoftvw.inheritance.Movie;
import java.util.Date;

/**
 *
 * @author User
 */
public class Action extends Movie {
    
    public Action(){
        super();//constructor of superclass
        this.name="Don't Lookup";
        this.actors[0]="Leonardo";
        this.actress[0]="Jenifer Laurance";
        this.director[0]="";
        this.producer[0]="";
        this.releaseDate = new Date();
        
    }
    
    
}
