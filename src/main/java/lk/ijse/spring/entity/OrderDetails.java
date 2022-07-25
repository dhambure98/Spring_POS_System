package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author : A.D.Liyanage
 * @since : 0.1.0
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@IdClass(OrderItem_PK.class)
public class OrderDetails {

    @Id
    private String oId;
    @Id
    private String iCode;
    private int qty;
    private double unitPrice;
    private double total;

    @ManyToOne
    @JoinColumn(name = "oId",referencedColumnName = "oId",insertable = false,updatable = false)
    private Orders orders;
    @ManyToOne
    @JoinColumn(name = "iCode",referencedColumnName = "code",insertable = false,updatable = false)
    private Item items;


}
