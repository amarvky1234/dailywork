package com.mto.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Project implements Serializable {
    @Id
    @Column(name = "project_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectNo;
    private String title;
    private int duration;
    private String client;
    private double budget;
}
