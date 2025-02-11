/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.devavance.metier.beans;

import fr.devavance.metier.TypeSeance.TypeSeance;
import lombok.Data;

/**
 *
 * @author kn_13
 */
@Data
public class Seance {
    private TypeSeance type;
    private String intitule;
    private String contenu;
    
}
