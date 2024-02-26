package prototype;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// package prototype;

/**
 *
 * @author Alan Alexander Perez (2023-1069)
 * 
 *         Fecha: 25-2-2024
 *         Version: 1.0
 * 
 *         Organizacion del codigo: Clase que implementa interfaz "Documento" y
 *         donde se extraen los metodos
 *         deseados
 */

// Interfaz para integrar distintas implementaciones del mismo Documento
interface Documento {
  Documento clonar();

  void setContenido(String contenido);

  void imprimirContenido();
}

class DocumentoImpl implements Documento {
  private String contenido;

  // Constructores para crear instancia con contenido asignado
  public DocumentoImpl() {
    this.contenido = "";
  }

  public DocumentoImpl(DocumentoImpl documento) {
    this.contenido = documento.contenido;
  }

  // Metodos anulados de la interfaz para crear los clones de instancias.
  @Override
  public Documento clonar() {
    return new DocumentoImpl(this);
  }

  @Override
  public void setContenido(String contenido) {
    this.contenido = contenido;
  }

  @Override
  public void imprimirContenido() {
    System.out.println(contenido);
  }
}