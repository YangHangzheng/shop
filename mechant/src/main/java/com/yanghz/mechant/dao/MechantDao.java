package com.yanghz.mechant.dao;

import com.yanghz.mechant.mapper.MechantMapper;
import com.yanghz.mechant.model.Mechant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yanghangzheng
 * @date 2019/7/5 15:48
 */

@Component
public class MechantDao {

    @Autowired
    MechantMapper mechantMapper;

    public void insertMechant(Mechant mechant) {
        mechantMapper.insertMechant(mechant);
    }

    public void updateMechant(Mechant mechant) {
        mechantMapper.updateMechant(mechant);
    }

    public Mechant findMechantById(int id) {
        return mechantMapper.findMechantById(id);
    }

    public void updateMechantStatus(Mechant mechant) {
        mechantMapper.updateMechantStatus(mechant);
    }

    public void updateMechantSoldout(Mechant mechant) {
        mechantMapper.updateMechantSoldout(mechant);
    }
}
