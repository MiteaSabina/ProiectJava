/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proiectjava.ejb;

import com.mycompany.proiectjava.common.JobDetails;
import com.mycompany.proiectjava.common.UserDetails;
import com.mycompany.proiectjava.entity.Job;
import com.mycompany.proiectjava.entity.User;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.EJBException;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author neagoe
 */
@Stateless
public class JobBean {
    
    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());

    @PersistenceContext
    private EntityManager em;
    
    public List<JobDetails> getAllJobs() {
        LOG.info("getAllJobs");
        try {
            Query query = em.createQuery("SELECT j FROM Job j");
            List<Job> jobs = (List<Job>) query.getResultList();
            return copyJobsToDetails(jobs);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    private List<JobDetails> copyJobsToDetails(List<Job> jobs) {
        List<JobDetails> detailsList = new ArrayList<>();
        for (Job job : jobs) {
            JobDetails jobDetails = new JobDetails(job.getId(),
                    job.getJob_name(),
                    job.getType(),
                    job.getStudy_level(),
                    job.getCareer_level());
            detailsList.add(jobDetails);
        }
        return detailsList;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
