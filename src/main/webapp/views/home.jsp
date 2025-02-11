<%-- 
    Document   : home
    Created on : 11 févr. 2025, 11:27:44
    Author     : kn_13
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1>Bienvenue user</h1>
<h2>Séance</h2>
<ul>
    <li><a href="/">Logout</a></li>
</ul>

<form>
    <select>
        <option value="COURS">COURS</option>
        <option value="TD">TD</option>
        <option value="TP">TP</option>
    </select>
    <br/>
    <br/>
    <input type="submit" value="Valider"/>
</form>
