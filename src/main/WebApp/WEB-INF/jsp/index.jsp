<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>

    <title>The 5 Deadliest Viruses On Earth </title>
    <style>

        body {

            background-color: floralwhite;

        }

        div {

            background-color: floralwhite;

        }

        table {

            border-collapse: collapse;
            font-family: "Helvetica";
            text-align: left;
            width: 100%;
            padding: 15px;

        }

        table, th, td {

            font-size: 14px;
            border-bottom: 3px solid slategray;
            padding: 10px;
            column-width: fit-content;
            height: 50px;


        }

        td {
            font-family: Georgia;
        }

        th {
            height: 20px;
            text-shadow: none;

            background-color: darkslategrey;
            color: white;

        }

        tr:hover {

            background-color: aliceblue;

        }

        tr:nth-child(even) {

            background-color: ghostwhite;

        }

        h2 {
            font-family: Georgia;

            text-shadow: 2px 2px 5px white;
            padding: 20px;
            background-color: floralwhite;
            font-variant: small-caps;
            font-size: 50px;
            border-bottom: solid 5px;
            border-bottom-color: black;

        }

        img {
            max-width: 100px;
        }






    </style>
</head>
<body>
<div>

    <h2>The 5 Deadliest Viruses On Earth</h2>



<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Symptoms</th>
        <th>Duration</th>
        <th>Mortality Rate</th>
        <th>Image</th>
    </tr>


    <jsp:useBean id="data" scope="request" type="java.util.List"/>
    <c:forEach var = "dataListItem" items = "${data}">
        <tr>

            <td>${dataListItem.getId()}</td>
            <td>${dataListItem.getName()}</td>
            <td>${dataListItem.getDescription()}</td>
            <td>${dataListItem.getSymptoms()}</td>
            <td>${dataListItem.getDuration()}</td>
            <td>${dataListItem.getMortalityRate()}</td>
            <td><img src="${dataListItem.getImageaddress()}"></td>

        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
