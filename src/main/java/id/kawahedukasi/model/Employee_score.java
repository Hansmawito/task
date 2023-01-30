package id.kawahedukasi.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "employee_score")
public class Employee_score extends PanacheEntityBase {
    @Id
    @SequenceGenerator(name = "employee_scoreSequence",
            sequenceName = "employeescore_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(generator = "employee_scoreSequence",strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Integer id;

    @Column(name = "nama")
    public String nama;
    @Column(name = "score")
    public Integer score;

}
