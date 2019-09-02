import java.sql.ResultSet;
public class ConnectionController(){
  public static Jdbc JDBC;
  
  ConnectionController(){
    initializeConnection();
  }
  
  void initializeConnection(){
    ConnectionConfig config = new ConnectionConfig("localhost", "3306", "my_database", "username", "password");
    JDBC = new Jdbc(config);
  }
  //sample
  //get data from my_database
  void sample (){
    ResultSet r = JDBC.getData("select * from user");
    while(r.next()){
      System.out.println(r.getString("user_name");
    }
  }
}
