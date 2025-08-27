package br.com.pepo.notasproject.Controllers;

import br.com.pepo.notasproject.Entities.ItemsEntities;
import br.com.pepo.notasproject.Repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    // Criar novo item
    @PostMapping
    public ResponseEntity<ItemsEntities> createItem(@RequestBody ItemsEntities item) {
        ItemsEntities savedItem = itemRepository.save(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }

    // Listar todos os itens
    @GetMapping
    public List<ItemsEntities> getAllItems() {
        return itemRepository.findAll();
    }

    // Buscar item por ID
    @GetMapping("/{id}")
    public ResponseEntity<ItemsEntities> getItemById(@PathVariable Integer id) {
        return itemRepository.findById(id)
                .map(item -> ResponseEntity.ok(item))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
