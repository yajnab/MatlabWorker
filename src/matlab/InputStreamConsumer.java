/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matlab;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Yajnavalkya Bandyopadhyay
 * Copyright 2015
 * @author yajnab
 * @email <yajnab@gmail.com>
 * @hosted <github.com/yajnab >
 */
public class InputStreamConsumer extends Thread {

        private InputStream is;public String p,b="";
   
        public InputStreamConsumer(InputStream is) {
            this.is = is;
        }
        
        @Override
        public void run() {

            try {
                int value = -1;
                while ((value = is.read()) != -1) {
                    //System.out.print((char)value);
                    b=b+((char)value);
                    
                }
            } catch (IOException exp) {
                exp.printStackTrace();
            }
           // System.out.println(""+b);
            p=b;
        }
        
    }

