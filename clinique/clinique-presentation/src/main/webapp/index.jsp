<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date" %>
<%@ page import="eu.ensup.formulaire.domaine.Medecin"%>
<%

Medecin med = new Medecin();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Démo JSP</title>
</head>
<body>
	Bonjour nous sommes <%= new Date() %> et on est en cour
</body>
</html>