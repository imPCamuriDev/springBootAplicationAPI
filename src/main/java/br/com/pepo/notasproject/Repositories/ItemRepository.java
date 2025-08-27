package br.com.pepo.notasproject.Repositories;

import br.com.pepo.notasproject.Entities.ItemsEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemsEntities, Integer> {
}
