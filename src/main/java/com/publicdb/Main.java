package com.publicdb;

import com.publicdb.Modeadmin.infrastructure.controller.ModeadminController;

public class Main {
    public static void main(String[] args) {
        ModeadminController consoleAdapter = new ModeadminController();

        consoleAdapter.findModeadmin();
    }
}