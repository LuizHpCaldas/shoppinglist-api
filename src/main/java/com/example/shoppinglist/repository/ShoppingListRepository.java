package com.example.shoppinglist.repository;

import com.example.shoppinglist.model.ShoppingList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, por exemplo:
    // List<ShoppingList> findByUserId(Long userId);
}
