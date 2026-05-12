package dev.java10x.MagicFridgeAI.mapper;
import dev.java10x.MagicFridgeAI.dto.FoodItemDTO;
import dev.java10x.MagicFridgeAI.model.FoodItem;

public class FoodItemMapper {

    public static FoodItemDTO toDTO(FoodItem foodItem) {

        FoodItemDTO dto = new FoodItemDTO();

        dto.setId(foodItem.getId());
        dto.setNome(foodItem.getNome());
        dto.setQuantidade(foodItem.getQuantidade());
        dto.setCategoria(foodItem.getCategoria());
        dto.setValidade(foodItem.getValidade());

        return dto;
    }

    public static FoodItem toEntity(FoodItemDTO foodItemDTO){
        FoodItem foodItem = new FoodItem();

        foodItem.setId(foodItemDTO.getId());
        foodItem.setNome(foodItemDTO.getNome());
        foodItem.setQuantidade(foodItemDTO.getQuantidade());
        foodItem.setCategoria(foodItemDTO.getCategoria());
        foodItem.setValidade(foodItemDTO.getValidade());

        return foodItem;
    }

}
