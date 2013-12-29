<%@ page import="redpill.Contact" %>



<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'value', 'error')} ">
	<label for="value">
		<g:message code="contact.value.label" default="Value" />
		
	</label>
	<g:textArea name="value" cols="40" rows="5" maxlength="512" value="${contactInstance?.value}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'priority', 'error')} required">
	<label for="priority">
		<g:message code="contact.priority.label" default="Priority" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="priority" type="number" value="${contactInstance.priority}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="contact.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="type" from="${redpill.ContactType?.values()}" keys="${redpill.ContactType.values()*.name()}" required="" value="${contactInstance?.type?.name()}"/>
</div>

