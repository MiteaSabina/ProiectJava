/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proiectjava.ejb;

import com.mycompany.proiectjava.common.CandidateDetails;
import com.mycompany.proiectjava.common.UserDetails;
import com.mycompany.proiectjava.entity.Candidate;
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
public class CandidateBean {
    
    private static final Logger LOG = Logger.getLogger(UserBean.class.getName());

    @PersistenceContext
    private EntityManager em;
    
    public List<CandidateDetails> getAllCandidates() {
        LOG.info("getAllCandidates");
        try {
            Query query = em.createQuery("SELECT c FROM Candidate c");
            List<Candidate> candidates = (List<Candidate>) query.getResultList();
            return copyCandidatesToDetails(candidates);
        } catch (Exception ex) {
            throw new EJBException(ex);
        }
    }

    private List<CandidateDetails> copyCandidatesToDetails(List<Candidate> candidates) {
        List<CandidateDetails> detailsList = new ArrayList<>();
        for (Candidate candidate : candidates) {
            CandidateDetails candidateDetails = new CandidateDetails(candidate.getId(),
                    candidate.getName(),
                    candidate.getSurname(),
                    candidate.getPhone(),
                    candidate.getEmail(),
                    candidate.getBirthday(),
                    candidate.getSex(),
                    candidate.getNationality(),
                    candidate.getApplied_job(),
                    candidate.getCareer_level(),
                    candidate.getStudy_level(),
                    candidate.getNative_language(),
                    candidate.getForeign_languages());
            detailsList.add(candidateDetails);
        }
        return detailsList;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
