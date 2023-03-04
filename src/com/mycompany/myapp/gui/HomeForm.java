package com.mycompany.myapp.gui;

import com.codename1.ui.Button;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mfmma
 */
public class HomeForm extends Form {
    
    public HomeForm() {
        
        setTitle("Home");
        setLayout(BoxLayout.y());
        
        add(new Label("Choose an option"));
        Button   btnAddService = new Button("Add Service");
        Button btnListService = new Button("List Services");
        
        
        btnListService.addActionListener((evt -> new ListServiceForm(this).show()));
        
        btnAddService.addActionListener(e-> new AddServiceForm(this).show());
        addAll(btnAddService,btnListService);
        
        
    }
   
    
}
