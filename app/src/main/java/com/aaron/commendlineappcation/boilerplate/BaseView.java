package com.aaron.commendlineappcation.boilerplate;

public class BaseView {
    private BaseController mBaseController;
    private BaseModel mBaseModel;
    public void setController(BaseController baseController){
        mBaseController = baseController;
    }
    public void setModel(BaseModel baseModel){
        mBaseModel = baseModel;
    }
}
