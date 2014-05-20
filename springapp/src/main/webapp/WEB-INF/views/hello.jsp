<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <p><fmt:message key="greeting"/> <c:out value="${model.now}"/></p>
    <h3>Offices</h3>
    <c:forEach items="${model.offices}" var="office">
      <c:out value="${office.name}"/> <i><c:out value="${office.street}"/></i><br><br>
    </c:forEach>
    <br>
    <a href="<c:url value="addoffice.htm"/>">Añadir Oficina</a>
    <br>
  </body>
</html>