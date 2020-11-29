Key listener to avoid any non numerical character be typed into a textbox

        ageTextField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();  // ignore event
                }
            }
        });

Event to close a JFrame without saving any frame state

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        MainJFrame mjf = new MainJFrame();
        mjf.setVisible(true);
    }//GEN-LAST:event_cancelJButtonActionPerformed
    
    

Show message dialog with the acumulated error messages

    private void continueJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueJButtonActionPerformed
        // TODO add your handling code here:
        String age = !"".equals(ageTextField.getText()) ? ageTextField.getText() : "0";
        String name = nameTextField.getText();
        String address = addressTextField.getText();
        String phone = phoneTextField.getText();
        String ccNumber = ccTextField.getText();
        String message="";
        String dni = dniTextField.getText();
        boolean error=false;
        utils.setName(name);
        utils.setAge(Integer.parseInt(age));
        utils.setAddress(address);
        utils.setPhone(phone);
        utils.setCCNumber(ccNumber);
        utils.setDNINumber(dni);
        if (!utils.checkEdad()){
            message= message + AGE_WARNING_MESSAGE_ES;
            error = true;
        } 
        if (!utils.checkNameJTextField()){
            message = message + NAME_WARNING_MESSAGE_ES;
            error = true;
        }
        if (!utils.checkAddressJTextField()){
            message = message + ADDRESS_WARNING_MESSAGE_ES;
            error = true;
        }
        if (!utils.checkPhoneJTextField()){
            message = message +PHONE_WARNING_MESSAGE_ES;
            error = true;
        }
        if (!utils.checkCCJTextField()){
            message = message + CC_WARNING_MESSAGE_ES;
            error = true;
        }
        if (!utils.checkDNI()){
            message = message + DNI_WARNING_MESSAGE_ES;
            error = true;
        }
        if (error){
            JOptionPane.showMessageDialog(this, message);
        }
        else {
        BookingVehicleJFrame bvjf = new BookingVehicleJFrame(this, true);
        bvjf.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_continueJButtonActionPerformed
    
Cancel button and preserve previous jframe state. Keep on mind that the previous JFrame must be on false setVisible state (line 71).

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        pdjf.setVisible(true);
    }//GEN-LAST:event_cancelJButtonActionPerformed


Spanish dni validator

    public boolean checkDNI() {
 
        boolean esValido = false;
        int i = 0;
        int caracterASCII = 0;
        char letra = ' ';
        int miDNI = 0;
        int resto = 0;
        char[] asignacionLetra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X','B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
 
        if(dni.length() == 9 && Character.isLetter(dni.charAt(8))) {
 
            do {
                caracterASCII = dni.codePointAt(i);
                esValido = (caracterASCII > 47 && caracterASCII < 58);
                i++;
            } 
            while(i < dni.length() - 1 && esValido);     
        }
 
        if(esValido) {
            letra = Character.toUpperCase(dni.charAt(8));
            miDNI = Integer.parseInt(dni.substring(0,8));
            resto = miDNI % 23;
            esValido = (letra == asignacionLetra[resto]);
        }
 
        return esValido;
    }
    
Amount of digits CC validator

    public boolean checkCCJTextField(){
        boolean ccJTextField=true;
        int count=0;
        for(int i = 0; i < ccNumber.length(); i++){
            if(ccNumber.charAt(i) != ' '){
                count++;
            }   
        }
        if(count != 16){
            ccJTextField=false;
        }       
        return ccJTextField;
    }
