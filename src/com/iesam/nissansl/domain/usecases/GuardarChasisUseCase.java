package com.iesam.nissansl.domain.usecases;

import com.iesam.nissansl.data.ChasisDataStore;
import com.iesam.nissansl.domain.models.Chasis;

public class GuardarChasisUseCase {

    private ChasisDataStore dataStore = ChasisDataStore.getChasisDataStore();

    public void execute(Chasis chasis) {
        dataStore.guardar(chasis);
    }
}
