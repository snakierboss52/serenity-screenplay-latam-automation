package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateAccount {

    private String country;
    private String documentType;
    private int identification;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String genre;
    private String phoneNumber;
    private String email;
    protected String password;

}
