
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html >
<html>
    <head>
        <meta  charset="UTF-8"/>
       <!-- <script src="<c:url value="public/js/jquery-3.2.1.min.js"/>" </script>-->
        <link rel="stylesheet" href="<c:url value="/public/css/login.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/fonts/style.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/bootstrap.css"/>"/>
        
        <title>GESTION DE TUTORIAS</title>
    </head>

    <body>
    <div class="my-content" >
        <div class="container" > 

            <div class="row">
              <div class="col-sm-12" >
                  <h1 style="color: whitesmoke"><strong>Gesis</strong> Gestion de Tutorias</h1>
                  <div class="mydescription">
                    <p></p>
                  </div>
              </div>
            </div>

            <div class="row">
                  <div class="col-sm-6 col-sm-offset-3 myform-cont" >
                      <div class="myform-top">
                          <div class="myform-top-left">
                              <h3 style="color: whitesmoke">Ingresa al Sistema.</h3>
                              <p style="color: whitesmoke">Digita tu usuario y contraseña:</p>
                          </div>
                          <div class="myform-top-right">
                              <i style="color:whitesmoke" class="icon-key"></i>
                          </div>
                      </div>
                      <div class="myform-bottom">
                          <form role="form" action="<c:url value="/Principal.htm"/>" method="post" class="">
                          <div class="form-group">
                              <input type="text" name="form-username" placeholder="Usuario..." class="form-control" id="form-username">
                          </div>
                          <div class="form-group">
                              <input type="password" name="form-password" placeholder="Contraseña..." class="form-control" id="form-password">
                          </div>
                          <button type="submit" class="mybtn">Entrar</button>
                        </form>
                      </div>
                  </div>
            </div>
    </body>
</html>
