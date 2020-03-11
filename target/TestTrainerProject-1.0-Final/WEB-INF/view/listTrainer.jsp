<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Trainer</title>
        
        <link type="text/css" href="${pageContext.request.contextPath}/static/trainer.css" rel="stylesheet" >
        
    </head>
    <body>
        <h1>Trainers</h1>
        <a href="${pageContext.request.contextPath}/trainer/create">Create Trainer</a>

        <form:form action="${pageContext.request.contextPath}/trainer/search" method="GET">
            Search Last Name: <input type="text" name="searchName" size="9">
            <input type="submit" value="Search">
        </form:form>

        <table>
            <thead>
                    <tr>
                        <th>Id</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Subject</th>
                        <th> </th>
                        <th> </th>
                    </tr>
                </thead>
            <c:forEach items="${listOfTrainer}" var="t">
                <c:url var="deleteLink" value="/trainer/delete">
                    <c:param name="trainerId" value="${t.tid}" />  
                </c:url>
                <c:url var="updateLink" value="/trainer/update">
                    <c:param name="trainerId" value="${t.tid}" />
                </c:url>
                
                <tr>
                    <td>${t.tid}</td>
                    <td>${t.tfname}</td>
                    <td>${t.tlname}</td>
                    <td>${t.tsub}</td>
                    <td>
                        <a href="${updateLink}">Update</a>
                    </td>
                    <td>
                        <a href="${deleteLink}"
                           onclick="if (!(confirm('Are you sure you want to delete trainer with name: ${t.tfname} ${t.tlname}?')))
                                       return false">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>