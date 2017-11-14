<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription</title>
	<link rel="stylesheet" href="normalize.css">
	<link rel="stylesheet" href="style.css">
</head>
<body>
	<Center>
		<p><h1> Inscription </h1></p>
	</Center>
Date : <%= new java.util.Date().toString() %> <br>

<form action="Inscription" method="post">
    <p><table border="0" cellpadding="7" cellspacing="1" width="90%" align="center">
         <tr>
            <td bgcolor="#FF9900" ><b>Adresse mail</b></td>
            <td><input type="text" name="email"></td>
        </tr>
         <tr>
            <td bgcolor="#FF9900" ><b>Mot de Passe</b></td>
            <td><input type="password" name="mdp"></td>
        </tr>
        <tr>
            <td bgcolor="#FF9900" ><b>Nom</b></td>
            <td><input type="text" name="nom"></td>
        </tr>
        <tr>
            <td bgcolor="#FF9900" ><b>Prénom</b></td>
            <td><input type="text" name="prenom"></td>
        </tr>
        <tr>
            <td bgcolor="#FF9900" ><b>Téléphone</b></td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td bgcolor="#FF9900" ><b>Boite Postale</b></td>
            <td><input type="text" name="bp"></td>
        </tr>
         
       
    </table></p>
    <br><br><br><p align="center"><input type="submit" value="Enregistrer"></p>
</form>


</body>
</html>