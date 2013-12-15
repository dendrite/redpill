<%@ page import="redpill.Person" %>



<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'dateOfBirth', 'error')} required">
    <label for="dateOfBirth">
        <g:message code="person.dateOfBirth.label" default="Дата рождения"/>
        <span class="required-indicator">*</span>
    </label>
    <g:datePicker name="dateOfBirth" precision="day" value="${personInstance?.dateOfBirth}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'firstName', 'error')} ">
    <label for="firstName">
        <g:message code="person.firstName.label" default="First Name"/>

    </label>
    <g:textField name="firstName" value="${personInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'lastName', 'error')} ">
    <label for="lastName">
        <g:message code="person.lastName.label" default="Last Name"/>

    </label>
    <g:textField name="lastName" value="${personInstance?.lastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'middleName', 'error')} ">
    <label for="middleName">
        <g:message code="person.middleName.label" default="Middle Name"/>

    </label>
    <g:textField name="middleName" value="${personInstance?.middleName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: personInstance, field: 'records', 'error')} ">
    <label for="records">
        <g:message code="person.records.label" default="Records"/>

    </label>
    <g:select name="records" from="${redpill.Record.list()}" multiple="multiple" optionKey="id" size="5"
              value="${personInstance?.records*.id}" class="many-to-many"/>
</div>

