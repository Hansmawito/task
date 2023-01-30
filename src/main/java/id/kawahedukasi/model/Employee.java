package id.kawahedukasi.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

@Entity
@Table(name = "employee")

public class Employee extends PanacheEntityBase {
    @Id
    @SequenceGenerator(name = "employeeSequence",
    sequenceName = "employee_sequence",
    initialValue = 1,
    allocationSize = 1)
    @GeneratedValue(generator = "employeeSequence",strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    public Integer id;

    @Column(name = "name")
    public String name;

    @Column(name = "manager_id")
    public Integer manager_id;
}
