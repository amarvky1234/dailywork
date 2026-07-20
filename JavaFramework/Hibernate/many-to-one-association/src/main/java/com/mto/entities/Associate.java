package com.mto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "associate")
public class Associate implements Serializable {
    @Id
    @Column(name = "associate_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int associateNo;
    @Column(name = "full_name")
    private String fullName;
    private String designation;
    private LocalDate doj;
    private int experience;

    @ManyToOne
    @JoinColumn(name = "assigned_project_no", nullable = false)
    private Project assignedProject;
}
