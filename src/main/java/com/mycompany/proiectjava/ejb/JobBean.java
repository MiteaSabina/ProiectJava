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
import java.util.Collection;
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

    public JobDetails findById(Integer jobId) {
        Job job = em.find(Job.class, jobId);
        return new JobDetails(job.getId(), job.getJob_name(), job.getType(), job.getStudy_level(), job.getCareer_level());
    }

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

    public void createJob(String job_name, String type, String study_level, String career_level) {
        LOG.info("createJob");
        Job job = new Job();
        job.setJob_name(job_name);
        job.setType(type);
        job.setStudy_level(study_level);
        job.setCareer_level(career_level);

        em.persist(job);
    }

    public void updateJob(int jobId, String job_name, String type, String study_level, String career_level) {
        LOG.info("updateJob");
        Job job = em.find(Job.class, jobId);
        job.setJob_name(job_name);
        job.setType(type);
        job.setStudy_level(study_level);
        job.setCareer_level(career_level);
    }

    public void deleteJobsByIds(Collection<Integer> ids) {
        LOG.info("deleteJobsByIds");
        for (Integer id : ids) {
            Job job = em.find(Job.class, id);
            em.remove(job);
        }
    }
}
