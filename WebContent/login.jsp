<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css">
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<link rel="stylesheet" href="./css/login.css">
	<title>ログイン画面</title>
</head>
<body>
	<header>
		<div id="logo">THE ECSITE</div>
    </header>

    <div id="main">
    	<div class="box1">
    		<p>ログイン認証</p>
            <form method="post" action="LoginAction">
            	<b>ID</b><br>
            	<input class="field" type="text" name="loginUserId" placeholder="ユーザーIDを入力"><br>
            	<b>Password</b><br>
                <input class="field" type="password" name="loginPassword" placeholder="パスワードを入力"><br>
                <input type="submit" value="ログイン">
            </form>
                <p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
				<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
        </div>
    </div>

        <footer>
        </footer>
</body>
</html>