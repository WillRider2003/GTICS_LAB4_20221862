package org.example.apisgtics.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "endpoints")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class endpointsModel {
    @Id
    private Long id;
    private String ruta;
    private String metodo_http;
    private String descripcion;
    private Long api_id;
}