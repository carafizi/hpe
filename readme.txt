Application provides a RESTful service to calculate result from a provided algebraic formula represented in POSTFIX notation.

Service supports the following binary operators: + - * /
Service supports the following unary operators: sizeof(string) and abs(int)
Service supports string and numeric operands.

The applications is bundled with an embedded tomcat, so you don't need to deploy war anywhere. Just go to the root directory of the bundle
and run:

mvn tomcat7:run

If you prefer to deploy war file to your own servlet container run: 'mvn clean install' and grab hpe.war from the target directory.


HOW TO USE:

You can use http://www.mathblog.dk/tools/infix-postfix-converter/ to convert your formula from infix to postfix notation. However it doesn't support functions

Input example:

infix formula:   (3+4) * 5 + sizeof(count_me) + abs(-17)
postfix formula: 3 4 + 5 * count_me sizeof + 17 - abs +

json to be used in the POST request body:
{
  "elements":["3", "4", "+", "5", "*", "count_me", "sizeof", "+", "-17", "abs", "+"]
}


Once the application is up and running start you favorite REST client (Postman, SoapUI, etc..) and call the following resource:
POST http://localhost:8087/hpe

Headers:
Accept - application/json
Content-type - application/json

Request body: the json example from above or any other json representation of a formula in a postfix notation


Response of the service is a json representation of the Result object with a value representing either calculation result of error string