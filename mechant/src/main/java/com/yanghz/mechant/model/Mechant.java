package com.yanghz.mechant.model;

import lombok.Data;

/**
 * @author yanghangzheng
 * @date 2019/7/5 9:04
 */

@Data
public class Mechant {
    private Integer id;
    private String mechantName;
    private String mechantShopName;
    private String mechantPassword;
    private String mechantScope;
    private String mechantAccount;
    private Integer aduitStatus;
    private Integer soldOut;

}
