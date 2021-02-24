
package com.rohitdabas1;
 
import org.springframework.stereotype.Component;
 
@Component
public class ResponseTransfer {
 
    private int id;
    private String fullname;
    private String email;
 
    public ResponseTransfer() { }
 
    public ResponseTransfer(int id, String fullname, String email) {       
        this.id = id;
        this.fullname = fullname;
        this.email = email;
    }
 
    public int getId() {
        return id;
    }
 
    public String getFullname() {
        return fullname;
    }
 
    public String getEmail() {
        return email;
    }
}
