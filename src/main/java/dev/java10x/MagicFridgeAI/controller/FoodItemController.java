package dev.java10x.MagicFridgeAI.controller;
import dev.java10x.MagicFridgeAI.model.FoodItem;
import dev.java10x.MagicFridgeAI.service.FoodItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodItemController {

    private final FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    //POST
    @PostMapping("/criar")
    public FoodItem criarFood(@RequestBody FoodItem food){
        return service.criarFood(food);
    }

    //GET
    @GetMapping("/listar")
    public List<FoodItem> listarFood(){
        return service.listarFood();
    }

    @GetMapping("/listar/{id}")
    public FoodItem listarFoodPorID(@PathVariable Long id){
        return service.listarFoodPorID(id);
    }

    //UPDATE
    @PatchMapping("/alterar/{id}")
    public FoodItem alterarFood(@PathVariable Long id, @RequestBody FoodItem food){
        return service.alterarFood(id, food);
    }

    //DELETE
    @DeleteMapping("/deletar/{id}")
    public void deletarFood(@PathVariable Long id){
        service.deletarFood(id);
    }
}
