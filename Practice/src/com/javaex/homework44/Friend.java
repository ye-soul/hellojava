package com.javaex.homework44;
public class Friend {
    private String name;
    private String hp;
    private String email;
    //필요한 메소드 작성
    public void showInfo(){
        System.out.println(name+" "+hp+" "+email);
    }
    /**
     * @param name
     * @param hp
     * @param email
     */
    public Friend(String name, String hp, String email) {
      this.name = name;
      this.hp = hp;
      this.email = email;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
      this.name = name;
    }
    /**
     * @param hp the hp to set
     */
    public void setHp(String hp) {
      this.hp = hp;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
      return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
      this.email = email;
    }
    /**
     * 
     */
    public Friend() {
    }
    @Override
    public String toString() {
      return "Friend [name=" + name + ", hp=" + hp + ", school=" + email + "]";
    }
    /**
     * @return the name
     */
    public String getName() {
      return name;
    }
    
    
}
