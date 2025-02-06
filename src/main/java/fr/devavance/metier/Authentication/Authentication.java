/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.devavance.metier.Authentication;

import fr.devavance.metier.beans.User;

/**
 *
 * @author kn_19
 */
public class Authentication {

      
    private Users usersRegisteredInDatabase = new Users();

    public Authentication(){
        // Utilisateurs autorisés à utiliser l'application
        usersRegisteredInDatabase.add(new User("farida", "pass1"));
        usersRegisteredInDatabase.add(new User("paul", "pass2"));
        usersRegisteredInDatabase.add(new User("amina", "pass3"));
        usersRegisteredInDatabase.add(new User("karim", "pass4"));
    }   

    public void authenticate(User userToAuthenticate) {

        int i=usersRegisteredInDatabase.indexOf(userToAuthenticate);


        if (i != -1 ){

            User userFromDatabase = usersRegisteredInDatabase.get(i);

            // Mise à jour du profil de l'utilsateur athentifié
            userToAuthenticate.setProfil(userFromDatabase.getProfil());


            userFromDatabase.setAuth(true); // Enregistrement dans la connexion dans le référentiel des utilisateurs
            userToAuthenticate.setAuth(true);
        }

    }
}
