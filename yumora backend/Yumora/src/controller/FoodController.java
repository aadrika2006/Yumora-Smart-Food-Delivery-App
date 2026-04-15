package src.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import src.model.FoodItem;
import src.reprository.FoodRepository;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    FoodRepository repo;

    @GetMapping
    public List<FoodItem> getAllFood() {
        return repo.findAll();
    }

    @PostMapping
    public FoodItem addFood(@RequestBody FoodItem food) {
        return repo.save(food);
    }
}
