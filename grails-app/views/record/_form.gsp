<%@ page import="redpill.Record" %>



<div class="fieldcontain ${hasErrors(bean: recordInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="record.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${recordInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: recordInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="record.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${recordInstance?.name}"/>
</div>

