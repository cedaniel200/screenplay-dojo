package com.cedaniel200.screenplay.dojo.model;

import com.cedaniel200.screenplay.dojo.exception.UsuarioEstadoIlegalException;

import static com.cedaniel200.screenplay.dojo.util.ValidadorString.esVacioONulo;

public class Usuario {

    private final String usuario;
    private final String contrasena;

    public Usuario(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        validarEstado();
    }

    private void validarEstado() {
        if(esVacioONulo(usuario) || esVacioONulo(contrasena)){
            throw new UsuarioEstadoIlegalException(
                    String.format("Usuario (%s) o contrasena (%s) inválidos", usuario, contrasena)
            );
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}
