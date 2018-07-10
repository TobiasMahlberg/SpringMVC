<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

	<div class="container">
	<a class="btn btn-warning" href="/add-todo"><spring:message code="todo.add" /></a>

		<table class="table table-striped">
			<caption><spring:message code="todo.caption" /></caption>

			<thead>
				<tr>
					<th><spring:message code="todo.desc" /></th>
					<th><spring:message code="todo.date" /></th>
					<th><spring:message code="todo.completed" /></th>
					<th></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}" /></td>
						<td>${todo.done}</td>
						<td>
							<a type="button" class="btn btn-primary" href="/update-todo?id=${todo.id}"><spring:message code="todo.edit" /></a>
							<a type="button" class="btn btn-warning" href="/delete-todo?id=${todo.id}"><spring:message code="todo.delete" /></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

<%@ include file="common/footer.jspf"%>