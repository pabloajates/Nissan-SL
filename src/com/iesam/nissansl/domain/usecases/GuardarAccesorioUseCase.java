package com.iesam.nissansl.domain.usecases;

import com.iesam.nissansl.data.AccesoriosDataStore;
import com.iesam.nissansl.data.ChasisDataStore;
import com.iesam.nissansl.domain.models.Accesorios;
import com.iesam.nissansl.domain.models.Chasis;

public class GuardarAccesorioUseCase {

    private static AccesoriosDataStore dataStore = AccesoriosDataStore.getAccesoriosDataStore();

    public static void execute(Accesorios accesorios) {
        dataStore.guardar(accesorios);
    }
}
