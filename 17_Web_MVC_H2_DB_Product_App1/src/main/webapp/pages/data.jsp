
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"prefix="c"%>



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>insert title here</title>
</head>
<body>
    <a href="/"> + Add New Product</a>
    <table>
        <thead>
            <tr>
                <th>S.No</th>
                <td>Name</td>
                <td>Price</td>
                <td>Quantity</td>
            </tr>

            <tbody>
                <c:forEach item="${products}" var="product" varstatus="index">

                <tr>
                    <td>${index.count}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td>${product.qty}</td>

                </tr>
               </c:forEach>

            </tbody>
        </thead>
    </table>
    
</body>
</html>