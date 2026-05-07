package dev.java10x.MagicFridgeAI.controller;
import dev.java10x.MagicFridgeAI.model.FoodItem;
import dev.java10x.MagicFridgeAI.service.FoodItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodItemController {

    private final FoodItemService service;

    public FoodItemController(FoodItemService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FoodItem> criar(@RequestBody FoodItem food){
        FoodItem salvo = service.salvar();
        return ResponseEntity.ok(salvo);
    }

    //UPDATE

    //DELETE
}
