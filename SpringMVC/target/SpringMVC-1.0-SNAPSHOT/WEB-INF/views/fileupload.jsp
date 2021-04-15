<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 09-03-2021
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>
<h3>Upload file</h3>
<form action="uploading" method="post" enctype="multipart/form-data">
    <label for="myFile">Select a file:</label>
    <input type="file" id="myFile" name="profile">
    <button type="submit">Upload</button>

</form>



</body>
</html>
