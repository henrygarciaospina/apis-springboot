package com.prestamos.mongospringboot.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cliente {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String departamento;
    private String ciudad;
    private String direccion;
    private String celular;
}
