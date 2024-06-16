package pe.edu.cibertec.api_rest_ventas.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryid;
    // Solo se pone la anotación "column" si el nombre de la variable es diferente
    // al nombre del campo respectivo en la base de datos
    // @Column(name="categoryname")
    private String categoryname;
    private String description;

}
