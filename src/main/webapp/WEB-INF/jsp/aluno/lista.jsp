<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Alunos</title>
</head>
<body>
<a href="/aluno/novo"> Novo aluno</a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>CPF</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${alunos}" var="aluno">
				<tr>
					<td><a href="/aluno/visualizar/${aluno.codigo}">${aluno.codigo}</a></td>
					<td>${aluno.nome}</td>
					<td>${aluno.cpf}</td>
				</tr>
			</c:forEach>


		</tbody>




	</table>

</body>
</html>