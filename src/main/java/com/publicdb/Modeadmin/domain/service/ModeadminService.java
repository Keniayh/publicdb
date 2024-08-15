package com.publicdb.Modeadmin.domain.service;

import com.publicdb.Modeadmin.domain.entity.Modeadmin;
import java.util.Optional;

public interface ModeadminService {
    void createModeadmin (Modeadmin modeadmin);
    Optional<Modeadmin> findModeadminById(int id);
    void update(int id);
}
