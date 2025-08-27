package br.com.pepo.notasproject.Repositories;

import br.com.pepo.notasproject.Entities.UsuariosEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositories extends JpaRepository<UsuariosEntities, Integer> {
}
