package dev.java10x.MagicFridgeAI.controller;
import dev.java10x.MagicFridgeAI.model.FoodItem;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/food")
public class FoodItemController {

    //Boas vindas
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Boas vindas, aplicação rodando.";
    }

    //GET
    @GetMapping("/listar")
    public String listarFood(){
        return "Listagem dos alimentos.";
    }

    @GetMapping("/listar/{id}")
    public String listarFoodPorID(@PathVariable Long id){
        return "Listagem dos alimentos por id";
    }

    //POST
    @PostMapping("/salvar")
    public String salvarFood(@RequestBody FoodItem food){
        return "Salvar alimento";
    }

    //UPDATE
    @PatchMapping("/alterar/{id}")
    public String alterarFood(@PathVariable Long id){
        return "Alterar alimento";
    }

    //DELETE
    @DeleteMapping("/deletar/{id}")
    public String deletarFood(@PathVariable Long id){
        return "Deletar alimento";
    }
}
