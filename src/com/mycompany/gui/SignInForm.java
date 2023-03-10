/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gui;

import com.codename1.components.ImageViewer;
import com.codename1.components.ScaleImageLabel;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.FlowLayout;
import com.codename1.ui.plaf.Style;
import com.codename1.ui.util.Resources;
import com.codename1.ui.util.UIBuilder;
import com.mycompany.services.ServiceUser;

/**
 *
 * @author MSI
 */
public class SignInForm extends Form{
    
    
    private Form current;
    private Resources theme;
    
    private Container cnt1,cnt2;
    private TextField tfEmail,tfPwd;
    private ImageViewer img;
    
    private Button btnValider,signUp,mp;

    
    public SignInForm(Resources res) {
    
    current=this;
        setTitle("Connexion");
        setLayout(BoxLayout.yCenter());
        
         tfEmail = new TextField("", "Email");
         
         tfPwd = new TextField("", "Password");
         
        tfPwd.setConstraint(TextField.PASSWORD);
        
         btnValider = new Button("Connexion");
        
         signUp = new Button("Register");
        
       
        
        
        //mp oublié
         mp = new Button("oublier mot de passe?","CenterLabel");
        
        mp.setAlignment(CENTER);
        
        
        
        signUp.addActionListener(e -> new SignUpForm(res,current));
        signUp.setUIID("Link");
        Label doneHaveAnAccount = new Label("Vous n'avez aucune compte?","CenterLabel");
        
        cnt1 = new Container(BoxLayout.x());
        cnt1.addAll(doneHaveAnAccount,signUp);
        
        
        
        
        
       
        add(tfEmail);
        
        add(tfPwd);
        add(btnValider);
        add(cnt1);
        //add(mp);
        
        setScrollable(true);
        show();
        
         btnValider.requestFocus();
        btnValider.addActionListener((e) -> {
            
           ServiceUser.getInstance().signin(tfEmail,tfPwd, res);
            //Dialog.show("Success","Sign in succesfully!","OK",null);
            //new Home(res);
        });
    }
    
}
