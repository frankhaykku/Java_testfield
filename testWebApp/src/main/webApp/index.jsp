<%@ page import="Auth.Login" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>

  <% Login login = new Login(); %>
<h2>sdfdsf</h2>
    <div id="LoginForm"style="margin: 20% 30%; width: 40%; height: 25%; padding-top: 50px ; border-radius: 30px; border: solid 1px black;
    -webkit-box-shadow: 10px 10px 25px #000000; box-shadow: 10px 10px 25px #000000;
    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#b2e1ff), color-stop(100%,#66b6fc));">
      <form action="#" method="post">
        <table align="center" style="border: solid 1px black">
          <tr style="background-color: brown">
            <td><img src="images/logo.png" height="851" width="85"></td>
            <td><b><p align="center" >Форма входа</p></b></td>
          </tr>
          <tr>
            <td width="150px"><p>User:</p></td>
            <td><input type="text" name="user" value="${param["user"]}"></td>
          </tr>
          <tr>
            <td><p>Password:</p></td>
            <td><input type="password" name="pass" value="${param["pass"]}"></td>
          </tr>
          <tr>
            <td></td>
            <td align="right"><input type="submit" name="Login" value="Log in"></td>
          </tr>
          <tr>
          <% if(login.check(request.getParameter("user"), request.getParameter("pass"))) { %>
            <td><p align="center"><b>ACCESS GRANTED:</b></p></td>
            <td><p align="right">Вход разрешен</p></td>
          <%}%>
          </tr>

        </table>
      </form>
    </div>
  </body>
</html>
