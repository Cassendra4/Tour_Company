/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Cassendra
 */
public class DBConnectionLogin {
    private static DBConnectionLogin instance = null;
      String DATABASE_URL;
      Connection connection ;
      Statement statement ;
     ResultSet resultSet;
      
      public DBConnectionLogin(){
          DATABASE_URL = "jdbc:mysql://localhost:3306/tourcom";
            connection = null;
            statement = null;
            resultSet = null;
            init();
      }
      private  void init( )
   {
             try {
                       Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection(DATABASE_URL, "root", "");
             statement = connection.createStatement();
                 System.out.println("Successfull");
                  } 
             catch (ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(null,ex.getMessage(),"E R R O R",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DBConnectionLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage(),"E R R O R",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DBConnectionLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
     /* finally{                                                             
       try                                                       
       {                                                          
            resultSet.close();                                      
           statement.close();                                      
           connection.close();                                     
         }                                        
         catch ( Exception exception )   {                                                          
            exception.printStackTrace();                            
         }
     /* finally{                                                             
       try                                                       
       {                                                          
            resultSet.close();                                      
           statement.close();                                      
           connection.close();                                     
         }                                        
         catch ( Exception exception )   {                                                          
            exception.printStackTrace();                            
         }
     /* finally{                                                             
       try                                                       
       {                                                          
            resultSet.close();                                      
           statement.close();                                      
           connection.close();                                     
         }                                        
         catch ( Exception exception )   {                                                          
            exception.printStackTrace();                            
         }
     /* finally{                                                             
       try                                                       
       {                                                          
            resultSet.close();                                      
           statement.close();                                      
           connection.close();                                     
         }                                        
         catch ( Exception exception )   {                                                          
            exception.printStackTrace();                            
         }
     }*/
   }
      public static DBConnectionLogin getInstance() {
      if(instance == null) {
         instance = new DBConnectionLogin();
      }
      return instance;
   }
       public boolean IsUserNameExist(String userName) throws SQLException{
                   String query = "(SELECT username FROM users WHERE  username = '"+userName+"')";
            resultSet=statement.executeQuery(query);
       
             if(!resultSet.next()){
                 return false;
             }
             else
                 return true;                          
      }
       public boolean IsPasswordCorrect(String userName,String pass) throws SQLException{
                 //  String query = "(SELECT password FROM users WHERE  username = '"+userName+"')";
                   String query="SELECT officer_ID FROM users WHERE username = '"+userName+"AND pass=DES_ENCRYPT("+"sri"+","+pass+")";
                   String password;
            resultSet=statement.executeQuery(query);
             if(!resultSet.next()){
                 return false;
             }
             else{
                 password = resultSet.getString("password");
                       return password.equals(pass);
             }
      }
}
