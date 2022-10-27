package com.quejasApi.ManejoQuejasAPI.repository;

import com.quejasApi.ManejoQuejasAPI.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

    Usuario findByUsername(String username);

}
