package com.mediator;

public class Coche {
  private Mediator mediator;

  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  public void enciende() {
    mediator.enciendeCoche();
  }

  public void apaga() {
    mediator.apagaCoche();
  }
}