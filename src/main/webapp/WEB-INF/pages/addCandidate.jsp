<%-- 
    Document   : addCandidate
    Created on : Jan 17, 2021, 7:38:21 PM
    Author     : neagoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<t:pageTemplate pageTitle="Add Candidate">
    <h1>Add Candidate</h1>
    <form class="needs-validation" novalidate method="POST" action="${pageContext.request.contextPath}/AddCandidate">
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="name">Name</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your name.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="surname">Surname</label>
                <input type="text" class="form-control" id="surname" name="surname" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your surname.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="phone">Phone</label>
                <input type="text" class="form-control" id="phone" name="phone" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your phone.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="email">Email</label>
                <input type="text" class="form-control" id="email" name="email" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your email.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="birthday">Birthday</label>
                <input type="text" class="form-control" id="birthday" name="birthday" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your birthday.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="sex">Sex</label>
                <input type="text" class="form-control" id="sex" name="sex" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your sex.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="nationality">Nationality</label>
                <input type="text" class="form-control" id="nationality" name="nationality" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your nationality.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="applied_job">Applied Job</label>
                <input type="text" class="form-control" id="applied_job" name="applied_job" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter the applied job.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="career_level">Career level</label>
                <input type="text" class="form-control" id="career_level" name="career_level" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your career level.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="study_level">Study level</label>
                <input type="text" class="form-control" id="study_level" name="study_level" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your study level.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="native_language">Native language</label>
                <input type="text" class="form-control" id="native_language" name="native_language" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your native language.
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="foreign_languages">Foreign languages</label>
                <input type="text" class="form-control" id="foreign_languages" name="foreign_languages" placeholder="..." value="" required>
                <div class="invalid-feedback">
                    Please enter your foreign languages.
                </div>
            </div>
        </div>

        <hr class="mb-4">
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
