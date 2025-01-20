package tourproject.PLACES;

import tourproject.HOTEL.EntityHotel;
        import tourproject.HOTEL.RepositoryHotel;

public class ServicePlace {

    public void save(EntityPlace entity) throws Exception
    {
        RepositoryPlace repository = new RepositoryPlace();
        repository.insertPlace(entity);
    }

    public void edit(EntityPlace entity) throws Exception
    {
        RepositoryPlace repository = new RepositoryPlace();
        repository.updatePlace(entity);
    }

    public void delete(long code) throws Exception
    {
        RepositoryPlace repository=new RepositoryPlace ();
        repository.deletePlace(code);

    }


    public EntityPlace search(long code) throws Exception
    {
        RepositoryPlace repository=new RepositoryPlace ();
        return  repository.searchPlace(code);

    }

}
