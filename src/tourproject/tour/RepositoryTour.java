package tourproject.tour;

        import tourproject.PEOPLES.EntityPeople;

        import java.sql.*;
        import java.util.ArrayList;

public class RepositoryTour {

    protected static Connection connection;
    protected static Statement statement;

    public RepositoryTour() {
        Connect();
    }

    public static void Connect()
    {
        try
        {
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

    public  static void insertTour(EntityTour entity)
    {

        String inserttxt = "INSERT INTO `tours`(`code`, `name`,`range`,`vehicle`,`people`,`totalpayment`,`manager`,`hotelname`,`places`) VALUES ('" + entity.getCode() + "','" + entity.getName() + "','" + entity.getRange()+ "','" +entity.getVehicle()+ "','" +entity.getPeople()+ "','" +entity.getPayment()+"','" +entity.getManager()+"','" +entity.getHotelName()+"','" +entity.getPlaces()+"')";
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

    public static void updateTour(EntityTour entity)
    {
        deleteTour(entity.getCode());
        insertTour(entity);
    }

    public static void deleteTour(long code)
    {
        String deletetxt = "DELETE FROM `tours` WHERE `code`=" + code;
        try
        {
            statement.execute(deletetxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static EntityTour searchTour(long code) {
        String deletetxt = "SELECT * FROM `tours` WHERE `code`=" + code;
        EntityTour entityTour=new EntityTour();
        try
        {
            ResultSet rs= statement.executeQuery(deletetxt);
            while (rs.next()){
                entityTour.setCode(code);
                entityTour.setName(rs.getString("name"));
                entityTour.setRange(rs.getString("range"));
                entityTour.setVehicle(rs.getString("vehicle"));
                entityTour.setPeople(rs.getString("people"));
                entityTour.setPayment(rs.getInt("totalpayment"));
                entityTour.setManager(rs.getString("mamager"));
                entityTour.setHotelName(rs.getString("hotelname"));
                entityTour.setPlaces(rs.getString("places"));



            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
        return entityTour;
    }


    public static ArrayList<EntityTour> getList() {
        String deletetxt = "SELECT * FROM `tours` ";
        ArrayList<EntityTour> entityTours=new ArrayList<>();
        EntityTour entityTour=new EntityTour();
        try
        {
            ResultSet rs= statement.executeQuery(deletetxt);
            while (rs.next()){
                entityTour.setName(rs.getString("name"));
                entityTour.setRange(rs.getString("range"));
                entityTour.setVehicle(rs.getString("vehicle"));
                entityTour.setPeople(rs.getString("people"));
                entityTour.setPayment(rs.getInt("totalpayment"));
                entityTour.setManager(rs.getString("mamager"));
                entityTour.setHotelName(rs.getString("hotelname"));
                entityTour.setPlaces(rs.getString("places"));
                entityTour.setCode(Long.parseLong(rs.getString("code")));
                entityTours.add(entityTour);
            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
        return entityTours;
    }


}
