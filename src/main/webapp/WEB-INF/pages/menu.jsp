<%-- 
    Document   : menu
    Created on : Jan 16, 2021, 7:02:53 PM
    Author     : neagoe
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container">
    <nav class="navbar navbar-expand-md navbar-dark bg-dark">
        <a class="navbar-brand" href="${pageContext.request.contextPath}">Home</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>


        <div class="collapse navbar-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav mr-auto">
                <c:if test ="${pageContext.request.isUserInRole('DirectorGeneralRole')||pageContext.request.isUserInRole('DirectorDepartamentRole')||pageContext.request.isUserInRole('DirectorHRRole')||pageContext.request.isUserInRole('Recruiter')}">
                    <li class="nav-item" ${activePage eq 'Jobs' ? 'active' : ''}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/Jobs">Jobs</a>
                    </li>
                </c:if>
                <c:if test ="${pageContext.request.isUserInRole('DirectorGeneralRole')||pageContext.request.isUserInRole('RecruiterRole')}">
                    <li class="nav-item" ${activePage eq 'Candidates' ? 'active' : ''}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/Candidates">Candidates</a>
                    </li>
                </c:if>
                <c:if test ="${pageContext.request.isUserInRole('AdminRole')||pageContext.request.isUserInRole('DirectorGeneralRole')}">
                    <li class="nav-item" ${activePage eq 'Users' ? 'active' : ''}">
                        <a class="nav-link" href="${pageContext.request.contextPath}/Users">Users</a>
                    </li>   
                </c:if>
            </ul>

            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <c:choose>
                        <c:when test="${pageContext.request.getRemoteUser() == null}">
                            <a class="nav-link" href="${pageContext.request.contextPath}/Login">Login</a>
                        </c:when>
                        <c:otherwise>
                            <a class="nav-link" href="${pageContext.request.contextPath}/Logout">Logout</a>
                        </c:otherwise>
                    </c:choose>
                </li>
            </ul>

        </div>
    </nav>
</div>