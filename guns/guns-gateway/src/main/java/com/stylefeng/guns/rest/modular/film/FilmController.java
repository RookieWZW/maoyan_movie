package com.stylefeng.guns.rest.modular.film;

import com.stylefeng.guns.rest.modular.film.vo.FilmIndexVO;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by RookieWangZhiWei on 2018/12/27.
 */
@Controller
@RequestMapping("/film/")
public class FilmController {
    private static final String img_pre = "http://img.meetingshop.cn/";


   @RequestMapping(value = "getIndex",method = RequestMethod.GET)
    public ResponseVO<FilmIndexVO> getIndex(){


       FilmIndexVO filmIndexVO = new FilmIndexVO();

       filmIndexVO.setBanners();

   }
}
