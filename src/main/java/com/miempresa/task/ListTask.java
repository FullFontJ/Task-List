/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.task;

/**
 *
 * @author asus
 */
public class ListTask {
    private int tarea;
    private String titulo;
    private String Descripcion;
    private int Estado;

    public ListTask(int tarea, String titulo, String Descripcion, int Estado) {
        this.tarea = tarea;
        this.titulo = titulo;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
    }

    public int getTarea() {
        return tarea;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
}
