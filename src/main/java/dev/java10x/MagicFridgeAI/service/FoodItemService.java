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

    private FoodItem salvar(FoodItem food){
        return repository.save(food);
    }

    private List<FoodItem> listar(){
        return repository.findAll();
    }
}
