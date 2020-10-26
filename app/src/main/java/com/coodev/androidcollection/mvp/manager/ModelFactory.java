package com.coodev.androidcollection.mvp.manager;

import com.coodev.androidcollection.mvp.model.BaseModel;
import com.coodev.androidcollection.mvp.model.IBaseModel;

/**
 * 创建Model的工厂类
 * @author patrick.ding
 * @date 18/6/22
 */

public class ModelFactory {
    public static IBaseModel build(String token){
        BaseModel baseModel = null;
        try{
            baseModel = (BaseModel) Class.forName(token).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return baseModel;
    }
}
