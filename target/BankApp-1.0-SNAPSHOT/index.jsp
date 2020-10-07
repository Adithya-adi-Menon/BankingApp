<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css'>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js'></script>
	<link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'>
	<script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
	<link rel="stylesheet" href="css/style.css">
	<script src="js/index.js"></script>
	<title>Document</title>
</head>
<body style="background-image:url('imges/banking1.jpg'); background-repeat: no-repeat;">
	<div class="animation01">
        <div class="rhombus_small">
            <div class="rhombus">
                <div class="border_box">
                    <span class="line line01"></span>
                    <span class="line line02"></span>
                    <span class="line line03"></span>
                    <span class="line line04"></span>
                    <span class="circle circle01"></span>
                    <span class="circle circle02"></span>
                    <span class="circle circle03"></span>
                    <span class="circle circle04"></span>
                    <span class="animation_line animation_line01"></span>
                    <span class="animation_line_wrapper animation_line02_wrapper"><span class="animation_line animation_line02"></span></span>
                    <span class="animation_line animation_line03"></span>
                    <span class="animation_line_wrapper animation_line04_wrapper"><span class="animation_line animation_line04"></span></span>
                    <span class="animation_line animation_line05"></span>
                    <span class="animation_line_wrapper animation_line06_wrapper"><span class="animation_line animation_line06"></span></span>
                    <span class="animation_line animation_line07"></span>
                    <span class="animation_line_wrapper animation_line08_wrapper"><span class="animation_line animation_line08"></span></span>
                </div>
                <div class="wave">
                    <div class="wave_wrapper"><div class="wave_box"></div></div>
                </div>
            </div>
        </div>
    </div>
    <div class="animation02">
        <div class="rhombus_box">
            <span class="rhombus_item_wrapper rhombus_item01_wrapper"><span class="rhombus_item"></span></span>
            <span class="rhombus_item_wrapper rhombus_item02_wrapper"><span class="rhombus_item"></span></span>
        </div>
        <div class="double_content">
            <div class="double_wrapper02 dotted02"><div class="dotted_hide"><div class="double_wrapper01 dotted01"><span class="dotted_right"></span></div></div></div>
            <div class="double_wrapper02 white02"><div class="double_wrapper01 white01"></div></div>
            <div class="double_wrapper02 gray02"><div class="double_wrapper01 gray01"></div></div>
            <div class="double_wrapper02 orange02"><div class="double_wrapper01 orange01"></div></div>
        </div>
        <div class="name">
			<p>Sparks Foundation : Banking App
                <a href="<%=request.getContextPath()%>/customers?action=ViewCustomers"><button type="button" id="animatebutton" class="btn btn-info btn-icon-text animatebutton"><i class="fa fa-check btn-icon-prepend"></i>View Customers</button></a>
			</p>
            <span class="name_circle01"></span>
            <span class="name_circle02"></span>
        </div>
    </div>
	
</body>
</html>