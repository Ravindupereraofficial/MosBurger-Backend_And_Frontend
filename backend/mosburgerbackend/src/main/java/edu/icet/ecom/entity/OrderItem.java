package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Item item;
    private Integer quantity;
    private Double priceAtOrder;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}