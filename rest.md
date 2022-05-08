# Status codes applicable to all endpoints
* 400 Bad Request
* 500 Internal Server Error

# Endpoints

## All recipes

* End point: /recipe/_all
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * Response JSON type: A
* * Authentication required: no
* * Status codes:
* * * 200 OK
* * * 404 Not Found

# Session initialisation
* End point: /session
* * Method: POST
* * Request MIME: application/json
* * Request JSON type: Y
*  Authentication required: no
* * Status codes:
* * * 201 Created – if successful
* * * 403 Forbidden – if not successful

# A specific recipe

* End point: /recipe/*ID*
* * Method: GET
* * Request MIME: (none)
* * Response MIME: (none)
* * Response JSON type: X
* * Authentication required: no
* * Status codes:
* * * 200 OK
* * * 404 Not Found

* End point: /recipe/_create
* * Method: POST
* * Request MIME: text/plain
* * Request data: (See description below)
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 201 Created
* * * 403 Forbidden

* End point: /recipe/*ID*
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

# A specific recipe's title

* End point: /recipe/*ID*/title
* * Method: GET
* * Request MIME: (none)
* * Response MIME: text/plain
* * Authentication required: no
* * Status codes:
* * * 200 OK
* * * 404 Not Found

* End point: /recipe/*ID*/title
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

* End point: /recipe/*ID*/title
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

# A specific recipe's ingredients

* End point: /recipe/*ID*/ingredients
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * Response JSON type: B
* * Authentication required: no
* * Status codes:
* * * 200 OK
* * * 404 Not Found

* End point: /recipe/*ID*/ingredients
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

* End point: /recipe/*ID*/ingredients
* * Method: PUT
* * Request MIME: application/json
* * Response JSON type: C
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

# A specific recipe's preparation

* End point: /recipe/*ID*/preparation
* * Method: GET
* * Request MIME: (none)
* * Response MIME: text/plain
* * Authentication required: no
* * Status codes:
* * * 200 OK
* * * 404 Not Found

* End point: /recipe/*ID*/preparation
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

* End point: /recipe/*ID*/preparation
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

# A specific recipe's categories

* End point: /recipe/*ID*/categories
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * Response JSON type: D
* * Authentication required: no
* * Status codes:
* * * 200 OK
* * * 404 Not Found

* End point: /recipe/*ID*/categories/*CID*
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

* End point: /recipe/*ID*/categories/*CID*
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

# A specific recipe's additions

* End point: /recipe/*ID*/addition/_all
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* * Response JSON type: E
* * Authentication required: no
* * Status codes:
* * * 200 OK
* * * 404 Not Found

* End point: /recipe/*ID*/addition/*AID*
* * Method: GET
* * Request MIME: (none)
* * Response MIME: application/json
* *  Response JSON type: F
* * Authentication required: no
* * Status codes:

* End point: /recipe/*ID*/addition/*AID*
* * Method: DELETE
* * Request MIME: (none)
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

* End point: /recipe/*ID*/addition/*AID*/owner
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

* End point: /recipe/*ID*/addition/*AID*/state
* * Method: PUT
* * Request MIME: text/plain
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

* End point: /recipe/*ID*/addition/*AID*/
* * Method: PUT
* * Request MIME: application/json
* * Request JSON type: H
* * Response MIME: (none)
* * Authentication required: yes
* * Status codes:
* * * 204 No Content – If successul
* * * 403 Forbidden

# JSON

Here are the JSON types mentions above. In the round brackets there are the respective data type.

## Type A

{
    "recipes" : [
        {
            "id": (number),
            "title" : (string)
        }
    ]
}

## Type B

{
    "ingredients" : [(string)]
}

## Type C

{
    "ingredients": [(string)]
}

## Type D

{
    "categories" : [
                                {
                                    "id": (number), 
                                    "name": (string)
                                 }
                              ]
}

## Type E

{
    additions: [(number)]
}

## Type F

{
   "id": (number), 
   "name": (string),
    "created": (string),
    "text": (string),
    "owner": (string),
    "creator": (string),
    "state": (string, values: ["new", "unchecked", "checked"])
}

## Type G

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

## Type X

{
    "id": (number),
    "creator": (string),
    "created": (string, date and time),
}

## Type Y
{
    "user": (string),
    "password": (string)
}

# Values for the end point /recipe/*ID*/addition/*AID*/state

The admissible values for these are:
* unchecked
* checked

# Keys for the end point: /recipe/*ID*

* title
