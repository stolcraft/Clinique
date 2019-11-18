<%@page import="eu.ensup.clinique.service.MedecinService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date" %>
<%@ page import="eu.ensup.clinique.domaine.Medecin"%>
<%

MedecinService medserv = new MedecinService();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Démo JSP</title>
</head>
<body>
	Bonjour nous sommes <%= new Date() %> et on est en cours
</body>
</html>