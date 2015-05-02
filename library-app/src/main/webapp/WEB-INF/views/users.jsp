<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<h2>
	<i>All library users:</i>
</h2>
<c:forEach items="${users}" var="user" varStatus="row">
${row.index}. <br />
 The name of the user: ${user.userName} <br />
 User address: ${user.userAddress} <br />
 User city: ${user.userCity} <br /> 
 Registration Date: ${user.userRegistrationDate} <br />
<br />
</c:forEach>
</html>