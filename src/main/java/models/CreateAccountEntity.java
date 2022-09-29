package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateAccountEntity {

    private String identification;
    private String name;
    private String lastName;
    private String birthDate;
    private String genre;
    private String phoneNumber;
    private String email;
    protected String password;

}
