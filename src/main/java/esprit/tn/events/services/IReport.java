package esprit.tn.events.services;

import esprit.tn.events.entities.Report;

import java.util.List;

public interface IReport {
    public Report addReport(Report report);
    public Report updateReport(Report report);
    public List<Report> findAllReport();
    public Report findByIdReport(long id);
    public void deleteReport(long id);
    public Report addReportandAssaginItToUser(Report report , Long idUser);
}
