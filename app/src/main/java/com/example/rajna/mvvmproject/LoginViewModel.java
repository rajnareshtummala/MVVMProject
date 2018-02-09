package com.example.rajna.mvvmproject;

import android.content.Context;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;
import android.databinding.BaseObservable;

/**
 * Created by rajna on 2/8/2018.
 */

public class LoginViewModel extends BaseObservable {

    private String email;
    private String password;
    private String status;
    private Context mContext;

    String TAG= LoginActivity.class.getSimpleName();

    public LoginViewModel(Context mContext) {
        this.mContext = mContext;
    }


    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(com.example.rajna.mvvmproject.BR.email);
    }
    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(com.example.rajna.mvvmproject.BR.password);
    }
    @Bindable
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyPropertyChanged(com.example.rajna.mvvmproject.BR.status);
    }


    public void onClickLogin(String email, String pwd) {
        String originalemail="raj@gmail.com";
        String originalpwd="naresh";
        if(email.equals(originalemail)&&pwd.equals(originalpwd))
        {
            setStatus("200");
            Toast.makeText(mContext, "Login Information  is correct", Toast.LENGTH_LONG).show();
        }
        else
        {
            setStatus("400");
            Toast.makeText(mContext, "Email or Password is not correct", Toast.LENGTH_LONG).show();
        }

    }

}