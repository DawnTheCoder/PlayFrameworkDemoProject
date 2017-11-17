package controllers;

import play.mvc.Result;

import java.util.Date;

import static play.mvc.Results.ok;

/**
 * Created by Chenpengfei on 2017/11/16
 */
public class TimeController {

    public Result time(){
        Date date = new Date();
        return ok("现在的时间是: " + date.toString());
    }

}
