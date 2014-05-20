<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
  </style>  
</head>
<body>
<h1><fmt:message key="Add new Office"/></h1>
<form:form method="post" commandName="addOffice">
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="20%">Name:</td>
        <td width="20%">
          <form:input path="name"/>
        </td>
        <td width="60%">
          <form:errors path="name" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%">Street:</td>
        <td width="20%">
          <form:input path="street"/>
        </td>
        <td width="60%">
          <form:errors path="street" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%">Phone:</td>
        <td width="20%">
          <form:input path="phone"/>
        </td>
        <td width="60%">
          <form:errors path="phone" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%">Zip:</td>
        <td width="20%">
          <form:input path="zip"/>
        </td>
        <td width="60%">
          <form:errors path="zip" cssClass="error"/>
        </td>
    </tr>
  </table>
  <br>
<input type="submit" value="Execute">
</form:form>



<a href="<c:url value="hello.htm"/>">Home</a>
 
</body>
 
</html>