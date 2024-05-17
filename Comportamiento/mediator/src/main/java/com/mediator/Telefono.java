package com.mediator;

public class Telefono {
  private Mediator mediator;
  private boolean musicaOn = false;

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void recibeLlamada() {
    mediator.apagaRadio();
  }

  public void enciendeMusica() {
    musicaOn = true;
  }

  public void apagaMusica() {
    musicaOn = false;
  }

  public boolean musicaEncendida() {
    return musicaOn;
  }
}