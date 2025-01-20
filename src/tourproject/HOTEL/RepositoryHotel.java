package tourproject.HOTEL;

        import java.sql.*;

public class RepositoryHotel {
    protected static Connection connection;
    protected static Statement statement;

    public RepositoryHotel() {
        Connect();
    }

    public static void Connect()
    {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
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


    public static void insertHotel(EntityHotel entity)
    {
        String inserttxt = "INSERT INTO `hotels`(`code`, `name`,`address`,`phone`,`facilities`,`payment`) VALUES ('" + entity.gethCode() + "','" + entity.gethName() + "','" + entity.gethAddress() + "','" + entity.gethNumber() + "','" + entity.gethPossibl() + "','" + entity.gethPrice() + "')";
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


    public static void updateHotel(EntityHotel entity)
    {
        deleteHotel(entity.gethCode());
        insertHotel(entity);
    }

    public static void deleteHotel(int code) {
        String deletetxt = "DELETE FROM `hotels` WHERE `code`=" + code;
        try
        {
            statement.execute(deletetxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
    }


    public static EntityHotel searchHotel(int code) {
        String deletetxt = "SELECT * FROM `hotels` WHERE `code`=" + code;
        EntityHotel entityHotel=new EntityHotel();
        try
        {
           ResultSet rs= statement.executeQuery(deletetxt);
           while (rs.next()){
               entityHotel.sethCode(rs.getInt("code"));
               entityHotel.sethName(rs.getString("name"));
               entityHotel.sethAddress(rs.getString("address"));
               entityHotel.sethNumber(Long.parseLong(rs.getString("phone")));
               entityHotel.sethPrice(Long.parseLong(rs.getString("payment")));
               entityHotel.sethPossibl(rs.getString("facilities"));

           }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
        return entityHotel;
    }

}