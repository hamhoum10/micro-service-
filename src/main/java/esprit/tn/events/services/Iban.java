package esprit.tn.events.services;

import esprit.tn.events.entities.Ban;

import java.util.List;

public interface Iban {
    public Ban addBan(Ban ban);
    public Ban updateBan(Ban ban);
    public List<Ban> findAllBan();
    public Ban findByIdBan(long id);
    public void deleteBan(long id);
    public Ban addBanandAssaginItToUser(Ban ban , Long idUser);
}
