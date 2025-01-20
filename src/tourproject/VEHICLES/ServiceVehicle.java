
package tourproject.VEHICLES;

public class ServiceVehicle
{

    public void save(EntityVehicle entity) throws Exception
    {
        RepositoryVehicle repository = new RepositoryVehicle();
        repository.insertVehicle(entity);
    }

    public void edit(EntityVehicle entity) throws Exception
    {
        RepositoryVehicle repository = new RepositoryVehicle();
        repository.updateVehicle(entity);
    }

    public void delete(int code) throws Exception
    {
        RepositoryVehicle repository=new RepositoryVehicle ();
        repository.deleteVehicle(code);
    }

}
