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
    <form method="POST" action="${pageContext.request.contextPath}/Candidates">
        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/AddCandidate" role="button">Add Candidate</a>
        <button class="btn btn-danger" type="submit"> Delete Candidates</button>
        <c:forEach var="candidate" items="${candidates}" varStatus="status">
            <div class="row">
                <div class="col-md-4">
                    <input type="checkbox" name="candidate_ids" value="${candidate.id}"/>
                </div>
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
                <div class="col-md-2">
                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/EditCandidate?id=${candidate.id}" role="button">Edit Candidate </a>
                </div>
            </div>
        </c:forEach>
    </form>
</t:pageTemplate>
