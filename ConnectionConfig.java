public class ConnectionConfig implements Serializable{
  private String host;
  private String port;
  private String db;
  private String userName;
  private String password;
  
  public ConnectionConfig(String host, String port, String db, String uname, String pass){
    this.host = host;
    this.port = port;
    this.db= db;
    this.userName = uname;
    this.password = pass;
  }
  //getters
  public String getHost(){
    return host;
  }
  public String getPort(){
    return port;
  }
  public String getDB(){
    return db;
  }
  public String getUsername(){
    return userName;
  }
  public String getPassword(){
    return password;
  }
}
