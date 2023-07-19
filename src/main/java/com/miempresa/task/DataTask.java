package com.miempresa.task;

/**
 *
 * @author fullfontJ
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
