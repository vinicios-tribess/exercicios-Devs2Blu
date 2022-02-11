<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="classes.Aluno"%>
<%@ page import="classes.MenuPrincipal"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>

<%
	MenuPrincipal menu = new MenuPrincipal();
	if(menu.chamaIncluirAluno("Vinicios", "Tânia", "Edemir", "2001-01-31", 9.0, "A")) {
		System.out.println("Cadastrado com sucesso!");
	} else {
		System.out.println("Não cadastrado com sucesso!");
	}
%>
</body>
</html>