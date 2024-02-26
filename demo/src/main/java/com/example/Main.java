package com.example;

public class Main {
  public static void main(String[] args) {
    Comportamiento comportamiento1 = new ComportamientoConcreto1();
    Comportamiento comportamiento2 = new ComportamientoConcreto2();

    Contexto contexto = new Contexto(comportamiento1);
    contexto.ejecutarComportamiento();

    contexto = new Contexto(comportamiento2);
    contexto.ejecutarComportamiento();
  }
}
