package com.publicdb.Modeadmin.domain.service;

public interface ModeadminService {
    void createModeadmin (Modeadmin modeadmin);
    Optional<Modeadmin> findModeadminById(int id);
    void update(int id);
}
