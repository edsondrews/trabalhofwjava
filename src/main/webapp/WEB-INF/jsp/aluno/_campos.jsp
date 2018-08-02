<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<label for="nome"> Nome:</label>
 <input type="text" name="nome" id="nome" value="${aluno.nome}"> 
 <form:errors path="aluno.nome" />
 <label for="cpf"> CPF:</label>
 <input type="text" name="cpf" id="cpf" value="${aluno.cpf}">
<form:errors path="aluno.cpf" />


<label for="notas"> Notas </label>

<select name="naturalidade.codigo">
<c:forEach items="${disciplinas}" var="cidade">

<option value="${disciplina.codigo}">${disciplina.nome}</option>
</c:forEach>

</select>