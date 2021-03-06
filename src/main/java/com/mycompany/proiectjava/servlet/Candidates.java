/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proiectjava.servlet;

import com.mycompany.proiectjava.common.CandidateDetails;
import com.mycompany.proiectjava.ejb.CandidateBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.security.DeclareRoles;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author neagoe
 */
@DeclareRoles({"AdminRole", "DirectorGeneralRole", "DirectorDepartamentRole", "DirectorHRRole", "RecruiterRole"})
@ServletSecurity(
        value = @HttpConstraint(
                rolesAllowed = {"DirectorGeneralRole", "RecruiterRole"}))

@WebServlet(name = "Candidates", urlPatterns = {"/Candidates"})
public class Candidates extends HttpServlet {

    @Inject
    private CandidateBean candidateBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Candidates</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Candidates at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("activePage", "Candidates");

        List<CandidateDetails> candidates = candidateBean.getAllCandidates();
        request.setAttribute("candidates", candidates);

        request.getRequestDispatcher("/WEB-INF/pages/candidates.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] candidateIdsAsString = request.getParameterValues("candidate_ids");
        if (candidateIdsAsString != null) {
            List<Integer> candidateIds = new ArrayList<>();
            for (String candidateIdAsString : candidateIdsAsString) {
                candidateIds.add(Integer.parseInt(candidateIdAsString));
            }
            candidateBean.deleteCandidatesByIds(candidateIds);
        }
        response.sendRedirect(request.getContextPath() + "/Candidates");

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
