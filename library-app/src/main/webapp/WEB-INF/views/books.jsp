<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<h2>
	<i>All library books:</i>
</h2>
<c:forEach items="${books}" var="book" varStatus="row">
${row.index}. Book genre: ${book.bookGenre} <br />
 Book author: ${book.bookAuthor} <br />
 Book title: ${book.bookTitle} <br /> 
 Book publisher: ${book.bookPublisher} <br />
 Availability: ${book.available} <br />
 <br />
</c:forEach>
</html>