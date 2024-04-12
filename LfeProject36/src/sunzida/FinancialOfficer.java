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
public class FinancialOfficer extends User implements Serializable{
    
    public FinancialOfficer(String username, String email, String name, String password, String contNo, String gender, String usertype, int id, LocalDate dateOfBirth, LocalDate dateOfjoinl) {
        super(username, email, name, password, contNo, gender, usertype, id, dateOfBirth, dateOfjoinl);
    }
    
}
