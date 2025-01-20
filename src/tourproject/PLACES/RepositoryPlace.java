package tourproject.PLACES;

        import tourproject.PEOPLES.EntityPeople;

        import java.sql.*;

public class RepositoryPlace
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


    public void insertPlace(EntityPlace entity)
    {
        String inserttxt = "INSERT INTO `place`(`code`, `name`) VALUES ('" + entity.getPlCode() + "','" + entity.getPlName() +"')";
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

    public void updatePlace(EntityPlace entity)
{
    deletePlace(entity.getPlCode());
    insertPlace(entity);

}
    public void deletePlace(long code)
    {
        String deletetxt = "DELETE FROM `place` WHERE `name`=" + code;
        try
        {
            statement.execute(deletetxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static EntityPlace searchPlace(long code) {
        String deletetxt = "SELECT * FROM `place` WHERE `code`=" + code;
        EntityPlace entityPlace=new EntityPlace();
        try
        {
            ResultSet rs= statement.executeQuery(deletetxt);
            while (rs.next()){
                entityPlace.setPlCode(code);
                entityPlace.setPlName(rs.getString("name"));


            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
        return entityPlace;
    }



}
