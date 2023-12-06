package esprit.tn.events.services;

import esprit.tn.events.entities.User;
import esprit.tn.events.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImp implements IUser{
    private UserRepository userRepository;
    @Override
    public User addUser(User u) {
        return userRepository.save(u);
    }

    @Override
    public User updateUser(User u) {
        User existingUser = userRepository.findById(u.getId()).orElse(null);

        if (existingUser != null) {
            if (u.getFirstName() != null) {
                existingUser.setFirstName(u.getFirstName());
            }
            if (u.getLastName() != null) {
                existingUser.setLastName(u.getLastName());
            }
            if (u.getEmail() != null) {
                existingUser.setEmail(u.getEmail());
            }

            return userRepository.save(existingUser);
        }

        return null;
    }


    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer idU) {
        return  userRepository.findById(idU).orElse(null);
    }

    @Override
    public void deleteUser(Integer idU) {
        userRepository.deleteById(idU);
    }

    @Override
    public List<User> searchByName(String firstName, String lastName) {
        return userRepository.findByFirstNameContainingAndLastNameContaining(firstName, lastName);
    }
}
