# API BOOKS

### CREATE - POST
localhost:8080/books
```
    {
        "name": "Steve Jobs",
        "price": 200
    }
```  
    
### LIST - GET
localhost:8080/books
```
  [
    {
       "id": 1,
       "name": "Steve Jobs",
        "price": 100
    }
  ]      
```

### SEARCH BY ID - GET
localhost:8080/books/getBook?id=1
```
  [
    {
       "id": 1,
       "name": "Steve Jobs",
        "price": 100
    }
  ]      
```

### EDIT - PUT
localhost:8080/books?id=1
```  
    {
        "name": "Steve Jobs",
        "price": 100
    }  
```

### DELETE - DELETE
localhost:8080/books?id=1

