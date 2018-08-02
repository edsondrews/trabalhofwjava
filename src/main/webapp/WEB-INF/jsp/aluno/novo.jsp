<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro aluno</title>
</head>
<body>
	<form action="/aluno/salvar" method="post">

		<c:import url="_campos.jsp" />
		<button type="submit">Salvar</button>
		<a href="/aluno/listar"> Cancelar</a>
	</form>

</body>
</html>