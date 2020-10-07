<%@ page import="models.customers" %>
<%@ page import="java.util.List" %>
<%@ page import="models.customerDao" %>
<html>

<head>
  <link href="https://fonts.googleapis.com/css?family=Inconsolata" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Quicksand" rel="stylesheet">
  <link rel="stylesheet" href="https://pattern.kivan-works.com/fonts/kredit.css">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="css/singlecustomer.css">
  <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
  <script src="js/singlecustomer.js"></script>


  
</head>
<%! customers customer ;%>
<% customer = (customers)request.getAttribute("customer");%>
<%=customer.getId()%>

<body class="active">
     
  <div class="floating">
    <div class="thickness"></div>
    <div class="thickness"></div>
    <div class="thickness"></div>
    <a href="sadsas" data-toggle="modal" data-target="#exampleModal" data-whatever="@mdo">
    <div class="card_body">
      <div class="paypal_center svg"></div>
      <div class="logo svg"></div>
      <div class="paywave svg"></div>
      <div class="chips svg"></div>
      <div class="card_no text">
        Bal:<%= customer.getCurrentbal()%>
      </div>
      <div class="valid text">

      </div>
      <div class="valid_date text">
        <%= customer.getEmail()%>
      </div>
      <div class="holder text"> <%= customer.getName()%></div>
      <div class="mastercard_icon svg"></div>
    </a>
    </div>

  </div>
  <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Transact Money</h5>
          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">&times;</span>
          </button>
        </div>
        <div class="modal-body">
          <form action="<%=request.getContextPath()%>/transact?action=transact&curr_userid=<%=customer.getId()%>" method="post">
            <div class="form-group">
              <label for="recipient-money" class="col-form-label">Amount</label>
              <input type="text" name="amount" class="form-control" id="recipient-money">
            </div>
            <div class="form-group">

              <label for="user" class="col-form-label"></label>

              <select name="user" class="form-control" id="user" >
                <% List<customers> customer = new customerDao().listcustomers();
                  for(customers customer_s : customer)
                  {
                %>
                <option value="<%=customer_s.getId()%>" ><%=customer_s.getName()%></option>

                <%}%>
              </select>

            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
              <button type="submit" class="btn btn-primary">Send Money</button>
            </div>
          </form>
        </div>

      </div>
    </div>
  </div>
</body>

</html>