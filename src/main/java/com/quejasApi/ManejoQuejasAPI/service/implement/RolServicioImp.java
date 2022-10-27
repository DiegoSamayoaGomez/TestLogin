package com.quejasApi.ManejoQuejasAPI.service.implement;


import com.quejasApi.ManejoQuejasAPI.model.Rol;
import com.quejasApi.ManejoQuejasAPI.repository.RolRepository;
import com.quejasApi.ManejoQuejasAPI.service.RolServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "rolServicio")
public class RolServicioImp implements RolServicio {
    @Autowired
    private RolRepository rolRepository;

    public Rol findByNombre(String nombre) {
        Rol rol = rolRepository.finRolByNombre(nombre);
        return rol;
    }


}
