package esprit.tn.events.services;

import esprit.tn.events.entities.Report;
import esprit.tn.events.entities.User;
import esprit.tn.events.repositories.ReportRepository;
import esprit.tn.events.repositories.UserReposiotry;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReportServiceImp implements IReport{
    ReportRepository reportRepository;
    UserReposiotry userReposiotry;
    @Override
    public Report addReport(Report report) {
        return reportRepository.save(report);
    }

    @Override
    public Report updateReport(Report report) {
        return reportRepository.save(report);
    }

    @Override
    public List<Report> findAllReport() {
        return reportRepository.findAll();
    }

    @Override
    public Report findByIdReport(long id) {
        return reportRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteReport(long id) {
        reportRepository.deleteById(id);
    }

    @Override
    public Report addReportandAssaginItToUser(Report report, Long idUser) {
        User userToReport =  userReposiotry.findById(idUser).orElse(null);
        report.setReportedUser(userToReport);
        return reportRepository.save(report);
    }
}
