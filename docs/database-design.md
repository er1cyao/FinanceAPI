# Database Design


## Data Model
User
-----
id
username
passwordHash
email
createdAt

- Each user is unique and has a unique id
- username would be unique and have constraints:
    1. Made up of only numbers and letters
    2. Between 2 and 15 characters long
- password would have the requirements:
    1. Between 8 and 64 characters long
    2. Must include at least one uppercase letter
    3. Must include at least one special character

    - password would be stored in the database with passwordHash
- email would have constraints:
    1. Must have exactly one @ symbol
- createdAt would automatically be generated upon creation of account

Transaction
-----
id
description
amount
date
merchant
location
category
user

- Each user can have many transactions
- amount will be stored in USD format
- location would be similar to a description
- categories will be predefined

Category
----
id
name

- Each category will be predefined