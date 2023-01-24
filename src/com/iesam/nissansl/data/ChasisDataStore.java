package com.iesam.nissansl.data;

import com.iesam.nissansl.domain.models.Chasis;

import java.util.Map;
import java.util.TreeMap;

public class ChasisDataStore {

    private static ChasisDataStore chasisDataStore = null;

    private Map<Integer, Chasis> dataStore = new TreeMap<Integer, Chasis>();

    public void guardar(Chasis chasis) {
        dataStore.put(chasis.getCodBastidor(), chasis);
    }

    public void eliminar(Integer CodBastidor) {
        dataStore.remove(CodBastidor);
    }

    public Chasis buscar(String CodBastidor) {
        return dataStore.get(CodBastidor);
    }

    public void modificar(Chasis chasis) {
        dataStore.put(chasis.getCodBastidor(), chasis);
    }

    public static ChasisDataStore getChasisDataStore() {
        if (chasisDataStore == null) {
            chasisDataStore = new ChasisDataStore();
        }
        return chasisDataStore;
    }
}
