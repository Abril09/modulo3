package com.example.g6;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Operation extends BaseObservable {
    private String suma;
    private String total;

    @Bindable
    public String getSuma() {
        return suma;
    }

    public void setSuma(String suma) {
       this.suma = suma;
       this.setTotal(this.suma);
        notifyPropertyChanged(BR.suma);
    }

    @Bindable
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        total = total.replaceAll("[^0-9]","");
        this.total = this.calculeTotal(total.toCharArray());
        notifyPropertyChanged(BR.total);
    }

    private String calculeTotal(char ...args){
        int total=0;
        for ( char number:args) {
            total =Character.getNumericValue(number) + total;
        }
        return String.valueOf(total);
    }

}
