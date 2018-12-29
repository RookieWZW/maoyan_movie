package com.stylefeng.guns.rest.modular.film.vo;

import lombok.Data;

/**
 * Created by RookieWangZhiWei on 2018/12/29.
 */
@Data
public class FilmRequestVO {

    private Integer showType=1;
    private Integer sortId=1;
    private Integer sourceId=99;
    private Integer catId=99;
    private Integer yearId=99;
    private Integer nowPage=1;
    private Integer pageSize=18;
}
