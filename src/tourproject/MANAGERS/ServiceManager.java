package tourproject.MANAGERS;

import tourproject.HOTEL.EntityHotel;
import tourproject.HOTEL.RepositoryHotel;

public class ServiceManager
{
    private ServiceManager () { }

    private static ServiceManager service = new ServiceManager ();

    public void save(EntityManager entity) throws Exception
    {
        RepositoryManager repository = new RepositoryManager();
        repository.insertManager(entity);
    }

    public void edit(EntityManager entity) throws Exception
    {
        RepositoryManager repository = new RepositoryManager();
        repository.updateManager(entity);
    }

    public void delete(String username) throws Exception
    {
        RepositoryManager repository=new RepositoryManager ();
        repository.deleteManager(username);
    }

    public EntityManager search(String username) throws Exception
    {
        RepositoryManager repository=new RepositoryManager ();
        return repository.searchManager(username);
    }


}
