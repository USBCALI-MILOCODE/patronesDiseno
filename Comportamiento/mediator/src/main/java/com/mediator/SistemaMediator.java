package com.mediator;

public class SistemaMediator implements Mediator {

  private Coche coche;
  private Radio radio;
  private Telefono telefono;

  public void setCoche(Coche coche) {
    this.coche = coche;
  }

  public void setRadio(Radio radio) {
    this.radio = radio;
  }

  public void setTelefono(Telefono telefono) {
    this.telefono = telefono;
  }

  @Override
    public void enciendeCoche() {
        radio.enciende();
        telefono.apagaMusica();
    }

    @Override
    public void apagaCoche() {
        radio.apaga();
    }

    @Override
    public void enciendeRadio() {
        radio.enciende();
    }

    @Override
    public void apagaRadio() {
        radio.apaga();
    }

    @Override
    public void recibeLlamadaTelefono() {
        radio.apaga();
    }

    @Override
    public void enciendeMusicaTelefono() {
        telefono.enciendeMusica();
    }

    @Override
    public void apagaMusicaTelefono() {
        telefono.apagaMusica();
    }

}
