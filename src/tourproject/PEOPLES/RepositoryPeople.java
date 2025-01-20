package tourproject.PEOPLES;

        import tourproject.MANAGERS.EntityManager;

        import java.sql.*;

public class RepositoryPeople {

    protected static Connection connection;
    protected static Statement statement;

    public RepositoryPeople() {
        Connect();
    }

    public static void Connect()
    {
        try
        {
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


    public static void insertPerson(EntityPeople entity)
    {
        String inserttxt = "INSERT INTO `peoples`(`codemelli`, `fullname`,`phone`,`address`,`tourcode`) VALUES ('" + entity.getCode() + "','" + entity.getFullName() + "','" + entity.getPhone() + "','" + entity.getAddress() + "','" + entity.getTourCode() + "')";
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


    public static void updatePerson(EntityPeople entity)
    {
        deletePerson(entity.getCode());
        insertPerson(entity);
    }

    public static void deletePerson(long codemelli)
    {
        String deletetxt = "DELETE FROM `peoples` WHERE `code`=" + codemelli;
        try
        {
            statement.execute(deletetxt);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static EntityPeople searchPeople(long code) {
        String deletetxt = "SELECT * FROM `peoples` WHERE `codemelli`=" + code;
        EntityPeople entityPeople=new EntityPeople();
        try
        {
            ResultSet rs= statement.executeQuery(deletetxt);
            while (rs.next()){
                entityPeople.setCode(code);
                entityPeople.setAddress(rs.getString("address"));
                entityPeople.setFullName(rs.getString("fullname"));
                entityPeople.setPhone(rs.getInt("phone"));
                entityPeople.setTourCode(rs.getInt("tourcode"));

            }
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage() + "_*_*_*_*_");
        }
        return entityPeople;
    }
}
