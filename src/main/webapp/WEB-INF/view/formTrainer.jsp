<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form Trainer</title>

        <link href="${pageContext.request.contextPath}/static/trainer.css" rel="stylesheet" >
        <style>
            .error{
                color:red;
            }
            
        </style>
    </head>
    <body>

        <c:choose>
            <c:when test="${trainer.tid != 0}">
                <h1>Update Trainer</h1>
            </c:when>
            <c:otherwise>
                <h1>Create Trainer</h1>
            </c:otherwise>
        </c:choose>

        <form:form            
            action="${pageContext.request.contextPath}/trainer/create" 
            method="POST"
            modelAttribute="trainer">
            <form:hidden path="tid"/>
            First Name: <form:input path="tfname"/>
            <form:errors path="tfname" cssClass="error"/> 
            <br>
            Last Name: <form:input path="tlname"/>
            <form:errors path="tlname" cssClass="error"/> 
            <br>   
            Subject: <form:input path="tsub"/>
            <form:errors path="tsub" cssClass="error"/> 
            <br>
            <input type="submit" value="Submit">
        </form:form>
        <br>
        <a href="${pageContext.request.contextPath}/trainer/list">Back to list</a>
    </body>
</html>
