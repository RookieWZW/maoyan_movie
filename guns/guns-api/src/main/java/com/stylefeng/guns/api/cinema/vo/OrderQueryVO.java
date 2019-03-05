package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by RookieWangZhiWei on 2019/3/1.
 */
@Data
public class OrderQueryVO implements Serializable {

    private String cinemaId;
    private String filmPrice;

}
