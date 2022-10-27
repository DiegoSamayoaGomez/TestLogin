package com.quejasApi.ManejoQuejasAPI.repository;

import com.quejasApi.ManejoQuejasAPI.model.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {
    Rol finRolByNombre(String nombre);

}
