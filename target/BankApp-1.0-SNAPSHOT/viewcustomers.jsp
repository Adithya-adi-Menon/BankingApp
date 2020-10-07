<%@ page import="models.customers" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/viewcustomers.css">
    <title>Document</title>
</head>
<body>
<%! customers customer ;%>


</a>


<div class="tariffCards" style="margin-left: 50px" >
    <% List<customers> customer = (List<customers>) request.getAttribute("customers");
        for(customers customer_s : customer)
        {
    %>
            <div class="first">
                <a href="<%=request.getContextPath()%>/viewcustomer?action=customer&id=<%=customer_s.getId()%>">
                    <div class="first">
                        <img src="images/card4img.jpg" alt="Economy" height="74">
                        <h3><%=customer_s.getName()%></h3>
                        <span>Full Insurance</span>
                    </div>
                </a>
            </div>
    <%
        }
    %>
</div>




    
</body>
</html>