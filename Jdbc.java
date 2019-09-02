import java.sql.*;
public class Jdbc{
  private static Connection connection;
  private static String host;
  private static String port;
  private static String db;
  private static String userName;
  private static String password;
  public Jdbc(){
    
  }
  private static Connection createConnection(){
    if(connection == null){
      try{
        Class.forname("com.mysql.jdbc.Driver");
        connection = DriverManager.createConnection("jdbc:mysql://"+host+":"+port+"/"+db, userName, password);
      }catch(Exception e){
        e.printStatctrace();
        //log
        connection = null;
      }
    }
    return connection;
  }
  public static Connection getConnection(){
    return createConnection();
  }
  public ResultSet putData(String sql){
    Statement st = getConnection().createStatement();
    st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
    return st.getGeneratedKeys();
  }
  public ResultSet getData(String sql){
    Statement st = getConnection().createStatement();
    return st.executeQuery(sql)
  }
}
