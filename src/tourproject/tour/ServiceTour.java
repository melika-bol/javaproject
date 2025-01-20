
package tourproject.tour;

import java.util.ArrayList;

public class ServiceTour {


    public void save(EntityTour entity) throws Exception
    {
        RepositoryTour repository = new RepositoryTour();
        repository.insertTour(entity);
    }

    public void edit(EntityTour entity) throws Exception
    {
        RepositoryTour repository = new RepositoryTour();
        repository.updateTour(entity);
    }

    public void delete(long code) throws Exception
    {
        RepositoryTour repository = new RepositoryTour ();
        repository.deleteTour(code);
    }


    public EntityTour search(long code) throws Exception
    {
        RepositoryTour repository = new RepositoryTour ();
        return repository.searchTour(code);
    }
    public ArrayList<EntityTour> allItems() throws Exception
    {
        RepositoryTour repository = new RepositoryTour ();
        return repository.getList();
    }

}
