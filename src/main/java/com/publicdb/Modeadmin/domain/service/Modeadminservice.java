package com.publicdb.Modeadmin.domain.service;

public interface Modeadminservice {
    void createModeadmin (Modeadmin modeadmin);
    Optional<Modeadmin> findModeadminById(int id);
    void update(int id);
}
