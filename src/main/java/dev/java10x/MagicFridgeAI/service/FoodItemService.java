package dev.java10x.MagicFridgeAI.service;
import dev.java10x.MagicFridgeAI.dto.FoodItemDTO;
import dev.java10x.MagicFridgeAI.mapper.FoodItemMapper;
import dev.java10x.MagicFridgeAI.model.FoodItem;
import dev.java10x.MagicFridgeAI.repository.FoodItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FoodItemService {

    private final FoodItemRepository repository;

    public FoodItemService(FoodItemRepository repository) {
        this.repository = repository;
    }

    //Listar todos os alimentos
    public List<FoodItemDTO> listarFood(){

        List<FoodItem> foodList = repository.findAll();
        return foodList.stream()
                .map(FoodItemMapper::toDTO)
                .toList();
    }

    //Listar alimento pelo id
    public FoodItemDTO listarFoodPorID(Long id){

        FoodItem food = repository.findById(id).orElse(null);

        if(food != null){
            return FoodItemMapper.toDTO(food);
        }

        return null;
    }

    //Criar alimento
    public FoodItem criarFood(FoodItem food){
        return repository.save(food);
    }

    //Alterar alimento
    public FoodItem alterarFood(Long id, FoodItem food){

        FoodItem foodExistente = repository.findById(id).orElse(null);

        if(foodExistente != null){

            if(food.getNome() != null){
                foodExistente.setNome(food.getNome());
            }

            if(food.getCategoria() != null){
                foodExistente.setCategoria(food.getCategoria());
            }

            if(food.getQuantidade() != null){
                foodExistente.setQuantidade(food.getQuantidade());
            }

            if(food.getValidade() != null){
                foodExistente.setValidade(food.getValidade());
            }

            return repository.save(foodExistente);
        }

        return null;
    }

    //Deletar Alimento
    public void deletarFood(Long id){
        repository.deleteById(id);
    }

}
