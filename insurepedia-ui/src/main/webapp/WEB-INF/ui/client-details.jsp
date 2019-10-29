<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ include file='common/header.jspf'%>
<%@ include file='common/navigation.jspf'%>
<div class="container">
	
	<h3>Personal Details</h3>
	
	<form:form class='form-horizontal' method='post' commandName='client'>
		
		<!-- Title -->
		<div class='form-group'>
			<form:label path='title' class='control-label col-sm-2' >Title:</form:label>
			<div class='col-sm-10'>
				<form:input path='title' type="text" class='form-control' placeholder='Title'/>
				<form:errors path='title' cssClass='text-warning'/>
			</div>
		</div>
		
		<!-- Initials -->
		<div class='form-group'>
			<form:label path='initials' class='control-label col-sm-2'>Initials:</form:label>
			<div class="col-sm-10">
				<form:input path='initials' type='text' class='form-control' placeholder='Initials' />
				<form:errors path='initials' cssClass='text-warning'/>
			</div>
		</div>
		
		<!-- First Name -->
		<div class='form-group'>
			<form:label path='firstName' class='control-label col-sm-2'>First Name:</form:label>
			<div class='col-sm-10'>
				<form:input path='firstName' type='text' class='form-control' placeholder="First Name"/>
				<form:errors path='firstName' cssClass='text-warning'/>
			</div>
		</div>
		
		<!-- Middle Name -->
		<div class='form-group'>
			<form:label path='middleName' class="control-label col-sm-2">Middle Name:</form:label>
			<div class='col-sm-10'>
				<form:input path='middleName' type="text" class="form-control" placeholder="Middle Name"/>
				<form:errors path='middleName' cssClass='text-warning'/>
			</div>
		</div>
		
		<!-- Last Name -->
		<div class='form-group'>
			<form:label path='lastName' class="control-label col-sm-2">Last Name:</form:label>
			<div class='col-sm-10'>
				<form:input path='lastName' type="text" class="form-control" placeholder="Last Name" />
				<form:errors path='lastName' cssClass='text-warning'/>
			</div>
		</div>
		
		<!-- ID Number -->
		<div class='form-group'>
			<form:label path='idNumber' class='control-label col-sm-2'>ID Number:</form:label>
			<div class='col-sm-10'>
				<form:input path='idNumber' type="text" class="form-control" placeholder="ID Number"/>
				<form:errors path='idNumber' cssClass='text-warning'/>
			</div>
		</div>
		
		<!-- Date Of Birth -->
		<div class='form-group'>
			<form:label path='dateOfBirth' class='control-label col-sm-2'>Date of birth:</form:label>
			<div class='col-sm-10'>
				<%-- <form:input path='dateOfBirth' type="text" class="form-control" placeholder="Date of birth"/> --%>
				<fmt:formatDate pattern = 'dd-MM-yyyy' value = '${client.dateOfBirth}'/>
				<form:errors path='dateOfBirth' cssClass='text-warning'/>
			</div>
		</div>
		
		<div class='form-group'>
			<div class='col-sm-offset-2 col-sm-10'>
				<button type='submit' class='btn btn-default'>Submit</button>
				<a href='/clients-list' class = 'btn btn-default'>Back</a>
			</div>
		</div>
	</form:form>
</div>
<%@ include file='common/footer.jspf'%>
