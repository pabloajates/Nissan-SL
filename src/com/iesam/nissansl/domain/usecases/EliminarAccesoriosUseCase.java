package com.iesam.nissansl.domain.usecases;

import com.iesam.nissansl.data.AccesoriosDataStore;
import com.iesam.nissansl.data.ChasisDataStore;
import com.iesam.nissansl.domain.models.Accesorios;
import com.iesam.nissansl.domain.models.Chasis;

public class EliminarAccesoriosUseCase {

    private AccesoriosDataStore dataStore = AccesoriosDataStore.getAccesoriosDataStore();

    public Accesorios execute(Integer cod) {
        return dataStore.eliminar(cod);
    }
}
