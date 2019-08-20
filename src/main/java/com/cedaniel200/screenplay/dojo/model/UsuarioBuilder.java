package com.cedaniel200.screenplay.dojo.model;

public class UsuarioBuilder {

    private String usuario;
    private String contrasena;

    private UsuarioBuilder(String usuario) {
        this.usuario = usuario;
    }

    public static UsuarioBuilder nombreDeUsuario(String usuario){
        return new UsuarioBuilder(usuario);
    }

    public Usuario yContrasena(String contrasena) {
        this.contrasena = contrasena;
        return new Usuario(usuario, contrasena);
    }
}
