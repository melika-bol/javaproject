package tourproject.PEOPLES;

public class ServicePeople
{
    public void save(EntityPeople entity) throws Exception
    {
        RepositoryPeople repository = new RepositoryPeople();
        repository.insertPerson(entity);
    }

    public void edit(EntityPeople entity) throws Exception
    {
        RepositoryPeople repository = new RepositoryPeople();
        repository.updatePerson(entity);
    }

    public void delete(long  codemelli) throws Exception
    {
        RepositoryPeople repository=new RepositoryPeople ();
        repository.deletePerson(codemelli);
    }
    public EntityPeople search(long  codemelli) throws Exception
    {
        RepositoryPeople repository=new RepositoryPeople ();
        return repository.searchPeople(codemelli);
    }

}