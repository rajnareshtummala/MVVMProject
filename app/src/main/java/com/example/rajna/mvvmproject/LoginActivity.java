package com.example.rajna.mvvmproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rajna.mvvmproject.databinding.ActivityLoginBinding;


public class LoginActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            ActivityLoginBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_login);

            LoginViewModel lvm=new LoginViewModel(this);
            binding.setLoginVM(lvm);
            binding.setLoginActivity(this);


        }
    }
