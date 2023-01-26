package com.iesam.nissansl.domain.usecases;

import com.iesam.nissansl.data.ChasisDataStore;
import com.iesam.nissansl.domain.models.Chasis;

public class ObtenerChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getChasisDataStore();

    public Chasis execute(Integer codBastidor) {
        return dataStore.buscar(codBastidor);
    }
}
