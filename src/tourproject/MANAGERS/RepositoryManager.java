package tourproject.MANAGERS;

        import tourproject.HOTEL.EntityHotel;

        import java.sql.*;

public class RepositoryManager
{
    protected static Connection connection;
    protected static Statement statement;

    public static void Connect()
    {
        try
        {
            // Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/traveltour", "root", "melikabolbolabadi");
            statement = (Statement) connection.createStatement();
            System.out.println("_D_D_D_D_D_");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
            e.printStackTrace();
        }
    }


    public void insertManager(EntityManager entity)
    {
        String inserttxt = "INSERT INTO `manager`(`name`, `username`,`password`) VALUES ('" + entity.getName() + "','" + entity.getUsername() + "','" + entity.getPassword()+"')";
        try
        {
            statement.execute(inserttxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
            e.printStackTrace();
        }

    }

    public void updateManager(EntityManager entity)
    {
        deleteManager(entity.getName());
        insertManager(entity);
    }

    public void deleteManager(String username)
    {
        String deletetxt = "DELETE FROM `manager` WHERE `username`=" + username;
        try
        {
            statement.execute(deletetxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static EntityManager searchManager(String userName) {
        String deletetxt = "SELECT * FROM `manager` WHERE `username`=" + userName;
        EntityManager entityManager=new EntityManager();
        try
        {
            ResultSet rs= statement.executeQuery(deletetxt);
            while (rs.next()){
                entityManager.setName(rs.getString("name"));
                entityManager.sethName(rs.getString("password"));
                entityManager.setUsername(rs.getString("username"));


            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
        return entityManager;
    }



}


