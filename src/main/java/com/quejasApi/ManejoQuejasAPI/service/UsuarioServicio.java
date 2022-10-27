package com.quejasApi.ManejoQuejasAPI.service;

import com.quejasApi.ManejoQuejasAPI.model.Usuario;
import com.quejasApi.ManejoQuejasAPI.model.UsuarioDto;

import java.util.List;

public interface UsuarioServicio {

    Usuario save(UsuarioDto usuario);

    List<Usuario> findAll();

    Usuario findOne(String username);


}
