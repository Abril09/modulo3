package com.example.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public  class User extends BaseObservable {
    private  Boolean register;
    private  String lastName;

    @Bindable
    public Boolean getRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
        this.notifyPropertyChanged(BR.register);
    }

    @Bindable
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
