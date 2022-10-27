package com.quejasApi.ManejoQuejasAPI.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;

public class UsuarioDto {


    private String username;

    private String password;

    private String apellido;

    private String nombre;

    private String email;

    private String dpi;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public Usuario getUsuarioFromDto(){
        Usuario usuario = new Usuario();
        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setApellido(apellido);
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setDpi(dpi);

        return usuario;

    }
}
