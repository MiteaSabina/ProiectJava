<%-- 
    Document   : jobs
    Created on : Jan 16, 2021, 7:20:44 PM
    Author     : neagoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:pageTemplate pageTitle="Jobs">
    <h1>Jobs</h1>
    <c:forEach var="job" items="${jobs}" varStatus="status">
        <div class="row">
            <div class="col-md-4">
                ${job.name}
            </div>
            <div class="col-md-4">
                ${job.type}
            </div>
            <div class="col-md-4">
                ${job.study_level}
            </div>
            <div class="col-md-4">
                ${job.career_level}
            </div>
        </div>
    </c:forEach>
</t:pageTemplate>
