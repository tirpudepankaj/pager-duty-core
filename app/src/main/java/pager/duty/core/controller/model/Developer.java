package pager.duty.core.controller.model;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Developer {

    private long id;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;

}
