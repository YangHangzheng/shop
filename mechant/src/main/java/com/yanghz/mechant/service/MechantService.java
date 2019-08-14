package com.yanghz.mechant.service;

import com.yanghz.mechant.dao.MechantDao;
import com.yanghz.mechant.model.Mechant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yanghangzheng
 * @date 2019/7/5 15:50
 */

@Service
public class MechantService {

    @Autowired
    MechantDao mechantDao;

    public void insertMechant(Mechant mechant) {
        mechantDao.insertMechant(mechant);
    }

    public void updateMechant(Mechant mechant) {
        mechantDao.updateMechant(mechant);
    }

    public Mechant findMechantById(int id) {
        return mechantDao.findMechantById(id);
    }

    public void updateMechantStatus(int id, int status) {
        Mechant mechant = new Mechant();
        mechant.setId(id);
        mechant.setAduitStatus(status);
        mechantDao.updateMechantStatus(mechant);
    }

    public void updateMechantSoldout(int id, int soldOut) {
        Mechant mechant = new Mechant();
        mechant.setId(id);
        mechant.setSoldOut(soldOut);
        mechantDao.updateMechantSoldout(mechant);
    }

}
