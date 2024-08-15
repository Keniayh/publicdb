package com.publicdb.Modeadmin.infrastructure.controller;

import java.text.*;
import java.util.*;
import java.util.Optional;
import com.publicdb.Modeadmin.domain.entity.Modeadmin;

public class ModeadminController {
    private ModeadminService modeadminService;
    private CreateModeadminUseCase createModeadminUseCase;
    private FindModeadminUsesCase findModeadminUseCase;

   public ModeadminController() {
        this.modeadminService = new ModeadminRepository();
        this.createModeadminUseCase = new CreateModeadminUseCase(modeadminService);
        this.findModeadminUseCase = new FindModeadminUseCase(modeadminService);
   } 

   public void addAdmin() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter description: ");
            String descriptionmode = scanner.nextLine();

            Modeadmin modeadmin = new Modeadmin();
            modeadmin.setDescriptionmode(descriptionmode);

            createModeadminUseCase.execute(modeadmin);
        }
        System.out.println("Admin created successfully");
   }
   public void findModeadmin() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Admin id: ");
            int id = scanner.nextInt();
            findModeadminUseCase.execute(id).ifPresentOrElse(
                modeadminfound -> {
                    System.out.println("Este es el del admin");
                    System.out.println(MessageFormat.format("{0}", modeadminfound.getDescriptionmode()));           
                },
                () -> {

            });
        }catch (Exception e) {
            e.printStackTrace();
        }
   }
}
