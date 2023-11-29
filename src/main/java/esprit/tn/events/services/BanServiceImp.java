package esprit.tn.events.services;

import esprit.tn.events.entities.Ban;
import esprit.tn.events.entities.User;
import esprit.tn.events.repositories.BanRepository;
import esprit.tn.events.repositories.UserReposiotry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BanServiceImp implements Iban{
    BanRepository banRepository;
    UserReposiotry userReposiotry;
    @Override
    public Ban addBan(Ban ban) {
        return banRepository.save(ban);
    }

    @Override
    public Ban updateBan(Ban ban) {
        return banRepository.save(ban);
    }

    @Override
    public List<Ban> findAllBan() {
        return banRepository.findAll();
    }

    @Override
    public Ban findByIdBan(long id) {
        return banRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBan(long id) {
        banRepository.deleteById(id);
    }

    @Override
    public Ban addBanandAssaginItToUser(Ban ban, Long idUser) {

        User userToBan =userReposiotry.findById(idUser).orElse(null);
        ban.setBannedUser(userToBan);
        return banRepository.save(ban);
    }
}
