package dev.java10x.MagicFridgeAI.service;
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
    public List<FoodItem> listarFood(){
        return repository.findAll();
    }

    //Listar alimento pelo id
    public FoodItem listarFoodPorID(Long id){
        return repository.findById(id).orElse(null);
    }

    //Criar alimento
    public FoodItem criarFood(FoodItem food){
        return repository.save(food);
    }

    //Alterar alimento
    public FoodItem alterarFood(Long id, FoodItem food){
        if(repository.existsById(id)){
            food.setId(id);
            return repository.save(food);
        }

        return null;
    }

    //Deletar Alimento
    public void deletarFood(Long id){
        repository.deleteById(id);
    }

}
