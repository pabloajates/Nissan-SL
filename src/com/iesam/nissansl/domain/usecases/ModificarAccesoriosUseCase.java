package com.iesam.nissansl.domain.usecases;

import com.iesam.nissansl.data.AccesoriosDataStore;
import com.iesam.nissansl.domain.models.Accesorios;

public class ModificarAccesoriosUseCase {
    private AccesoriosDataStore dataStore = AccesoriosDataStore.getAccesoriosDataStore();

    public Accesorios execute(Accesorios cod) {
        return dataStore.modificar(cod);
    }
}
