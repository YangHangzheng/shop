package com.yanghz.mechant.controller;

import com.yanghz.mechant.model.Mechant;
import com.yanghz.mechant.service.MechantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yanghangzheng
 * @date 2019/7/5 15:51
 */

@Controller
@RequestMapping("/mechant")
public class MechantController {

    @Autowired
    MechantService mechantService;


    @GetMapping("/tomechantregistration")
    public String toUserRegistration() {
        return "/mechant/mechantregistration";
    }

    @PostMapping("/mechantregistration")
    public void insertUserInfo(Mechant mechant) {
        mechantService.insertMechant(mechant);
    }

    @GetMapping("/tomechantupdate")
    public String toMechantUpdate(int id, Model model) {
        Mechant mechant = mechantService.findMechantById(id);
        model.addAttribute("mechant", mechant);
        return "/mechant/mechantupdate";
    }

    @PostMapping("/mechantupdate")
    public void mechantupdate(Mechant mechant) {
        mechantService.updateMechant(mechant);
    }

    @GetMapping("/findmechantbyid")
    public String findMechantById(int id, Model model) {
        Mechant mechant = mechantService.findMechantById(id);
        model.addAttribute("mechant", mechant);
        return "/mechant/mechantinfo";
    }

    @PostMapping("/mechantupdatestatus")
    public void updateMechantStatus(int id, int aduitStatus) {
        mechantService.updateMechantStatus(id, aduitStatus);
    }

    @GetMapping("/tomechantupdatestatus")
    public String toUpdateMechantStatus(int id, Model model) {
        Mechant mechant = mechantService.findMechantById(id);
        model.addAttribute("mechant", mechant);
        return "/mechant/mechantupdatestatus";
    }

    @PostMapping("/mechantupdatesoldout")
    public void updateMechantSoldout(int id, int soldOut) {
        mechantService.updateMechantSoldout(id, soldOut);
    }

    @GetMapping("/tomechantupdatesoldout")
    public String toUpdateMechantSoldout(int id, Model model) {
        Mechant mechant = mechantService.findMechantById(id);
        model.addAttribute("mechant", mechant);
        return "/mechant/mechantupdatesoldout";
    }

}
