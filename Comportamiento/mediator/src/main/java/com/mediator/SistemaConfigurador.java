package com.mediator;

public class SistemaConfigurador {

    private Coche coche;
    private Radio radio;
    private Telefono telefono;
    private SistemaMediator mediator;

    public void configurarSistema() {
        // Crear instancia del Mediator
        mediator = new SistemaMediator();

        // Crear instancias de Coche, Radio y Telefono
        coche = new Coche();
        radio = new Radio();
        telefono = new Telefono();

        // Configurar el Mediator en cada uno de los componentes
        coche.setMediator(mediator);
        radio.setMediator(mediator);
        telefono.setMediator(mediator);

        // Configurar las dependencias del Mediator
        mediator.setCoche(coche);
        mediator.setRadio(radio);
        mediator.setTelefono(telefono);
    }

    public void probarSistema() {
        // Probar algunas funcionalidades
        System.out.println("Estado inicial:");
        System.out.println("Radio encendida: " + radio.encendida());
        System.out.println("Música del teléfono encendida: " + telefono.musicaEncendida());

        // Encender el coche
        System.out.println("\nEncendiendo el coche...");
        coche.enciende();
        System.out.println("Radio encendida: " + radio.encendida());
        System.out.println("Música del teléfono encendida: " + telefono.musicaEncendida());

        // Recibir una llamada
        System.out.println("\nRecibiendo una llamada...");
        telefono.recibeLlamada();
        System.out.println("Radio encendida: " + radio.encendida());

        // Apagar el coche
        System.out.println("\nApagando el coche...");
        coche.apaga();
        System.out.println("Radio encendida: " + radio.encendida());
    }
}
