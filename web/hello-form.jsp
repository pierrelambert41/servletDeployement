<%--
  Created by IntelliJ IDEA.
  User: pierre
  Date: 15/10/18
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Mon Formulaire</title>
  </head>
  <body>
  <form action="simple-hello" method=POST>
    <label>Votre nom</label><br><input name="name" type="text"><br>
    <label>Votre prénom</label><br><input name="surname" type="text"><br>
    <label>Heure de la journée</label><br><input name="hour" type="text"/><br>
    <input type="submit" value="Envoyer le formumlaire">
  </form>
  </body>
</html>
