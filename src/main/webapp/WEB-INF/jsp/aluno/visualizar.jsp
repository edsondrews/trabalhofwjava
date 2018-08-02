<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar aluno</title>
</head>
<body>
	<form action="/aluno/alterar" method="post">
		<input type="hidden" name="codigo" value="${aluno.codigo}">
		<c:import url="_campos.jsp" />
		<button type="submit">Salvar</button>
		 <a href="/aluno/listar"> Cancelar</a> 
		 <a href="/aluno/deletar/${aluno.codigo}"> Deletar</a>
	</form>

</body>
</html>