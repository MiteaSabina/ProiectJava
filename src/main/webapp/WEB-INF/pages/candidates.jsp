<%-- 
    Document   : candidates
    Created on : Jan 16, 2021, 7:42:21 PM
    Author     : neagoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:pageTemplate pageTitle="Candidates">
    <h1>Candidates</h1>
    <c:forEach var="candidate" items="${candidates}" varStatus="status">
        <div class="row">
            <div class="col-md-4">
                ${candidate.name}
            </div>
            <div class="col-md-4">
                ${candidate.surname}
            </div>
            <div class="col-md-4">
                ${candidate.phone}
            </div>
            <div class="col-md-4">
                ${candidate.email}
            </div>
            <div class="col-md-4">
                ${candidate.birthday}
            </div>
            <div class="col-md-4">
                ${candidate.sex}
            </div>
            <div class="col-md-4">
                ${candidate.nationality}
            </div>
            <div class="col-md-4">
                ${candidate.applied_job}
            </div>
            <div class="col-md-4">
                ${candidate.career_level}
            </div>
            <div class="col-md-4">
                ${candidate.study_level}
            </div>
            <div class="col-md-4">
                ${candidate.native_language}
            </div>
            <div class="col-md-4">
                ${candidate.foreign_languages}
            </div>
        </div>
    </c:forEach>
</t:pageTemplate>
