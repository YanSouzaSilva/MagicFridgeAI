package dev.java10x.MagicFridgeAI.model;
import dev.java10x.MagicFridgeAI.enums.Categoria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_food")
@AllArgsConstructor
@NoArgsConstructor
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private Integer quantidade;

    private LocalDateTime validade;
}
