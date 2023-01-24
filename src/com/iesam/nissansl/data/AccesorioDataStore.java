package com.iesam.nissansl.data;

import com.iesam.nissansl.domain.models.Accesorios;

import java.util.Map;
import java.util.TreeMap;

public class AccesorioDataStore {

    private static AccesorioDataStore accesorioDataStore = null;

    private Map<String, Accesorios> dataStore = new TreeMap<>();

    public void guardar(Accesorios accesorios) {
        dataStore.put(accesorios.getCod(), accesorios);
    }

    public void eliminar(Integer Cod) {
        dataStore.remove(Cod);
    }

    public Accesorios buscar(Integer Cod) {
        return dataStore.get(Cod);
    }

    public void modificar(Accesorios accesorios) {
        dataStore.put(accesorios.getCod(), accesorios);
    }

    public static AccesorioDataStore accesorioDataStore() {
        if (accesorioDataStore == null) {
            accesorioDataStore = new AccesorioDataStore();
        }
        return accesorioDataStore;
    }
}
