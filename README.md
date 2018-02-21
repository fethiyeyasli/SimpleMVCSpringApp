# SimpleMVCSpringApp

# Platforms <br />
Apache Tomcat 8, <br />Spring MVC, <br />Java 8


Simple application listing  products on sale.<br />
index.jsp is for listing 2 product info.<br />
welcome.jsp if for about us.<br />



## Running Steps
You need to add valid apiKey to URL in WalmartApiService.java<br />  (/BookShopping/src/com/bookshopping/service/WalmartApiService.java)<br />
(String url = "http://api.walmartlabs.com/v1/items?ids=12417832,19336123&apiKey=*********";)<br />
Add project to tomcat server. <br />
Run tomcat server.<br />
URL looks like with related port : http://localhost:8080/BookShopping/index.html<br />

