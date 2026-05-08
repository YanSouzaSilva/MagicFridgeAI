package dev.java10x.MagicFridgeAI.service;
import dev.java10x.MagicFridgeAI.model.FoodItem;
import dev.java10x.MagicFridgeAI.repository.FoodItemRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
        Optional<FoodItem> idFood = repository.findById(id);
        return idFood.orElse(null);
    }

}
