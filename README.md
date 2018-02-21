# SimpleMVCSpringApp

Platforms
Apache Tomcat 8
Spring MVC
Java 8


Simple application listing  products on sale.
index.jsp is for listing 2 product info.
welcome.jsp if for about us.



Running Steps
-You need to add valid apiKey to URL in WalmartApiService.java  (/BookShopping/src/com/bookshopping/service/WalmartApiService.java)
(String url = "http://api.walmartlabs.com/v1/items?ids=12417832,19336123&apiKey=*********";)
-Add project to tomcat server. 
-Run tomcat server.
-URL looks like with related port : http://localhost:8080/BookShopping/index.html
