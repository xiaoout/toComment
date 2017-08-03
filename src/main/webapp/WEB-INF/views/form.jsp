<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Student Enrollment Form</title>

</head>

<body>

    <form:form method="POST" modelAttribute="form" class="form-horizontal">
		<div class="row">
			<div class="form-group col-md-12">
				<label class="col-md-3 control-lable" for="firstName">First Name</label>
				<div class="col-md-7">
					<form:input type="text" path="name" id="name" class="form-control input-sm"/>
					<div class="has-error">
						<form:errors path="name" class="help-inline"/>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
        			<div class="form-group col-md-12">
        				<label class="col-md-3 control-lable" for="firstName">First Name</label>
        				<div class="col-md-7">
        					<form:input type="text" path="age" id="age" class="form-control input-sm"/>
        					<div class="has-error">
        						<form:errors path="name" class="help-inline"/>
        					</div>
        				</div>
        			</div>
        		</div>


                 <div>
                    <form:label path="receivePaper">订阅新闻？</form:label>
                 </div>
                 <div>
                    <form:checkbox path="receivePaper" />
                 </div>

		<input type = "submit" value="Register">
	</form:form>
</body>
</html>