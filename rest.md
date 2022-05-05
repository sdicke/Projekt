# Status codes applicable to all endpoints


# Endpoints

## All recipes

* End point: /recipe/_all
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * Response JSON type: A
* * Status codes:

# A specific recipe

* End point: /recipe/*ID*
* * Method: HEAD
* * Request MIME: (none)
* * Response MIME: (none)
* * Status codes:  

* End point: /recipe/*ID*
* * Method: POST
* * Request MIME: application/x-www-form-urlencoded
* * Request data: (See description below)
* * Response MIME: (none)
* * Status codes:

* End point: /recipe/*ID*
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Status codes:  

# A specific recipe's title

* End point: /recipe/*ID*/title
* * Method: GET
* * Request MIME: (none)
* * Response MIME: text/plain
* * Status codes:  

* End point: /recipe/*ID*/title
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Status codes:  

* End point: /recipe/*ID*/title
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Status codes:

# A specific recipe's ingrients

* End point: /recipe/*ID*/ingrients
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
*  * Response JSON type: D
* * Status codes:  

* End point: /recipe/*ID*/ingredients
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Status codes:  

* End point: /recipe/*ID*/ingredients
* * Method: PUT
* * Request MIME: application/json
*  * Response JSON type: E
* * Response MIME: (none)
* * Status codes:

# A specific recipe's preparation

* End point: /recipe/*ID*/preparation
* * Method: GET
* * Request MIME: (none)
* * Response MIME: text/plain
* * Status codes:  

* End point: /recipe/*ID*/preparation
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Status codes:  

* End point: /recipe/*ID*/preparation
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Status codes:

# A specific recipe's categories

* End point: /recipe/*ID*/categories
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * Response JSON type: F
* * Status codes:  

* End point: /recipe/*ID*/categories/*CID*
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Status codes:  

* End point: /recipe/*ID*/categories/*CID*
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Status codes:

# A specific recipe's additions

* End point: /recipe/*ID*/addtion/_all
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * Response JSON type: G
* * Status codes: 

* End point: /recipe/*ID*/addtion/*AID*
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * * Response JSON type: H
* * Status codes:  

* End point: /recipe/*ID*/additon/*AID*
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Status codes:  

* End point: /recipe/*ID*/addition/*AID*
* * Method: PUT
* * Request MIME: application/json
* * Request JSON type: J
* * Response MIME: (none)
* * Status codes:

* End point: /recipe/*ID*/addition/*AID*/
* * Method: POST
* * Request MIME: application/x-www-form-urlencoded
* * Request data: (See description below)
* * Response MIME: (none)
* * Status codes:

# JSON

Here are the JSON types mentions above. In the round brackets there are the respective data type.

## Type A

{
    "recipes" : [(number)]
}

## Type B

{
    
}

## Type C

{
    
}

## Type D

{
    "ingredients" : [(string)]
}

## Type E

{
    "ingredients": [(string)]
}

## Type F

{
    "categories" : [
                                {
                                    "id": (number), 
                                    "name": (string)
                                 }
                              ]
}

## Type G

{
    additons: [(number)]
}

## Type H

{
   "id": (number), 
   "name": (string),
    "created": (string),
    "text": (string),
    "owner": (string),
    "creator": (string),
    "state": (string, values: ["new", "unchecked", "checked"])
}

## Type I

This type is identical to type H.

{
   "id": (number), 
   "name": (string),
    "created": (string),
    "text": (string),
    "owner": (string),
    "creator": (string),
    "state": (string, values: ["new", "unchecked", "checked"])
}

# Keys for the end point: /recipe/*ID*

* title

# Keys for the endpoint /recipe/*ID*/addition/*AID*/

The available keys are:
* owner
* state

The admissible values for state are:
* unchecked
* checked