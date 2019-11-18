<%@page import="eu.ensup.clinique.service.MedecinService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.Date" %>
<<<<<<< HEAD
<%@ page import="eu.ensup.clinique.service.*"%>
<%@ page import="eu.ensup.clinique.domaine.*"%>
=======
<%@ page import="eu.ensup.clinique.domaine.Medecin"%>
>>>>>>> refs/remotes/origin/master
<%
<<<<<<< HEAD
Collection<Patient> listePatient = new ArrayArrayList<Patient>
MedecinService medecinservice = new MedecinService();
listePatient = medecinservice.listerPatient();
=======

MedecinService medserv = new MedecinService();
>>>>>>> refs/remotes/origin/master
%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
  <%@include file="css/style.css" %>
  </style>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Clinique KevRil</title>
</head>
<body>
<<<<<<< HEAD
<h1>Bienvenue dans la clinique en ligne</h1>
	Bonjour nous sommes <%= new Date() %> et on est en cour
	
	
	<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
       <th scope="col">Email</th>
      <th scope="col">Adresse</th>
      <th scope="col">Sexe</th>
     
    </tr>
  </thead>
  <tbody>
  <%
		for ( int i=0; i<listePatient.size(); i++ )
		{
%>
    <tr>
      <th scope="row"><% out.println(i); %></th>
      <td><% out.println(listePatient.get(i).getNom()); %></td>
      <td><% out.println(listePatient.get(i).getPrenom()); %></td>
      <td><% out.println(listePatient.get(i).getMail()); %></td>
      <td><% out.println(listePatient.get(i).getAdresse()); %></td>
      <td><% out.println(listePatient.get(i).getSexe()); %></td>
    </tr>
    <% } %>
  </table>
  
=======
	Bonjour nous sommes <%= new Date() %> et on est en cours
>>>>>>> refs/remotes/origin/master
</body>
</html>