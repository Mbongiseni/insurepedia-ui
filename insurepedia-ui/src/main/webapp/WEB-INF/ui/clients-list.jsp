<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file='common/header.jspf'%>
<%@ include file='common/navigation.jspf'%>
<div class="container">

	<table class='table table-striped'>
		<caption>Clients List</caption>
		<thead>
			<tr>
				<th>Title</th>
				<th>Initials</th>
				<th>First Name</th>
				<th>Middle Name</th>
				<th>Last Name</th>
				<th>ID Number</th>
				<th>Date of Birth</th>
				<th>&nbsp;</th>
				<th>&nbsp;</th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${clientList}" var="client">
				<tr>
					<td>${client.title}</td>
					<td>${client.initials}</td>
					<td>${client.firstName}</td>
					<td>${client.middleName}</td>
					<td>${client.lastName}</td>
					<td>${client.idNumber}</td>
					<td><fmt:formatDate pattern = 'dd-MM-yyyy' value = '${client.dateOfBirth}'/></td>
					<td>
						<a class='btn btn-success' href='/update-client?clientId=${client.clientId}'>View</a>
					</td>
					<td>
						<a class='btn btn-success' href='/update-client?clientId=${client.clientId}'>Update</a>
					</td>
					<td>
					 	<a class='btn btn-danger' href='/delete-client?clientId=${client.clientId}'>Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<a href='/client-details' class = 'btn btn-default'>Add Client</a>
</div>
<%@ include file='common/footer.jspf'%>
