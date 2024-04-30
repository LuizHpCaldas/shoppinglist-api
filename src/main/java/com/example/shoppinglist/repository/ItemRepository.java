package com.example.shoppinglist.repository;

import com.example.shoppinglist.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
    // Métodos adicionais de consulta podem ser adicionados aqui, por exemplo:
    // List<Item> findByShoppingListId(Long shoppingListId);
}
