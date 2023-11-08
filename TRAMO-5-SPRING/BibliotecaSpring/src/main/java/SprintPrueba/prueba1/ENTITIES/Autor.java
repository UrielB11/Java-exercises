
package SprintPrueba.prueba1.ENTITIES;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Autor {

       @Id
        @GeneratedValue(generator = "uuid")
       @GenericGenerator(name = "uuid", strategy = "uuid2")
       private String id;
       @Column(name = "nombre")
       private String nombre;

}
