package tourproject.HOTEL;

public class ServiceHotel {
    public void save(EntityHotel entity) throws Exception
    {
        RepositoryHotel repository = new RepositoryHotel();
        repository.insertHotel(entity);
    }

    public void edit(EntityHotel entity) throws Exception
    {
        RepositoryHotel repository = new RepositoryHotel();
        repository.updateHotel(entity);
    }

    public void delete(int hotelcode) throws Exception
    {
        RepositoryHotel repository=new RepositoryHotel ();
        repository.deleteHotel(hotelcode);
    }

    public EntityHotel search(int hotelcode) throws Exception
    {
        RepositoryHotel repository=new RepositoryHotel ();
        return repository.searchHotel(hotelcode);
    }

}
