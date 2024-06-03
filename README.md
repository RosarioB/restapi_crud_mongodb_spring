# restapi_crud_mongodb_spring

1. Start the docker compose with mongo:

`docker-compose -f docker/docker-compose-mongo.yml up -d`

It will create the database `mydb` in Mongo automatically.

Mongo express is at the URL: `http://localhost:8081/`

2. Start the Spring Boot application

## Interact with MongoDB with Mongosh

On Mac OS

1. Install Homebrew

2. Install the MongoDb client Mongosh

```
brew tap mongodb/brew
brew install mongosh
```

3. Run the MongoDB Client:

`mongosh --username admin --password admin --authenticationDatabase admin`

4. Switch to the `mydb` database:

`use mydb`

5. Create the products collection:

`db.createCollection('products')`

6. Import dummy data in the products collection:

```
db.products.insertMany([
  {
    "_id": "prod001",
    "name": "Classic Hamburger",
    "quantity": 100,
    "price": 9.00,
    "description": "A classic hamburger with lettuce, tomato, and cheese."
  },
  {
    "_id": "prod002",
    "name": "Cheeseburger",
    "quantity": 80,
    "price": 10.00,
    "description": "A juicy cheeseburger with double cheese and pickles."
  },
  {
    "_id": "prod003",
    "name": "Chicken Wings",
    "quantity": 200,
    "price": 8.00,
    "description": "Spicy chicken wings served with a side of ranch dressing."
  },
  {
    "_id": "prod004",
    "name": "Fish and Chips",
    "quantity": 50,
    "price": 13.00,
    "description": "Crispy battered fish served with a side of fries and tartar sauce."
  },
  {
    "_id": "prod005",
    "name": "Caesar Salad",
    "quantity": 40,
    "price": 7.00,
    "description": "Classic Caesar salad with croutons and parmesan cheese."
  },
  {
    "_id": "prod006",
    "name": "French Fries",
    "quantity": 150,
    "price": 4.00,
    "description": "Golden and crispy French fries served with ketchup."
  },
  {
    "_id": "prod007",
    "name": "Coca-Cola",
    "quantity": 500,
    "price": 2.00,
    "description": "Chilled can of Coca-Cola."
  },
  {
    "_id": "prod008",
    "name": "Beer",
    "quantity": 300,
    "price": 5.00,
    "description": "Pint of house lager beer."
  },
  {
    "_id": "prod009",
    "name": "Mojito",
    "quantity": 100,
    "price": 8.00,
    "description": "Refreshing mojito cocktail with mint and lime."
  },
  {
    "_id": "prod010",
    "name": "Chicken Sandwich",
    "quantity": 60,
    "price": 8.50,
    "description": "Grilled chicken sandwich with lettuce, tomato, and mayo."
  }
])
```

To Retrieve the documents of the products collection:

`db.products.find()`

To show all collections:

`show collections`

To delete the documents in the products collection run:

`db.products.deleteMany({})`

## Test Your APIs
You can test your API using tools like Postman or curl.

- GET all products: GET http://localhost:8085/api/products

- GET a product by ID: GET http://localhost:8085/api/products/{id}

- POST a new product: POST http://localhost:8085/api/products

```
{
    "id": "prod0027",
    "name": "My Hamburger",
    "quantity": 100,
    "price": 8.99,
    "description": "My hamburger"
}
```

- PUT update an product: PUT http://localhost:8085/api/products/{id}

```
{
    "id": "prod0027",
    "name": "My Hamburger Up",
    "quantity": 100,
    "price": 8.99,
    "description": "My hamburger Up"
}
```

- DELETE a product: DELETE http://localhost:8085/api/products/{id}


