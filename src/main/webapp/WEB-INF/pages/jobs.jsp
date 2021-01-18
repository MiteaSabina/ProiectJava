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
    <form method="POST" action="${pageContext.request.contextPath}/Jobs">
        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/AddJob" role="button">Add Job</a>
        <button class="btn btn-danger" type="submit"> Delete Jobs</button>
        <c:forEach var="job" items="${jobs}" varStatus="status">
            <div class="row">
                <div class="col-md">
                    <input type="checkbox" name="job_ids" value="${job.id}"/>
                </div>
                <div class="col-md-4">
                    ${job.job_name}
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
                <div class="col-md-2">
                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/EditJob?id=${job.id}" role="button">Edit Job </a>
                </div>
            </div>
            <div class="commentf">
                <table>
                    <tbody>
                    <FORM method="post" action="${pageContext.request.contextPath}/Jobs" >
                        <tr>
                            <td><LABEL for="name">Name: </LABEL>
                                <INPUT type="text" id="name"></td>
                        </tr>
                        <tr>
                            <td><LABEL for="comment">Comment: </LABEL>
                                <TEXTAREA type="text" id="comment"></TEXTAREA></td>
                </tr>
                <tr>
                    <td><INPUT type="submit" value="Submit"> <INPUT type="reset"></td>
                </tr>
            </FORM>
        </tbody>
    </table>
</div>
        </c:forEach>
    </form>

</t:pageTemplate>
