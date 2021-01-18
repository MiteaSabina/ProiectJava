/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proiectjava.servlet;

import com.mycompany.proiectjava.common.JobDetails;
import com.mycompany.proiectjava.ejb.JobBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author neagoe
 */
@WebServlet(name = "EditJob", urlPatterns = {"/EditJob"})
public class EditJob extends HttpServlet {

    @Inject
    JobBean jobBean;

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
            out.println("<title>Servlet EditJob</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditJob at " + request.getContextPath() + "</h1>");
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
        List<JobDetails> jobs = jobBean.getAllJobs();
        request.setAttribute("jobs", jobs);

        int jobId = Integer.parseInt(request.getParameter("id"));
        JobDetails job = jobBean.findById(jobId);
        request.setAttribute("job", job);

        request.getRequestDispatcher("/WEB-INF/pages/editJob.jsp").forward(request, response);
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
        String job_name = request.getParameter("job_name");
        String type = request.getParameter("type");
        String study_level = request.getParameter("study_level");
        String career_level = request.getParameter("career_level");
        int jobId = Integer.parseInt(request.getParameter("job_id"));

        jobBean.updateJob(jobId, job_name, type, study_level, career_level);

        response.sendRedirect(request.getContextPath() + "/Jobs");
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
