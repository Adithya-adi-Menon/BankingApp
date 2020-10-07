<%--
  Created by IntelliJ IDEA.
  User: adith
  Date: 07-10-2020
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Success</title>
    <link rel="stylesheet" href="css/transact.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>

<div class="modal-dialog modal-confirm">
    <div class="modal-content">
        <div class="modal-header">
            <div class="icon-box">
                <i class="material-icons">&#xE876;</i>
            </div>
            <h4 class="modal-title w-100">Awesome!</h4>
        </div>
        <div class="modal-body">
            <p class="text-center">Your transaction is successful.</p>
        </div>
<%--        <% response.sendRedirect("viewcustomers.jsp");%>--%>
        <div class="modal-footer">
            <a href="index.jsp"><button class="btn btn-success btn-block"  data-dismiss="modal">OK</button></a>
        </div>
    </div>
</div>
</div>
</body>
</html>
