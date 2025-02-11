/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import fr.devavance.metier.beans.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author kn_13
 */
public class TestUser {
    @Test
    public void check_when_user_is_equals(){
        // Arrange
        User user1 = new User("mohamed", "mdp1");
        User user2 = new User("mohamed", "mdp1");
        
        // Act
        Boolean actual = user1.equals(user1);
        Boolean expected = true;
        
        Boolean actual1 = user1.equals(user2);
        Boolean expected1 = false;
        
        // Assert
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
    }
    
    @Test
    public void return_correct_username_and_password_when_user_is_created() {
        // Arrange
        User user1 = new User("mohamed", "mdp1");
        
        // Act
        String actual = user1.getUserName();
        String expected = "mohamed";
        
        String actual1 = user1.getPassword();
        String expected1 = "mdp1";
        
        String actual2 = user1.getPassword();
        String expected2 = "abc";
        
        // Assert
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
        Assertions.assertNotEquals(actual2, expected2);
    }
    
}
