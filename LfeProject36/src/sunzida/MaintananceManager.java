/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sunzida;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class MaintananceManager extends User implements Serializable {
    
    public MaintananceManager(String username, String email, String name, String password, String contNo, String gender, String usertype, int id, LocalDate dateOfBirth) {
        super(username, email, name, password, contNo, gender, usertype, id, dateOfBirth);
    }
    
    
    
}
