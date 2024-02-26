package com.example;

public class Contexto {
  private Comportamiento comportamiento;

  public Contexto(Comportamiento comportamiento) {
    this.comportamiento = comportamiento;
  }

  public void ejecutarComportamiento() {
    comportamiento.ejecutar();
  }
}
