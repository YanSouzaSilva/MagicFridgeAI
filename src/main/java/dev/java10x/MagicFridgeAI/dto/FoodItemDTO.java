package dev.java10x.MagicFridgeAI.dto;
import dev.java10x.MagicFridgeAI.enums.Categoria;
import java.time.LocalDateTime;

public class FoodItemDTO {

    private Long id;
    private String nome;
    private Categoria categoria;
    private Integer quantidade;
    private LocalDateTime validade;

}
