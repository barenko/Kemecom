/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.rcp.kemecom.model;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 <p/>
 @author barenko
 */
public class Email {

    private String email;

    public Email() {
    }

    public Email(String email) {
        this.email = email == null ? "" : email.trim();
    }

    @JsonIgnore
    public boolean isValid() {
        return this.email != null && this.email.matches("(?i)\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
    }

    @Override
    @JsonProperty("email")
    public String toString() {
        return email;
    }
}
