package org.example.apisgtics.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "apis")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class apisModel {
    @Id
    private Long id;
    private String nombre;
    private String version;
    private Date fecha_registro;
    private String estado;
    private Long equipo_id;
}
