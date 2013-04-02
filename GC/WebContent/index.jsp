<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
	<c:when test="${param['inicio'] == 'true'}">		
		<c:redirect url="/pages/index.jsf?inicio=true"></c:redirect>
	</c:when>
	<c:otherwise>		
		<jsp:forward page="/pages/login/paginas/login.jsf"></jsp:forward>				
	</c:otherwise>
</c:choose>

<!-- 
 <jsp:forward page="/pages/login/paginas/login.jsf"></jsp:forward>
 -->