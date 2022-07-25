package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : A.D.Liyanage
 * @since : 0.1.0
 **/

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Item {

    @Id
    private String code;
    private String name;
    private int qty;
    private double price;

}
