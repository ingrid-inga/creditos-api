package ar.com.ada.api.creditos.excepciones;

import ar.com.ada.api.creditos.entities.*;

public class ClienteDNIException extends ClienteInfoException {

    public ClienteDNIException(Cliente cliente, String mensaje) {
        super(cliente, mensaje);
    }
}