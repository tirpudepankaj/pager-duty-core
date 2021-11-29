package pager.duty.core.entity;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;
import java.util.List;


@Table(name = "team")
@Entity(name = "Team")
@SequenceGenerator(name = "seq_team",
        sequenceName = "seq_team")

@Builder
@Value
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_team")
    private long id;

    private String name;

    private String email;

    @ManyToOne
    private Developer lead;

    @OneToMany
    private List<Developer> developers;


}
