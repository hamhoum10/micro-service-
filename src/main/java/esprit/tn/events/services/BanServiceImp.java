package esprit.tn.events.services;

import esprit.tn.events.entities.Ban;
import esprit.tn.events.entities.Room;
import esprit.tn.events.entities.User;
import esprit.tn.events.repositories.BanRepository;
import esprit.tn.events.repositories.UserReposiotry;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
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


    @Scheduled(fixedRate = 60000) // runs every minute (adjust as needed)
    public void removeExpiredBans() {
        LocalDate currentTime = LocalDate.now();
        List<Ban> expiredBans = banRepository.findByBanExpDateBefore(currentTime);

        //delete all ta3mel parcours 3al liste me8ir man3mlou for
        banRepository.deleteAll(expiredBans);

    }

    // idea is 99% right but need others work
    //room joining condition
    @Override
    public boolean canUserJoinRoom(User user,Room room) {
        //we get user with ban still going
        Boolean heJoins =false;
        LocalDate currentTime = LocalDate.now();
        List<Ban> activeBan = banRepository.findBanByBannedUserAndAndBanExpDateAfter(user,currentTime);

//        for (Ban b:activeBan) {
//            if (activeBan != null && user.getroom = room) { // this will be competed after integartion
//                // User is still banned ----> he can't join the room
//                heJoins =true;
//                break;
//            }
//        }
        return heJoins;
    }
}
