package com.publicdb.Modeadmin.application;

import com.publicdb.Modeadmin.domain.entity.Modeadmin;
import com.publicdb.Modeadmin.domain.service.ModeadminService;
import java.util.Optional;

public class FindModeadminUseCase {
    private final ModeadminService modeadminService;

    public FindModeadminUseCase(ModeadminService modeadminService) {
        this.modeadminService = modeadminService;
    }

    public Optional<Modeadmin> execute(int id) {
        return modeadminService.findModeadminById(id);
    }
}
