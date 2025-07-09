<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h3>Product Info</h3>
    <P> 
    <font color="green">${msg}</font>
    </p>
    <form:form action="Product" modelAttribute="p" method="POST">

        <table> 
            <tr>
                <td>Name:</td>
                <td><form:input path="name"/> </td>
               </tr>

               <tr>
                <td>Price:</td>
                <td><form:input path="price"/> </td>
               </tr>

               <tr>
                <td>Quantity:</td>
                <td><form:input path="qty"/> </td>
               </tr>

               <tr>
                <td><input type="submit" value="save"</td>
               </tr>
        </table>

    </form:form>
    <a href="products">View products</a>
    
</body>
</html>