package org.example.apisgtics.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "equipos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class equiposModel {
    @Id
    private Long id;
    private String nombre;
    private String area;
}