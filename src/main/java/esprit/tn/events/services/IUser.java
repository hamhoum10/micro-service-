package esprit.tn.events.services;

import esprit.tn.events.entities.User;

import java.util.List;

public interface IUser {
    public User addUser(User u);
    public User updateUser(User u);
    public List<User> findAllUsers();
    public User findById(Integer idU);
    public void deleteUser(Integer idU);
}
