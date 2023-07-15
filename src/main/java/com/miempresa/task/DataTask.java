/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miempresa.task;

/**
 *
 * @author asus
 */

import java.util.ArrayList;
import java.util.List;

public class DataTask {
    private static List<ListTask> listaTareas = new ArrayList<>();

    public DataTask() {
        listaTareas = new ArrayList<>();
    }

    public static void agregarUsuario(ListTask task) {
        listaTareas.add(task);
    }

    public static List<ListTask> obtenerUsuarios() {
        return listaTareas;
    }

}
