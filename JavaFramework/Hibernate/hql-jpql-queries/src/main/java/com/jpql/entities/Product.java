package com.jpql.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString(exclude = "manufacturer")
@EqualsAndHashCode(exclude = "manufacturer")
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
@Entity
@Table(name = "product_hql")
@NamedQueries(@NamedQuery(name = "productsGreaterThanPrice", query = "from Product p where p.price > :price"))
@NamedNativeQueries({
        @NamedNativeQuery(name = "productByCategory", query = "select p.product_no, p.product_nm, p.category, p.price from product_hql p where p.category like :category")})
@SqlResultSetMappings({
        @SqlResultSetMapping(name = "BasicProductMapping",
                classes = {@ConstructorResult(targetClass = BasicProduct.class, columns = {
                        @ColumnResult(name = "product_no", type = Integer.class),
                        @ColumnResult(name = "product_nm", type = String.class),
                        @ColumnResult(name = "price", type = Double.class)
                })})
})
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "findProductPrice", procedureName = "find_product_price", resultClasses = {Double.class},
                parameters = {
                        @StoredProcedureParameter(name = "product_no", type = Integer.class, mode = ParameterMode.IN),
                        @StoredProcedureParameter(name = "price", type = Double.class, mode = ParameterMode.OUT)
                }
        )
})
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_no")
    private int productNo;
    @Column(name = "product_nm")
    private String productName;
    private String description;
    private String category;
    private double price;

    @ManyToOne
    @JoinColumn(name = "manufacturer_no", nullable = false)
    private Manufacturer manufacturer;
}
