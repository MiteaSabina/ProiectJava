<%-- 
    Document   : users
    Created on : Jan 16, 2021, 7:42:09 PM
    Author     : neagoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <form method="POST" action="${pageContext.request.contextPath}/Users">
        <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/AddUser" role="button">Add User</a>
        <button class="btn btn-danger" type="submit">Delete Users</button>
        <c:forEach var="user" items="${users}" varStatus="status">
            <div class="row">
                <div class="col-md-4">
                    <input type="checkbox" name="user_ids" value="${user.id}"/>
                </div>
                <div class="col-md-4">
                    ${user.username}
                </div>
                <div class="col-md-4">
                    ${user.email}
                </div>
                <div class="col-md-4">
                    ${user.password}
                </div>
                <div class="col-md-4">
                    ${user.position}
                </div>
                <div class="col-md-2">
                    <a class="btn btn-secondary" href="${pageContext.request.contextPath}/EditUser?id=${user.id}" role="button">Edit User </a>
                </div>
            </div>
        </c:forEach>
    </form>
</t:pageTemplate>