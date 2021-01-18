<%-- 
    Document   : editJob
    Created on : Jan 17, 2021, 8:10:00 PM
    Author     : neagoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:pageTemplate pageTitle="Edit Job">
    <h1>Edit Job</h1>
    <form class="needs-validation" novalidate method="POST" action="${pageContext.request.contextPath}/EditJob">
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="job_name">Job name</label>
                <input type="text" class="form-control" id="job_name" name="job_name" placeholder="..." required value="${job.job_name}">
                <div class="invalid-feedback">
                    Please enter the job name.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="type">Type</label>
                <input type="text" class="form-control" id="type" name="type" placeholder="..." required value="${job.type}">
                <div class="invalid-feedback">
                    Please enter the type.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="study_level">Study level</label>
                <input type="text" class="form-control" id="study_level" name="study_level" placeholder="..." required value="${job.study_level}">
                <div class="invalid-feedback">
                    Please enter your study level.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="career_level">Career level</label>
                <input type="text" class="form-control" id="career_level" name="career_level" placeholder="..." required value="${job.career_level}">
                <div class="invalid-feedback">
                    Please enter your career level.
                </div>
            </div>
        </div>

        <hr class="mb-4">
        <input type="hidden" name="job_id" value="${job.id}"/>
        <button class="btn btn-primary btn-lg btn-block" type="submit">Save</button>
    </form>

    <script>
        // Example starter JavaScript for disabling form submissions if there are invalid fields
        (function () {
            'use strict';

            window.addEventListener('load', function () {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation');

                // Loop over them and prevent submission
                var validation = Array.prototype.filter.call(forms, function (form) {
                    form.addEventListener('submit', function (event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            }, false);
        })();
    </script>
</t:pageTemplate>
