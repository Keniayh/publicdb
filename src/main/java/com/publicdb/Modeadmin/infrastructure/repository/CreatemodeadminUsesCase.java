package com.publicdb.Modeadmin.infrastructure.repository;

import com.publicdb.Modeadmin.domain.entity.Modeadmin;
import com.publicdb.Modeadmin.domain.service.Modeadminservice;

public class CreateModeadminUsesCase {
    private final Modeadminservice modeadminservice;

    public CreateAdminmodeUsesCase(AdminmodeService adminmodeService) {
        this.modeadminService = modeadminService;
    }

    public void execute(Modeadmin modeadmin) {
        modeadminService.createModeadmin
    }
}
