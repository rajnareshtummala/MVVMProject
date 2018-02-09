package com.example.rajna.mvvmproject;

import android.text.Spanned;
import android.text.SpannedString;

import junit.framework.Assert;

import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.*;

    public class MockitoUnitTest {

       @Test
        public void testEmailId()
       {
           LoginViewModel logininfo = Mockito.mock(LoginViewModel.class);
           Mockito.when(logininfo.getEmail()).thenReturn("raj@gmail.com");
           String email = logininfo.getEmail();
           Assert.assertEquals("raj@gmail.com", email);
       }

        @Test
        public void testPassword()
        {
            LoginViewModel logininfo = Mockito.mock(LoginViewModel.class);
            Mockito.when(logininfo.getPassword()).thenReturn("naresh");
            String password = logininfo.getPassword();
            Assert.assertEquals("naresh", password);
        }
    }