package com.hafizurrahmanomar.fragmenttablayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Contact extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        // Inflate the layout for this fragment

        View myView = inflater.inflate(R.layout.fragment_contact, container, false);


        return myView;
    }
}