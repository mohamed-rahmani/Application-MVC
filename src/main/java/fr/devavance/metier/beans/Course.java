/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.devavance.metier.beans;

import fr.devavance.metier.TypeSeance.TypeSeance;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

/**
 *
 * @author kn_13
 */
@Data
public class Course {
    private Map<TypeSeance, Seance> seances = new HashMap();


    public Seance getCourseFromType(TypeSeance type){
        // On considère qu'il y a qu'une seule seance par type de seance
        return this.seances.get(type); 
    }
}
