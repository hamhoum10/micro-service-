package esprit.tn.events.controllers;

import esprit.tn.events.entities.Report;
import esprit.tn.events.services.IReport;
import esprit.tn.events.services.ReportServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReportController {
    IReport iReport;
    ReportServiceImp reportServiceImp;

    @PostMapping("/addReport")
    public Report addReport(@RequestBody Report Report){ // @RequestBody when we pass object
        return reportServiceImp.addReport(Report);
    }

    @PutMapping("/updateReport")
    public Report updateReport(@RequestBody Report Report){
        return reportServiceImp.updateReport(Report);
    }

    @GetMapping("/Reports")
    public List<Report> findAllReport(){
        return reportServiceImp.findAllReport();
    }

    @GetMapping("/getReportbyid/{id}")
    public Report findByIdReport(@PathVariable long id){
        return reportServiceImp.findByIdReport(id);
    }

    @DeleteMapping("/deleteReport/{id}")
    public void deleteById(@PathVariable long id){
        reportServiceImp.deleteReport(id);
    }
    @PostMapping("/addReportAndAssignUser/{iduser}")
    public Report addReportandAssaginItToUser(@RequestBody Report Report,@PathVariable long iduser){
        return iReport.addReportandAssaginItToUser(Report,iduser);
    }

}
