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
	<title>登録内容変更</title>
	<style type="text/css">
		/* ========TAG LAYOUT======== */
		body {
		   margin:0;
		   padding:0;
		   line-height:1.6;
		   letter-spacing:1px;
		   font-family:Verdana, Helvetica, sans-serif;
		   font-size:12px;
		   color:#333;
		   background:#fff;
		}

		table {
			text-align:center;
			margin:0 auto;
		}

		/* ========ID LAYOUT======== */
		#top {
		   width:90%;
		   margin:30px auto;
		   border:1px solid #333;
		}

		#header {
		   width: 100%;
		   height: 80px;
		   background-color: black;
		}

		#main {
		   width: 100%;
		   height: 500px;
		   text-align: center;
		}

		#footer {
			width: 100%;
			height: 80px;
			background-color: black;
			clear:both;
		}
	</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserReCreate</p>
		</div>
		<div>
			<s:if test="errorMassage !=''">
				<s:property value="errorMassage" escape="false"/>
			</s:if>
			<table>
			<s:form action="ChangeUserInfoConfirmAction">
				<tr>
					<td>
						<label>元々のID:</label>
					</td>
					<td>
						<input type="text" name="oldUserId" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>元々のログインPASS:</label>
					</td>
					<td>
						<input type="text" name="oldPassword" value="" />
					</td>
				</tr>
					<td>
					</td>
				<tr>
				</tr>
				<tr>
					<td>
						<label>新しいログインID:</label>
					</td>
					<td>
						<input type="text" name="newUserId" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>新しいログインPASS:</label>
					</td>
					<td>
						<input type="text" name="newPassword" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>新しいユーザー名:</label>
					</td>
					<td>
						<input type="text" name="newuserName" value="" />
					</td>
				</tr>
				<s:submit value="登録"/>
			</s:form>
			</table>
			<div>
				<span>前画面に戻る場合は</span><a href='<s:url action="HomeAction"/>'>こちら</a>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>