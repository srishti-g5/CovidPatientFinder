
package hib.dto;

public class Admin {
    private String loginId;
    private String pass;
    
    public Admin(){}
    public Admin(String loginId, String pass){
        this.loginId=loginId;
        this.pass=pass;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
