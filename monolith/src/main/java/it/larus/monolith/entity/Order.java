package it.larus.monolith.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String product;
    private int quantity;
    private double price;
    private Date orderDate;
}

