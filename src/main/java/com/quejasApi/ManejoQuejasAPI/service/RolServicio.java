package com.quejasApi.ManejoQuejasAPI.service;

import com.quejasApi.ManejoQuejasAPI.model.Rol;

public interface RolServicio {

    Rol findByNombre(String nombre);
}
