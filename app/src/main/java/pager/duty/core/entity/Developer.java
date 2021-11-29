package pager.duty.core.entity;


import lombok.Value;

import javax.persistence.*;

@Entity(name = "Developer")
@Table(name = "developer")
@Value
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_developer")
    private long id;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
}
