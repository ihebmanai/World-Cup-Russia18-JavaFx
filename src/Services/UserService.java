
package Services;

import DataBase.DB;
import Entités.Utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author boussandel
 */
public class UserService {
    private Connection connection;
    private PreparedStatement ps;

    public UserService() {
        connection = DB.getInstance().getConnection();
    }


    public void add(Utilisateur user) {
        String req = "insert into user(nom,prenom,email,password,telephone,nationalite,role,login,photo)values(?,?,?,?,?,?,?,?,?)";
        
         try {
            ps = connection.prepareStatement(req);
            ps.setString(1, user.getNom());
            ps.setString(2, user.getPrenom());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            
         
             ps.setString(5, user.getTelephone());             
             ps.setString(6, user.getNationalite());
             
             ps.setString(7, user.getLogin());
             ps.setString(8, user.getRole());
             ps.setString(9, user.getPhoto());
             
             System.out.println("user ajouté");
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Utilisateur findById(Integer idUser) {
        
         String req = "select * from user where idUser = ?";
        Utilisateur user = null;
        try {
            ps = connection.prepareStatement(req);
            ps.setInt(1, idUser);
            ResultSet resultSet = ps.executeQuery();
            if (resultSet.next()) {
                user = new Utilisateur(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7),resultSet.getString(8),resultSet.getString(9),resultSet.getString(10),resultSet.getFloat(11));
                System.out.println("Services.UserService.findById()");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<Utilisateur> getAll() {
        String req = "select * from user";
        List<Utilisateur> users = new ArrayList<>();
        try {
            ps = connection.prepareStatement(req);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Utilisateur user = new Utilisateur(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
     public List<Utilisateur> getAlll() {
        String req = "select * from user";
        List<Utilisateur> users = new ArrayList<>();
        try {
            ps = connection.prepareStatement(req);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
               
                Utilisateur user=new Utilisateur(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5),resultSet.getString(6),resultSet.getString(7), resultSet.getString(8), resultSet.getString(9));
                users.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }


    public void delete(Integer idUser) {
        
         String req = "delete from user where idUser =?";
        try {
            ps = connection.prepareStatement(req);
            ps.setInt(1, idUser);
            ps.executeUpdate();
            System.out.println("Services.UserService.delete()");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public Utilisateur authentication(String login, String password) {
         Utilisateur u=new Utilisateur();
          String i="fail";
          String k;
        try {
            String query = "SELECT idUser,nom,prenom,login,password,role FROM user WHERE user.login ='"+login+"' and user.password='"+password+"'";
            
            
            PreparedStatement ps = connection.prepareStatement(query);
            //ps.setString(1, s2+"{"+k+"}");
            //i=s2+"{"+k+"}";
            ResultSet rs=  ps.executeQuery(query);
            
            while (rs.next()) {
                u.setIdUser(rs.getInt(1));
                u.setNom(rs.getString(2));
                u.setPrenom(rs.getString(3));
                u.setLogin(rs.getString(4));
                u.setPassword(rs.getString(5));
                u.setRole(rs.getString(6));
                
                
                       
            }
            return u;
          
            

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    return u;
    }

   
    public boolean RechLogin(String text) {
        boolean b=false;
        try {
            String query = "SELECT * FROM user WHERE user.login ='"+text+"'" ;
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs=  ps.executeQuery(query);

            while (rs.next()) {
                b=true;
                System.out.println("Services.UserService.RechLogin()");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
    return b;
    }
    
    
    public void modifierArgentUser(Utilisateur user,float total)
    {
         String req="UPDATE user SET argent=? WHERE iduser=? ";
          try {
          
            ps = connection.prepareStatement(req);
            ps.setFloat(1,(user.getArgent()-total));
            ps.setInt(2, user.getIdUser());
            ps.executeUpdate();
              System.out.println("somme payée");
             
          }
          catch(SQLException ex)
          {
              Logger.getLogger(ServiceProduit.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("probleme de payement");
          }
    }
    }