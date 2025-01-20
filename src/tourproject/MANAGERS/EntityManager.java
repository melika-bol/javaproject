package tourproject.MANAGERS;

public class EntityManager  {
    String username,password,name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() { return username; }

    public EntityManager setUsername(String username)
    {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public EntityManager sethName(String password)
    {
        this.password = password;
        return this;
    }


}
