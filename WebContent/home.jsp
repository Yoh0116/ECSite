<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta http-equiv="imagetoolbar" content="no">
	<meta name="description" content="">
	<meta name="keywords" content="">
	<link rel="stylesheet" href="./css/style.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>

        <script>
            $(document).ready(function(){
                $('.slider').bxSlider({
                    auto:true,
                    autoDirection:'next',
                    minSlides:3
                });
            });
        </script>
	<title>Home画面</title>
</head>
<body>
	<header>
            <div id="logo">THE ECSITE</div>
        </header>

        <div id="main">
            <div class="box1">
                <div class="slider">
                    <div><img src="./img/img01.jpg" height=400px></div>
                    <div><img src="./img/img02.jpg" height=400px></div>
                    <div><img src="./img/img03.jpg" height=400px></div>
                    <div><img src="./img/img04.jpg" height=400px></div>
                </div>
            </div>
            <div class="box2">
            	<div class="box3">
                	<s:form action="LoginAction">
                    	<s:submit value="商品購入"/>
                	</s:form>
                </div>
            </div>
        </div>

	<footer>
	</footer>
</body>
</html>